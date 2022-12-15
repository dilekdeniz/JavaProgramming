package day13_String.homework;

import java.util.Scanner;
/*
5. Write a method that asks user to enter a string.
if the string is empty, print: string is empty
if the string has more than 3 characters, print the last three
characters
if the string has less than or equal 3 characters, print the
string itself
 */
public class task5 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("enter a string");
        String str=scan.nextLine();
        int StringLenght =str.length();
        if (StringLenght==0) {
            System.out.println("String is empty");
        } else if (StringLenght>3) {
            System.out.println(str.charAt(str.length() - 3) +""+ str.charAt(str.length() - 2) +""+ str.charAt(str.length() - 1));
        }else
            System.out.println(str);

       /* String str = "Dilek ";
        int s1 = str.length();
        if (s1 == 0) {
            System.out.println("String is empty");
        } else if (s1 > 3) {
            System.out.println(str.charAt(str.length() - 3) + str.charAt(str.length() - 2)  +str.charAt(str.length() - 1));
        } else {
            System.out.println(str);
*/

        }


    }



