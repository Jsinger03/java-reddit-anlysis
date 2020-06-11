import java.util.Scanner;

public class BackEnd{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    String userName = input.nextLine();  // Read user input
    HashMap<String, LinkedList<Pair>> wordBank = JsonParse.parse();
    HashMap<String, double[]> subReddits = SubredditFacts.parse();

        if (wordBank.get(input) == null)
            return "Word not found";
        else {
            for (Pair:
                 wordBank) {
                System.out.println("This word is found on: " + wordBank.getSubreddit + " " + wordBank.getScore() + "times, and the average score of a comment on this subreddit is: " + ---parse through the next Hashmap and take the average value from there);
                //IMPORTANT: This stuff definitely doesnt work. The methods above are placeholders because I am unsure how we are to get the values
                //we need to parse through the LinkedList and take each name of a subreddit with its acompanying number of times where that word appeared
                //and print those, and then we need to use that name of the subreddit as the input for parsing the second Hash to get the average score of the subreddit
                //we should try to replace the Hash's with parsing the JSON file because it will be faster
                //this code here needs to be incorporated with the GUI such that all the printing appears there
                //Good luck to us
            }
        }
    }
}
