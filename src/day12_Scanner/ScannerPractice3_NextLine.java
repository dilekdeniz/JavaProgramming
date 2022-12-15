package day12_Scanner;

import java.nio.channels.Pipe;
import java.util.Scanner;
import java.util.SortedMap;

public class ScannerPractice3_NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Wooden SpoonEnter
        System.out.println("Enter your full name");
       String fullName=input.nextLine(); //Enter

        System.out.println("Enter your programming language ");
        String programming=input.nextLine();//Java programming languageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //24

            input.nextLine();//Enter

        System.out.println("Enter your school name:");
        String schoolName= input.nextLine();


        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);



    }
}
