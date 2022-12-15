package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AverageNumbers {
    public static void main(String[] args) {

    /*   int[]numbers={10, 20, 30, 40, 50, 60};
        double sum=0;
        for (int i = 0; i <c numbers.length; i++) {
            sum+=numbers[i];
        }
        double averageNumber=sum/numbers.length;


        System.out.println("averageNumber= "+ averageNumber);
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int lenght=scan.nextInt();
        if(lenght<=0){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        int [] numbers= new int[lenght];
        for (int i = 0; i < lenght; i++) {

            System.out.println("Enter the numbers");
         numbers [i]=scan.nextInt();
        }
   double sum=0;
        for (int i = 0; i < lenght; i++) {
            sum+=numbers[i];
        }
        double averageNumber=sum/numbers.length;
        System.out.println("averageNumber= "+ averageNumber);
        }

    }
