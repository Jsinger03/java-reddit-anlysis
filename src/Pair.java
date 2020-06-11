import java.util.Arrays;

public class Pair {
	private String subredditName;
	private int importantNum;

	public Pair(String subreddit) {
		this.subredditName = subreddit;
		importantNum = 1;
	}

	public String getName() {
		return subredditName;
	}

	public int getNum(int index) {
		return importantNum;
	}

	public void setNewNum() {
		importantNum++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		return "Pair [importantNum: " + importantNum + ", subredditName: " + subredditName + "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (subredditName == null) {
			if (other.subredditName != null)
				return false;
		} else if (!subredditName.equals(other.subredditName))
			return false;
		return true;
	}
}
