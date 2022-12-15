package day13_String.homework;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a three letter word");
        String word=scan.next();
        int s1=word.length();
        char seconCharacter=word.charAt(1);
        if (s1==3) {
            if (seconCharacter == 'a') {
                System.out.println("Cool Word");
            } else {
                System.out.println("Okay Word");
            }
        } else if (s1>3) {
            System.out.println("Too long");
        }else {
            System.out.println("tToo short");
        }


        }
    }
