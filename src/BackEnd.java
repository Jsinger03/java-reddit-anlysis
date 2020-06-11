import cs1.Keyboard;
import java.util.LinkedList;
import java.util.HashMap;
import java.util.Scanner;

public class BackEnd {
	public static void main(String[] args) {
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
															// ---parse
															// through
															// the
															// next
															// Hashmap
															// and
															// take
															// the
															// average
															// value
															// from
															// there/);
				// IMPORTANT: This stuff definitely doesnt work. The methods above are
				// placeholders because I am unsure how we are to get the values
				// we need to parse through the LinkedList and take each name of a subreddit
				// with its acompanying number of times where that word appeared
				// and print those, and then we need to use that name of the subreddit as the
				// input for parsing the second Hash to get the average score of the subreddit
				// we should try to replace the Hash's with parsing the JSON file because it
				// will be faster
				// this code here needs to be incorporated with the GUI such that all the
				// printing appears there
				// Good luck to us
			}
		}
	}
}
