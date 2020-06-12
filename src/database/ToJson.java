package database;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.LinkedList;
import java.util.TreeMap;

public class ToJson {
	public static void writeJSON(String fileName, String fileNameTwo) throws IOException {
		FileWriter writer = new FileWriter(fileName);
		TreeMap<String, LinkedList<Pair>> newJsonTXT = JsonParse.parse();
		for (String key : newJsonTXT.keySet()) {
			String trim = newJsonTXT.get(key).toString();
			trim = "{ \"word\": \"" + key + "\", \"data\":" + trim + " }\n";
			writer.write(trim);
		}
		writer.close();
		writer = new FileWriter(fileNameTwo);
		TreeMap<String, double[]> newJsonTXTtwo = SubredditFacts.parse();
		for (String key : newJsonTXTtwo.keySet()) {
			double[] dubs = newJsonTXTtwo.get(key);
			// String result = "[" + "{ \"TotatlComments\": " + dubs[0] + "}, { \"TotalScore\": " + dubs[1] + "}, {  \"AverageScore\": " + dubs[2] + "} ]}";
			String result = "{ \"subredditName\": \"" + key + "\", \"data\":" + "[" + dubs[0]+", " +  dubs[1] + ", "+ dubs[2] + "] }" + "\n";
			writer.write(result);
		}
		writer.close();
	}

	public static void main(String[] args) throws IOException {
		ToJson.writeJSON("../words.json", "../subredditData.json");
	}
}
