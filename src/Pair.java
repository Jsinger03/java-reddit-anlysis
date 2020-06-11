import java.util.Arrays;

public class Pair {
	private String subredditName;
	private int timesOfOccurrence;

	public Pair() {
	}

	public Pair(String subreddit) {
		this.subredditName = subreddit;
		timesOfOccurrence = 1;
	}


	public void setNewNum() {
		timesOfOccurrence++;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */

	@Override
	public String toString() {
		String result = "{ \"subredditName\": \"" + subredditName + "\", \"timesOfOccurrence\": " +  timesOfOccurrence + " }";
		return result;
	}

	/**
	 * @return the subredditName
	 */
	public String getSubredditName() {
		return subredditName;
	}

	/**
	 * @param subredditName the subredditName to set
	 */
	public void setSubredditName(String subredditName) {
		this.subredditName = subredditName;
	}

	/**
	 * @return the timesOfOccurrence
	 */
	public int getTimesOfOccurrence() {
		return timesOfOccurrence;
	}

	/**
	 * @param timesOfOccurrence the timesOfOccurrence to set
	 */
	public void setTimesOfOccurrence(int timesOfOccurrence) {
		this.timesOfOccurrence = timesOfOccurrence;
	}

}
