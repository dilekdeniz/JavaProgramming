package day13_String.homework;

import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        /*
        8. You are writing a code for the log-in function of the Cybertek
Application, assume that your credentials are:
username: Cydeo
password: WoodenSpoon
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String userName = scan.next();
        System.out.println("Enter your password");
        String password = scan.next();
        scan.close();
        if (userName.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            System.out.println("Incorrect username or password");

        }
    }
}