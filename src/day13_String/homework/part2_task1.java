package day13_String.homework;

import java.util.Scanner;

public class part2_task1 {
    public static void main(String[] args) {
        /*
        1. Create a class called Reverse, write a program that will reverse a
string.
Your program should reverse a string only 5 characters long.
If word is shorter, display message: "Too short!".
If word is longer, display message: "Too long!".
Otherwise, reverse this word and print out result into the console.
         */
     //   Scanner scan=new Scanner(System.in);
        String message ="Dilek";
        int totalChar=message.length();
        if (totalChar>5){
            System.out.println("To long!");

        } else if (totalChar<5) {
            System.out.println("To short!");

        }else {
            System.out.println(message);

        }

    }
}
