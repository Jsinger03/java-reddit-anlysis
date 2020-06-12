package database;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeMap;

public class JsonParse {
	// change this variable below in case you are looking at another data set.
	private static String commentSource = "../../2015.json";

	public static TreeMap<String, LinkedList<Pair>> parse() {
		try {
			// Read the file based on commentSource
			File redditComments = new File(commentSource);
			Scanner reader = new Scanner(redditComments);

			// make an arraylist to store the comments
			TreeMap<String, LinkedList<Pair>> complicatedLinkList = new TreeMap<String, LinkedList<Pair>>();

			// intalize json convertor to convert json objects into java objects
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			Gson gson = builder.create();

			// read through all the comments until there is no more lines.
			// use count to make use of a small data set for testing purposes
			while (reader.hasNextLine()) { // very slow for 1.5 million comments
				String data = reader.nextLine(); // read the data on current line
				RedditComment comment = gson.fromJson(data, RedditComment.class); // convert json into
													// java object
				String[] wordsInSentence = Sentence.breakDown(comment.getBody()); // break down comment
													// into words
				Pair newData = new Pair(comment.getSubreddit()); //
				for (int i = 0; i < wordsInSentence.length; i++) {
					String temp = wordsInSentence[i];

					// checks if there is an occurrence of that word
					// if not it gets added to the link list
					if (complicatedLinkList.containsKey(temp)) {
						int check = complicatedLinkList.get(temp).indexOf(newData);
						if (check != -1) {
							complicatedLinkList.get(temp).get(check).setNewNum();
						} else
							complicatedLinkList.get(temp).add(newData);
					} else {
						LinkedList<Pair> newList = new LinkedList<Pair>();
						newList.add(newData);
						complicatedLinkList.put(temp, newList);
					}
				}
			}

			return complicatedLinkList; // return the comments
		} catch (FileNotFoundException e) { // in case the file isn't found.
			System.out.println("File Not Found");
			e.printStackTrace();
			return null; // we need to return anything
		}

	}
}
