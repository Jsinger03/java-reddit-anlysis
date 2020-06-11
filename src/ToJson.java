package src;
//File Name: ToJson.java
//Name: Julian Singer
//OSIS: N / A

//Description:
/*
 */
//Known bugs:
/*
 */
//Learned:
/*
 */

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ToJson {
    String jsonString = ComplicatedLinkedList.toString();

    {
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        Gson gson = builder.create();
        --- ---- = gson.fromJson(jsonString, ----.class);
        jsonString = gson.toJson(-----);
    }



}

