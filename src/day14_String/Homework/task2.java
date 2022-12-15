package day14_String.Homework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        2. ask the user to enter a word. if the word ends with "ly", print
"really???" ,  otherwise, print "never mind"
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word =scan.next();
        int lastTwo=word.length()-2;
        if (word.substring(lastTwo).equals("ly")) {
            System.out.println("really???");
        }else{
            System.out.println("Never mind");
        }

    }
}
