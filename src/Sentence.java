// package src;
//File Name: Sentence.java
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

//import java.util.StringTokenizer;

public class Sentence {
    //public String[] words;
    public Sentence(){
    }

//    public String[] breakDown(String sentence){
//        //needs to be modified so that it is split by commas as well as other punctuation
//        //need to test it
//        int counter = 0;
//        StringTokenizer word;
//        word = new StringTokenizer(sentence, ".,:;/?-_+={}[]|!@#$%^&*()~");
//        while (word.hasMoreTokens())
//        {
//            words[counter] = word.nextToken();
//            word.nextToken();
//            counter++;
//        }
//        return words;
//    }
    public static String[] breakDown(String sentence){
        String[] words = sentence.trim().split("\\W"); //this regex takes out any non letter character
        String space = " ";
        String helper = "";
        for (int i = 0; i < words.length ; i++){
            helper = helper + words[i] + " ";
            //System.out.println(helper);
            //for testing purposes^
        }
        words = helper.split("\\s+|,\\s*|\\.\\s*");
        //System.out.println(words.length);
        return words;
        //note: any character outside of letters and numbers will be lost
    }

     public static void main(String[] args){
         String str = "how,  1 do. YOU know? What! IS  Life?!";
         String[] sen1;
         sen1 = Sentence.breakDown(str);
         for (int i = 0; i< sen1.length; i++)
         {
             System.out.println(sen1[i]);
         }
     }

    // NOTE:
    //press the hammer to build it, arrow to run
}
