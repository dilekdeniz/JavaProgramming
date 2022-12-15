package day15_ForLoop.homework;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {


                Scanner scan = new Scanner(System.in);
                System.out.print("Enter your number: ");
                int input = scan.nextInt();
                scan.close();
                int sum = 0;
                for (int i = 1; i <= input; i++) {
                    sum += i;
                }
                System.out.println(sum);
    }
}
