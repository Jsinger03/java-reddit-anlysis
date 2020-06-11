package src;
// use the gson jar with -cp "gson-2.8.6.jar:."
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import src.RedditComment;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JsonParse {
	// change this variable below in case you are looking at another data set.
	private static String commentSource = "../2015.json";

	// public static void main(String[] args) {
	// 	HashMap<String, LinkedList<Pair>> test = parse();
	// 	for (String i : test.keySet()) {
	// 		System.out.println(i);
	// 		System.out.println(test.get(i));
	// 	}
	// }

	public static HashMap<String, LinkedList<Pair>> parse() {
		try {
			int count = 0;
			// Read the file based on commentSource
			File redditComments = new File(commentSource);
			Scanner reader = new Scanner(redditComments);

			// make an arraylist to store the comments
			HashMap<String, LinkedList<Pair>> complicatedLinkList = new HashMap<String, LinkedList<Pair>>();

			// intalize json convertor to convert json objects into java objects
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			Gson gson = builder.create();

			// read through all the comments until there is no more lines. 
			while (reader.hasNextLine()) { // very slow for 1.5 million comments
				String data = reader.nextLine(); // read the data on current line
				RedditComment comment = gson.fromJson(data, RedditComment.class); // convert json into
													// java object
				String[] wordsInSentence = Sentence.breakDown(comment.getBody()); // break down comment into words
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

				// count++;
			}
			return complicatedLinkList; // return the comments

		} catch (FileNotFoundException e) { // in case the file isn't found.
			System.out.println("File Not Found");
			e.printStackTrace();
			return null; // we need to return anything
		}

	}
}
