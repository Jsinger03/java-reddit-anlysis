import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class RealData {
	private static String wordDataFile = "../words.json";
	private static String subredditDataFile = "../subredditData.json";

	public static HashMap<String, LinkedList<Pair>> getWords() {
		try {
			File everyWord = new File(wordDataFile);
			Scanner reader = new Scanner(everyWord);
			// make a Hashmap since it is faster than a treemap
			HashMap<String, LinkedList<Pair>> wordData = new HashMap<String, LinkedList<Pair>>();

			while (reader.hasNext()) {
				String data = reader.nextLine();

			}

		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
			return null;

		}

	}

	public static HashMap<String, LinkedList<Pair>> getSubredditData() {

	}
}
