package day14_String.Homework;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*
        5. Ask user to enter a word,
if the word starts with digits, print "first character is digit"
if the word starts with uppercase letters, print "first character
is lowercase letter"
if the word starts with lowercase letters, print "first character
is uppercase letter"
if the word starts with special characters, print "first character
is special character"
HINT: 1. you need charAt() method
6. Ascii Table
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=scan.next();
        char firstChar=word.charAt(0);
        String result="";
        if (firstChar>='0'&& firstChar<='9'){
            result="First character is digit";
        } else if (firstChar>='a' &&firstChar<='z') {
            result = "First char is lower case letter";
        } else if (firstChar>='A'&& firstChar<='Z') {
            result = "First char is uppercase letter";
        }else {
            result= "Special Character";

        }
        System.out.println(result);
    }


    }
