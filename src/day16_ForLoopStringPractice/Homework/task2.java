package day16_ForLoopStringPractice.Homework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        2. Write a program that asks user to enter a string and a char, the
returns the frequency of the char from the given string
Ex:
inputs:
str = "aabcccd";
char = 'c';
output: 3
inputs:
"Java programming language"
'g'
output: 4
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a string");
        String num = scan.nextLine();
        System.out.println("write a character");
        String ch = scan.next();
        int frequency = 0;
        for (int i = 0; i < num.length(); i++) {
            String each = ""+num.charAt(i);
            if (each.equalsIgnoreCase(ch)) {
            frequency++;// frewuency+=1
            }
        }
        System.out.println(frequency);
    }
}
