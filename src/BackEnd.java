import java.util.HashMap;

public class BackEnd {
	public static String runner(String key) {
		// Scanner input = new Scanner(System.in); // Create a Scanner object
		// String userName = input.nextLine(); // Read user input
		// String fullString = Keyboard.readString();
		HashMap<String, Pair[]> wordBank = RealData.getWords();
		HashMap<String, double[]> subReddits = RealData.getSubredditData();
		Pair[] results = wordBank.get(key);
		// System.out.println(results[0].getSubredditName());
		// if the word is not found a message saying that it is missing should be
		// returned / printed
		// IDK which
		String result = "";
		if (results == null)
			result = "Word not found - Try another!";
		else {
			int count = 0;
			for (int i = 0; i < results.length && count < 20; i++) {
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
