// package src;
// use the gson jar with -cp "gson-2.8.6.jar:."
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class JsonParse {
	private String commentSource = "../Comments.json";
	public static void main (String[] args) {
		parse();
	}	

	public ArrayList<RedditComment> parse() {
		try {
			int count = 0;
			File redditComments = new File(commentSource);
			ArrayList<RedditComment> comments = new ArrayList<RedditComment>();
			Scanner reader = new Scanner(redditComments);
			GsonBuilder builder = new GsonBuilder();
			builder.setPrettyPrinting();
			Gson gson = builder.create();
			while (reader.hasNextLine()) {
				String data = reader.nextLine();
				RedditComment comment = gson.fromJson(data, RedditComment.class);
				comments.add(comment);
				count++;
			}


		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		}

	}

}

// public class JsonParse { 
//    public static void main(String[] args) { 
//       String jsonString = "{\"name\":\"Mahesh\", \"age\":21}"; 
      
//       GsonBuilder builder = new GsonBuilder(); 
//       builder.setPrettyPrinting(); 
      
//       Gson gson = builder.create(); 
//       Student student = gson.fromJson(jsonString, Student.class); 
//       System.out.println(student);    
      
//       jsonString = gson.toJson(student); 
//       System.out.println(jsonString);  
//    } 
// } 
