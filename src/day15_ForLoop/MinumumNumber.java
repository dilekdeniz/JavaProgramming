package day15_ForLoop;

import java.util.Scanner;

public class MinumumNumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min =2147483647 ; //max integar

        for(int i=10;i<15;i++){
            System.out.print("Enter a number");
            int num= scan.nextInt();//67,23,42,5/-10
            if (num<min){
                min=num;

            }

        }


    }
}
