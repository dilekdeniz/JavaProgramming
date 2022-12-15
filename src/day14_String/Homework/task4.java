package day14_String.Homework;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
       /*
       4. Ask user to enter two words. Then add them together and print.
          But if the last letter if the first word and the first letter of the
        last letter is the same,
                  print that character once.

                Input:
        one
                eight
        Output:
        oneight
    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter word 1");
        String word1 = scan.next();
        System.out.println("Enter word 2");
        String word2 = scan.next();


        String first = word1.substring(0, word1.length() - 1);
        if (word1.substring(word1.length() - 1).equals(word2.substring(0,1))) {
            System.out.println(first + word2);
        }

    }
}


