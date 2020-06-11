import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;

public class ToJson {
	public static void writeJSON(String fileName, String fileNameTwo) throws IOException {
		// FileWriter writer = new FileWriter(fileName);
		// HashMap<String, LinkedList<Pair>> newJsonTXT = JsonParse.parse();
		// for (String key : newJsonTXT.keySet()) {
		// String trim = newJsonTXT.get(key).toString();
		// String result = "{\"" + key + "\": " + trim.substring(1, trim.length() - 1) +
		// "}" + "\n";
		// writer.write(result);
		// }
		// writer.close();
		FileWriter writer = new FileWriter(fileNameTwo);
		HashMap<String, double[]> newJsonTXTtwo = SubredditFacts.parse();
		for (String key : newJsonTXTtwo.keySet()) {
			double[] dubs = newJsonTXTtwo.get(key);
			String result = "{\"" + key + "\": " + "{ \"TotalComments\": " + dubs[0] + ", \"TotalScore\": "
					+ dubs[1] + ", \"AverageScore\": " + dubs[2] + "}}" + "\n";
			writer.write(result);
		}
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		ToJson.writeJSON("../words.json", "../subredditData.json");
	}
}
