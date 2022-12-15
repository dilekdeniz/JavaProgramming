package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //String methods:
        //
        //		toCharArray(): retrusn a char array
        //				"abc".toCharArray() ====> {'a', 'b', 'c'}
      String str1="acdb";
      String str2="dbca";
        // write a program that can check if str1 & str2 are build out same characters

        char[]ch1=str1.toCharArray(); // katraktere ceviriyot
        char[]ch2= str1.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1); // karakteri kucukten buyuge siraya koyuyor
        Arrays.sort(ch2);
        System.out.println();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));
boolean anagram=Arrays.equals(ch1,ch2);
            System.out.println("anagraam="+anagram);
        }



    }
