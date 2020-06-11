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
			trim = trim.substring(1, trim.length() - 1);
			trim = "{\"" + key + "\": " + trim + "}" + "\n";
			writer.write(trim);
		}
		writer.close();
		writer = new FileWriter(fileNameTwo);
		TreeMap<String, double[]> newJsonTXTtwo = SubredditFacts.parse();
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

	// public static TreeMap<String, LinkedList<Pair>> sortHash(HashMap<String, LinkedList<Pair>> table) {
	// 	TreeMap<String, LinkedList<Pair>> sortedMap = new TreeMap<String, LinkedList<Pair>>();
	// 	sortedMap.putAll(table);
	// 	return sortedMap;

	// }

	// public static TreeMap<String, double[]> sortHashTwo(HashMap<String, double[]> table) {
	// 	TreeMap<String, double[]> sortedMap = new TreeMap<String, double[]>();
	// 	sortedMap.putAll(table);
	// 	return sortedMap;

	// }
}
