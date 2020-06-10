// package src;
// use the gson jar with -cp "gson-2.8.6.jar:."
import com.google.gson.*; 
import java.io.*;
import java.util.Scanner;

public class JsonParse {
	private String commentSource = "../Comments.json"
	public static void main (String[] args) {
		
	}	

	public static void parse() {
		try {
			File redditComments = new File(commentSource);
			Scanner reader = new Scanner(redditComments);

			while (reader.hasNextLine()) {

				
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
