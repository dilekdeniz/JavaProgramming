package replit;

import java.util.Scanner;

class EachCharacter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str) {
        int count = 0;
        String result = " ";
        for (int i = 0; i < str.length(); i++) {// i:index numbers of str (starting from 0)
            char ch = str.charAt(i);// ch characters of str
            if (str.indexOf(ch) == str.lastIndexOf(ch)) { //if the first and last index numbers of the character are same, meaning is uniq
                count++;
                result += ch + count;

            }

        }

        System.out.println(result);
        return result;
    }
}