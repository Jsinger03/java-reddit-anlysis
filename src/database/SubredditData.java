package database;

public class SubredditData {
	private String subredditName;
	private double[] data;

	public SubredditData() {
		
	}

	/**
	 * @return the subRedditName
	 */
	public String getSubredditName() {
		return subredditName;
	}

	/**
	 * @param subRedditName the subRedditName to set
	 */
	public void setSubRedditName(String subredditName) {
		this.subredditName = subredditName;
	}

	/**
	 * @return the data
	 */
	public double[] getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(double[] data) {
		this.data = data;
	}

}
