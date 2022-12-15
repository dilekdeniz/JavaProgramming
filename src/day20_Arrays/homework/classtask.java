package day20_Arrays.homework;

import java.util.Scanner;

public class classtask {
    public static void main(String[] args) {
        /*
        5. Items
			1. Create an array named items with the length of 5
			2. Create an array named prices with the length of 5
			3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
			4. calculate the total price of the arrays
			5. display each item name and price in separate lines

						ItemName -- Price
         */

        Scanner scan=new Scanner(System.in);
        String[]item=new String[5];
        double[]price=new double[5];
        double calculate=0;
        for (int i = 0; i <item.length ; i++) {
            System.out.println("Enter the "+(i+1)+". item");
            item[i]=scan.next();
            System.out.println("Enter prices of the items");
            price[i]=scan.nextDouble();
            calculate+=price[i];
        }
      /*  for (int i = 0; i <price.length; i++) {
            System.out.println("Enter prices of the items");
            price[i]=scan.nextDouble();
            calculate+=price[i];
            }
*/
        for (int i = 0; i < 5; i++) {
            System.out.println("Price of "+item[i]+" is "+price[i]);
        }
        System.out.println(calculate);
    }
}

