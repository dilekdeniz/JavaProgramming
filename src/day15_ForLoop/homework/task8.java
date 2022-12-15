package day15_ForLoop.homework;

public class task8 {
    public static void main(String[] args) {
        /*
        8. Write a program that can check if the given String is palindrome
Ex:
input:
Level
output:
true
input:
Anna
output:
true
         */
      String word= "Anna";
      String  reserved="";
        for (int i = word.length()-1; i >=0; i--) {
            reserved+=word.charAt(i);
        }
        boolean isPalindrome= word.equalsIgnoreCase(reserved);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
