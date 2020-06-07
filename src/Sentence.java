package src;//File Name: Sentence.java
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

import java.util.StringTokenizer;

public class Sentence {
    public String[] words;
    public Sentence(){
    }

    public String[] breakDown(String sentence){
        //needs to be modified so that it is split by commas as well as other punctuation
        //need to test it
        int counter = 0;
        StringTokenizer word;
        word = new StringTokenizer(sentence, ".,:;/?-_+={}[]|!@#$%^&*()~");
        while (word.hasMoreTokens())
        {
            words[counter] = word.nextToken();
            word.nextToken();
            counter++;
        }
        return words;
    }

    // public static void main(String[] args){
    //     String str = "how, do. YOU know? Your an idiot!Dumbass";
    //     Sentence sen1 = new Sentence();
    //     sen1.words = sen1.breakDown(str);
    //     for (int i = 0; i< sen1.words.length; i++)
    //     {
    //         System.out.println(sen1.words[i]);
    //     }
    // }
}
