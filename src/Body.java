package src;
//File Name: Comment.java
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

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

public class Body {

    //--------------------------------------------------------------------------------------------------------


    private String[] words;
    public int value;
    private final int BASE_VALUE = 50;
    private int positive = 2;
    private int negative = -2;

    //--------------------------------------------------------------------------------------------------------


    public Body(String str){
        value = BASE_VALUE;

        if (str == null) {
            words = null;
            value = 0;
        }

        else {
            words = Sentence.breakDown(str);
            value = valueOfComment();
        }
    }

    //public static void main(String[] args){
    //    Comment test = new Comment("Good, I can feel your anger. Strike me down with all your hatred and your jounrey towards the dark side shall be complete");
    //    //System.out.println(test.valueOfComment());
    //    System.out.println("Value of test: " + test.value);
    //    Comment GoodComment = new Comment("good, amicable, yay, happy, cool, awesome");
    //    //System.out.println(GoodComment.valueOfComment());
    //    System.out.println("Value of GoodComment: " + GoodComment.value);
    //    Comment BadComment = new Comment("zaps, zealous, wrong, dead");
    //    System.out.println("Value of BadComment: " + BadComment.value);
    //}
}

//increase value range
//associate different score with adjective that describes it