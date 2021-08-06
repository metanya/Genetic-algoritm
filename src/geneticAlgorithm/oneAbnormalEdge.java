package geneticAlgorithm;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class oneAbnormalEdge implements GeneticAlgorithm {

	private static final int MAXIMUM_ITERATION = 300;
	private static final int NUMBERS_OF_COLORS = 3;

	public Solution getBestSolution(Graph g) throws Exception {
		if (g == null) {
			throw new Exception("The Graph is not exist please add one.");
		}
		List<Solution> solutions = createCollectionOfSolutions(30, g);
		return findBestSolution(g, solutions);
	}

	@Override
	public List<Solution> createCollectionOfSolutions(int solutionsSize, Graph g) {
		assert g != null && solutionsSize > 0;
		List<Solution> fitness = new ArrayList<Solution>();
		int verticesSize = g.verticesSize();
		IntStream.range(0, solutionsSize).forEach(i -> {
			ArrayList<Integer> newSolution = getNewSolution(verticesSize);
			int rate = getFitnessFunctionRate(newSolution, g);
			fitness.add(new Solution(newSolution, rate));
		});
		sort(fitness);
		return fitness;
	}

	private ArrayList<Integer> getNewSolution(int verticesSize) {
		assert verticesSize > 0;
		SecureRandom rand = new SecureRandom();
		ArrayList<Integer> newSolution = new ArrayList<Integer>();
		for (int cell = 0; cell < verticesSize; cell++) {
			newSolution.add(rand.nextInt(NUMBERS_OF_COLORS));
		}
		return newSolution;
	}

	public int getFitnessFunctionRate(List<Integer> fitness, Graph g) {
		assert g != null && fitness != null && fitness.size() == g.verticesSize();
		int rate = 0;
		List<List<Vertex>> edges = g.getEdges();
		for (List<Vertex> edge : edges) {
			if (edge.size() >= 2) {
				int vertexIndex = g.getVertexIndex(edge.get(0));
				int integer2 = fitness.get(vertexIndex);
				vertexIndex = g.getVertexIndex(edge.get(1));
				int integer = fitness.get(g.getVertexIndex(edge.get(1)));
				if (isColorEqual(integer2, integer)) {
					rate++;
				}
			}
		}
		return Math.abs(rate - 1);
	}

	public boolean isColorEqual(int colorOne, int colorTwo) {
		assert Math.max(0, colorOne) == Math.min(colorOne, 100) && Math.max(0, colorTwo) == Math.min(colorTwo, 100);
		if (colorOne == colorTwo) {
			return true;
		}
		return false;
	}

	@Override
	public Solution findBestSolution(Graph g, List<Solution> fitness) {
		assert g != null && fitness != null && fitness.size() == g.verticesSize() : "";
		for (int iteration = 0; stopCondition(iteration); iteration++) {
			if (isTargetSolution(fitness)) {
				return fitness.get(0);
			}
			removeWorstSolutions(fitness);
			mutationSolution(fitness, g);
			crossoverSolutions(fitness, g);
			sort(fitness);
		}
		return fitness.get(0);
	}

	@Override
	public boolean isTargetSolution(List<Solution> fitness) {
		assert fitness != null && fitness.size() > 0;
		if (fitness.get(0).getScore() == 0) {
			System.out.println(fitness.get(0).toString());
			return true;
		}
		return false;
	}

	@Override
	public boolean stopCondition(int iteration) {
		assert iteration > 0;
		return iteration < MAXIMUM_ITERATION;
	}

	public void sort(List<Solution> list) {
		assert list != null && list.size() > 0;
		list.sort((Solution s1, Solution s2) -> Integer.compare(s1.getScore(), s2.getScore()));
	}

	@Override
	public void removeWorstSolutions(List<Solution> fitness) {
		assert fitness != null && fitness.size() > 0;
		int size = fitness.size() - 1;
		for (int element = 0; element < NUMBER_OF_ELEMENTS_TO_REMOVE; element++) {
			fitness.remove(size - element);
		}
	}

	@Override
	public void mutationSolution(List<Solution> fitness, Graph g) {
		assert g != null && fitness != null && fitness.size() == g.verticesSize();
		List<Integer> firstBestSolution = fitness.get(0).getSolution();
		SecureRandom rand = new SecureRandom();
		int index = rand.nextInt(firstBestSolution.size());
		int color = rand.nextInt(NUMBERS_OF_COLORS);
		ArrayList<Integer> newSolution = new ArrayList<Integer>(firstBestSolution);
		newSolution.set(index, color);
		fitness.add(new Solution(newSolution, getFitnessFunctionRate(newSolution, g)));
	}

	@Override
	public void crossoverSolutions(List<Solution> fitness, Graph g) {
		assert g != null && fitness != null && fitness.size() == g.verticesSize();
		List<Integer> firstBestsSolution = fitness.get(0).getSolution();
		List<Integer> secondBestSolution = fitness.get(1).getSolution();
		SecureRandom rand = new SecureRandom();
		int index = rand.nextInt(firstBestsSolution.size());

		fitness.add(addCrossoverSolution(g, secondBestSolution, firstBestsSolution, index));
		fitness.add(addCrossoverSolution(g, firstBestsSolution, secondBestSolution, index));
	}

	public Solution addCrossoverSolution(Graph g, List<Integer> solutionOne, List<Integer> solutionTwo, int index) {
		List<Integer> newList = Stream
				.concat(solutionTwo.subList(0, index).stream(), solutionOne.subList(index, solutionOne.size()).stream())
				.collect(Collectors.toList());
		return new Solution(newList, getFitnessFunctionRate(newList, g));
	}

}
