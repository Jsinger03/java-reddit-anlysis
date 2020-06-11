public class Sentence {
//this is meant to break a sentence, or in this case a Reddit Comment, down into its individual words
	public static String[] breakDown(String sentence) {
		String[] words = sentence.trim().split("\\W"); // this regex takes out any non letter character
		String helper = "";
		for (int i = 0; i < words.length; i++) {
			helper = helper + words[i] + " ";
		}
		words = helper.split("\\s+|,\\s*|\\.\\s*");
		return words;
		// note: any character outside of letters and numbers will be lost
	}

}
