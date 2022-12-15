package day14_String.Homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        Tasks:
1. Ask user to enter two words. Print first word without its first
character
then print the second word without its first character.
Input:
apple
banana
Output:
ppleanana
*/
  Scanner scan=new Scanner(System.in);
        System.out.println("Enter word 1");
        String word1=scan.next();
        System.out.println("Enter word 2");
        String word2=scan.next();

        String beginning= word1.substring(1);
        String ending=word2.substring(1);

        System.out.print(beginning);
        System.out.println(ending);

    }
}
