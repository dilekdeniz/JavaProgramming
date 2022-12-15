package day13_String.homework;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
/*
4. write a program that can return the initials of the user
ex:
cybertek
school
output:
C.S
Note: Pay attention to the example output
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name" );
        String firstName= scan.next();
        char first= firstName.charAt(0) ;
        System.out.println("Enter your last name");
        String lastNAme =scan.next();
        char last= lastNAme.charAt(0);
        System.out.println(first+"."+last);


    }
}
