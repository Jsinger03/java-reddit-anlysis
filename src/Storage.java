// package src;
//File Name: Storage.java
//Name: Julian Singer
//OSIS: N/A

//Description:
/*
 */
//Known bugs:
/*
 */
//Learned:
/*
 */

import java.util.ArrayList;

public class Storage {
//purpose: store all of the reddit comments
    public ArrayList<String[]> subredditName = new ArrayList<>();
    //make the arraylist contain all the comments, divided into words
    public int[] subredditName_Bucket = new int[subredditName.size()];
}
