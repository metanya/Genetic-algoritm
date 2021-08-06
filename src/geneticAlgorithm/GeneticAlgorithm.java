package geneticAlgorithm;

import java.util.List;

public interface GeneticAlgorithm {

	static final int NUMBER_OF_ELEMENTS_TO_REMOVE = 3;
	
	public List<Solution> createCollectionOfSolutions(int solutionsSize, Graph g);

	public Solution findBestSolution(Graph g, List<Solution> fitness);

	public boolean isTargetSolution(List<Solution> fitness);

	public boolean stopCondition(int iteration);

	public void removeWorstSolutions(List<Solution> fitness);

	public void mutationSolution(List<Solution> fitness, Graph g);

	public void crossoverSolutions(List<Solution> fitness, Graph g);
}
