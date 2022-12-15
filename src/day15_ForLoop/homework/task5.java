package day15_ForLoop.homework;

import java.util.Scanner;
import java.util.SortedMap;

public class task5 {
    public static void main(String[] args) {
        /*
        5. write a program that can retive the digits, letters and special
characters from a string
Ex:
input:
mn@#123Ab!
output:
letters: mnAb
digits: 123
special chars: @#!
         */
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = input.next();

        String letters= "";
        String digits= "";
        String specialChar= "";

        for(int i=0 ; i<str.length() ; i++){

            if ((str.charAt(i)>='a'&&str.charAt(i)<='z') || (str.charAt(i)>='A'&&str.charAt(i)<='Z') ){
                letters += str.charAt(i);
            } else if (str.charAt(i)>='0'&&str.charAt(i)<='9') {
                digits += str.charAt(i);
            }else {
                specialChar += str.charAt(i);
            }
        }

        System.out.println("letters      :"+letters);
        System.out.println("digits       :"+digits);
        System.out.println("special chars:"+specialChar);

        input.close();

            
        }
    }
