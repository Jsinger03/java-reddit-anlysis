package src;
// use the gson jar with -cp "gson-2.8.6.jar:."
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import src.RedditComment;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonParse {
	private static String commentSource = "../2015.json";

	public static void main(String[] args) {
		ArrayList<RedditComment> test = parse();
		for (RedditComment comment : test)
			System.out.println(comment);
	}

	public static ArrayList<RedditComment> parse() {
		try {
			// Read the file based on commentSource
			File redditComments = new File(commentSource);
			Scanner reader = new Scanner(redditComments);

			// make an arraylist to store the comments
			ArrayList<RedditComment> comments = new ArrayList<RedditComment>();

			// intalize json convertor to convert json objects into java objects
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			Gson gson = builder.create();

			// read through all the comments until there is no more lines.
			while (reader.hasNextLine()) {
				String data = reader.nextLine(); // read the data on current line
				RedditComment comment = gson.fromJson(data, RedditComment.class); // convert json into
													// java object
				comments.add(comment); // add the comment into the comment arraylist
			}
			return comments; // return the comments

		} catch (FileNotFoundException e) { // in case the file isn't found.
			System.out.println("File Not Found");
			e.printStackTrace();
			return null; // we need to return anything
		}

	} 

}
