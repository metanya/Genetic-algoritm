package geneticAlgorithm;

import java.util.List;

public class Solution {
	private List<Integer> solution;
	private Integer score;

	public Solution(List<Integer> solution, Integer score) {
		this.solution = solution;
		this.score = score;
	}

	public List<Integer> getSolution() {
		return solution;
	}
	public void setSolution(List<Integer> solution) {
		this.solution = solution;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((score == null) ? 0 : score.hashCode());
		result = prime * result + ((solution == null) ? 0 : solution.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Solution other = (Solution) obj;
		if (score == null) {
			if (other.score != null)
				return false;
		} else if (!score.equals(other.score))
			return false;
		if (solution == null) {
			if (other.solution != null)
				return false;
		} else if (!solution.equals(other.solution))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Solution: [solution=" + solution + ", score=" + score + "]\n";
	}
	
	
}
