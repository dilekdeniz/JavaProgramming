package replit;

import java.util.Scanner;

public class PrefixAgain {
    public static void main(String[] args) {
        /*
        Use String methods to determine if the prefix is found again somewhere later in the String.
        A prefix is the set of characters in the beginning of the String. To determine how long the prefix is,
        use the given n value. For example, if n is 2, the prefix is the first two characters, so you would check
         if the String from the 3rd character until the end has those two character repeating anywhere. Output the
         result as a boolean value, true or false.
Main topics: String manipulation, Scanner, methods, primitive datatypes, concatenation
         */
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int n = scan.nextInt();
        String result="";


        System.out.println(str.substring(n).contains(str.substring(0,n)));
        }






    }

