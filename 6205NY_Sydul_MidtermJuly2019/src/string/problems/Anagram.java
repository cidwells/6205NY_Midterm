package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String a = "Tab";
        String b = "Bat";
        String c= "Tarp";
        String d ="Part";
        System.out.println(isAnigram(a,b));
        System.out.println(isAnigram(c,d));
        System.out.println(isAnigram(a,d));
        System.out.println(isAnigram(b,c));
    }
    public static boolean isAnigram(String first,String second){
        if(first.length()!= second.length()){
            return false;
        }else
        first = first.toLowerCase();
        second = second.toLowerCase();
        char [] holdArray = first.toCharArray();
        char[]  tempArray = second.toCharArray();
        Arrays.sort(holdArray);
        Arrays.sort(tempArray);
        return Arrays.equals(holdArray,tempArray);
    }
}
