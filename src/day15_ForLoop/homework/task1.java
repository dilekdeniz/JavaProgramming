package day15_ForLoop.homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*
        1. Write a program that can return the sum of even numbers between 1
to 100
         */

        int sum = 0;

        for (int i = 1; i < 101 ; i++){

            if( i % 2 == 0){
                // 2,4,6,8,....

                sum +=i;

                // Addition single operator

            }
        }

        System.out.println("sum = " + sum);
    }

        }



