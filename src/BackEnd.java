import cs1.Keyboard;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class BackEnd {
	public static void runner(){
		// Scanner input = new Scanner(System.in); // Create a Scanner object
		// String userName = input.nextLine(); // Read user input
		String fullString = Keyboard.readString();
		HashMap<String, Pair[]> wordBank = RealData.getWords();
		HashMap<String, double[]> subReddits = RealData.getSubredditData();
		Pair[] results = wordBank.get(fullString);
		// System.out.println(results[0].getSubredditName());
		// if the word is not found a message saying that it is missing should be
		// returned / printed
		// IDK which
		if (results == null)
			System.out.println("Word not found");
		else {
			for (Pair dataSet : results) {
				String name = dataSet.getSubredditName();
				System.out.println("This word is found on: " + name + " and is found: "
						+ dataSet.getTimesOfOccurrence()  //score
						+ "times, and the average score of a comment on this subreddit is: " + 

						subReddits.get(name)[2]);
		}
	}
}
