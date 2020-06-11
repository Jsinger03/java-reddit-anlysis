import java.util.HashMap;

public class BackEnd {
	static private HashMap<String, Pair[]> wordBank = RealData.getWords();
	static private HashMap<String, double[]> subReddits = RealData.getSubredditData();

	public String runner(String key) {
		Pair[] results = wordBank.get(key);
		// if the word is not found a message saying that it is missing should be
		// returned / printed
		String result = "";
		if (results == null)
			result = "Word not found - Try another!";
		else {
			int count = 0;
			for (int i = 0; i < results.length && count < 15; i++) {
				Pair dataSet = results[i];
				String name = dataSet.getSubredditName();
				result += "This word is found on the Subreddit: " + name + " and is found: "
						+ dataSet.getTimesOfOccurrence()
						+ " times, and the average score of a comment on this subReddit is: "
						+ subReddits.get(name)[2] + "\n";
			}
		}
		return result;
	}
}
