package day14_String.Homework;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*
        6. Create a class called AccountNumber.
       Ask the user enter an account number (String). Check if these account number is valid.
If the account number begins with a “2” the account number should be 7 characters long
If the account number begins with a “5” the account number should be 10 characters long
            —> If the account number does not begin with a 2 or a 5 OR the account number lengths
                    do not meet the expected results print “Invalid account number”
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an account number");
        String accountNum=scan.next();

        char first=accountNum.charAt(0);
        int character=accountNum.length();


        if (first=='2'&&character==7 || first=='5'&&character==10){
            System.out.println("Valid account number");
        }else{
            System.out.println("Invalid account number");
        }

    }
}
