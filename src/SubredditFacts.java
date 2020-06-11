import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import src.RedditComment;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SubredditFacts{
    // change this variable below in case you are looking at another data set.
    private static String commentSource = "../2015.json";

     public static void main(String[] args) {
     	HashMap<String, LinkedList<PairSubReddit>> test = parse();
     	for (String i : test.keySet()) {
     		System.out.println(i);
     		System.out.println(test.get(i));
     	}
     }

    public static HashMap<String, LinkedList<PairSubReddit>> parse() {
        try {
            int count = 0;
            // Read the file based on commentSource
            File redditComments = new File(commentSource);
            Scanner reader = new Scanner(redditComments);

            // make an arraylist to store the comments
            HashMap<String, LinkedList<PairSubReddit>> complicatedLinkList = new HashMap<String, LinkedList<PairSubReddit>>();

            // intalize json convertor to convert json objects into java objects
            GsonBuilder builder = new GsonBuilder();
            builder.setPrettyPrinting();
            Gson gson = builder.create();

            // read through all the comments until there is no more lines.
            // use count to make use of a small data set for testing purposes
            while (reader.hasNextLine() && count < 100) { // very slow for 1.5 million comments
                String data = reader.nextLine(); // read the data on current line
                RedditComment comment = gson.fromJson(data, RedditComment.class); // convert json into
                // java object
                String temp = comment.getSubreddit(); // break down comment into words
                PairSubReddit newData = new PairSubReddit(comment); //
                    if (complicatedLinkList.containsKey(temp)) {
                        int check = complicatedLinkList.get(temp).indexOf(newData.getSubreddit());
                        if (check != -1) {
                            complicatedLinkList.get(temp).get(check).setNewNum(comment.getScore());
                        } else
                            complicatedLinkList.get(temp).add(newData.getSubreddit());
                    } else {
                        LinkedList<PairSubReddit> newList = new LinkedList<PairSubReddit>();
                        newList.add(newData);
                        complicatedLinkList.put(temp, newList);
                    }
                }

                count++;
            }

        catch (FileNotFoundException e) { // in case the file isn't found.
            System.out.println("File Not Found");
            e.printStackTrace();
            return null; // we need to return anything
        }

    }
}