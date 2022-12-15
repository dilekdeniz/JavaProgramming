package day13_String.homework;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //   1. write a program that asks user to enter a sentence.
        //   then print the first & last characters of the sentence
        String sentence = "I,m trying to learn String";
        int totalChars = sentence.length();
        char firstChar = sentence.charAt(0);
        char lastChar = sentence.charAt(sentence.length() - 1);
        System.out.println("firstChar = " + firstChar);
        System.out.println("lastChar = " + lastChar);

        System.out.println("------------------------------");

        /*
        2. write a program that asks user to enter two strings, and print out the
longest string

         */
        System.out.println("Enter two strings");
        String name = scan.next();
        String name2 = scan.next();
        int totalCharOfName = name.length();
        int totalCharOfName2 = name2.length();
        if (totalCharOfName2 > totalCharOfName) {
            System.out.println("the longest one is " + name2);
        } else {
            System.out.println("the longest one is " + name);
            System.out.println("---------------------------------");
/*
3. write a program that can check if the first and last characters of the
string are same
ex:
level
output:
same
 */
            /* String word= "Fenerbahce";
             */


        }
    }
}