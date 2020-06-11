import java.util.Arrays;

public class Pair {
	private String subredditName;
	private int[] importantNums;

	public Pair(String subreddit) {
		this.subredditName = subreddit;
		importantNums = new int[3];
	}

	public String getName() {
		return subredditName;
	}

	public int[] getNums() {
		return importantNums;
	}

	public int getNum(int index) {
		return importantNums[index];
	}

	public void setNewNum(int index, int data) {
		importantNums[index] = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Pair [importantNums: " + Arrays.toString(importantNums) + ", subredditName: " + subredditName + "]";
	}
}
