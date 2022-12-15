package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        // Write a program asks the user to enter a number for 5 times.
        //Return the max number
        Scanner scan=new Scanner(System.in);
        int max=-2147483648 ;//min integar number from ASCI Table
        for (int i=0; i<5; i++){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if(num>max){
                max=num;

            }
        }
        System.out.println("Max = "+max);




    }
}
