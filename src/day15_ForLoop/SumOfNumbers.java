package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum= 0;
        for (int i = 1; i < 101; i++) {//i=1,2,3,4,5....100 (shortcut=fori)
            sum += i;
        }
            System.out.print(sum);
        System.out.println("----------------");
        int total=0;
        for (int i = 0; i <5 ; i++) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number");
            total += scan.nextInt();

        }
        System.out.println("total "+total);

        }





        }





