package geneticAlgorithm;

public class ActivateGeneticAlgorithm {
	public static void main(String[] args) throws Exception {
		Graph g = new Graph().createGraph();
		Solution bestSolution = new oneAbnormalEdge().getBestSolution(g);
		
		System.out.println(bestSolution.getScore());	
	}
}
