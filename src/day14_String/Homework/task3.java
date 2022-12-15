package day14_String.Homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
//3. Ask user to enter a word. If the work starts with x, print the
//word without x.
//Input:
//xcode
//Output:
//code
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter a word");
      String word= scan.next();
      if (word.startsWith("x")){
          System.out.println(word.substring(1));
      }




    }
}
