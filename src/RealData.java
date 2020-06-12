import database.*;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class RealData {
	// for the sake of this we will only do 15k words
	// change below to see what files our functions will look at
	private static String wordDataFile = "../random15K.json";
	private static String subredditDataFile = "../subredditData.json";

	public static HashMap<String, Pair[]> getWords() {
		try {
			File everyWord = new File(wordDataFile);
			Scanner reader = new Scanner(everyWord);
			// make a Hashmap since it is faster than a treemap
			HashMap<String, Pair[]> wordData = new HashMap<String, Pair[]>();

			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			String data;
			while (reader.hasNext()) {
				data = reader.nextLine();
				WordsData dataSet = gson.fromJson(data, WordsData.class);
				wordData.put(dataSet.getWord(), dataSet.getData());
			}
			return wordData;
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			return null;

		}

	}

	// public static void main(String[] args) {
	// 	HashMap<String, Pair[]> test = RealData.getWords();
	// 	Pair[] bruh =  test.get("The");
	// 	String name = bruh[0].getSubredditName();
	// 	System.out.println(name);
	// 	// for (String key : test.keySet()) {
	// 	// 	System.out.print(key + " ");
	// 	// 	for (double dataSet : test.get(key)) {
	// 	// 		System.out.print(dataSet + "\n");
	// 	// 	}
	// 	// }
	// }

	public static HashMap<String, double[]> getSubredditData() {
		try {
			File subData = new File(subredditDataFile);
			Scanner reader = new Scanner(subData);
			// make a Hashmap since it is faster than a treemap
			HashMap<String, double[]> subs = new HashMap<String, double[]>();

			GsonBuilder builder = new GsonBuilder();
			Gson gson = builder.create();
			String data;
			while (reader.hasNext()) {
				data = reader.nextLine();
				SubredditData sub = gson.fromJson(data, SubredditData.class);
				subs.put(sub.getSubredditName(), sub.getData());

			}
			return subs;
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			return null;

		}

	}
}
