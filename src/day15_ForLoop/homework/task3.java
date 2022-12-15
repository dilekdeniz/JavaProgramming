package day15_ForLoop.homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
      /*
        3. write a program that can calculate the sum of all numbers between

        1 to any given number
        ex:
        input: 100
        output: 5050
        input: 50
        output: 1275
        */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number ");
         int input=  scan.nextInt();
        int sum=0;
        for (int i = 1; i <input; i++) {
            sum += i;
        }
            System.out.println(sum);
        }
    }

