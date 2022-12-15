package replit;

import java.util.Scanner;

public class findTheLenght {
    public static void main(String[] args) {
        //DO NOT TOUCH BELOW
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = input.next();
        int totalChar = word.length();
        System.out.println("Length is: " + totalChar);
    }
}