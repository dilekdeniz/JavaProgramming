package day14_String.Homework;

import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        /*
        7. Create a class called AccountNumber.
Ask the user enter an account number (String). Check if these
account number is valid.
> If the account number begins with a â2â the account
number should be 7 characters long
> If the account number begins with a â5â the account
number should be 10 characters long
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter an accountNumber");
        String accountNumber=scan.next();
        if(accountNumber.startsWith("2")&&accountNumber.length()==7) {
            System.out.println("Account number is valid");
        } else if (accountNumber.startsWith("5")&& accountNumber.length()==10) {
            System.out.println("Account number is valid");
        }else {
            System.out.println("Invalid account number");

        }

    }





    }

