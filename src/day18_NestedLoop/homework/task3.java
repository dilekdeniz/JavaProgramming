package day18_NestedLoop.homework;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        /*
        3. Write a program that can calculate two numbers.
1. Ask user to enter the first number 2. Ask user to enter a math operator (+,-,/,*)
(if user enters any invalid operator,repeat this step until user provides a valid operator)
3. Ask user to enter the second number 4. Display the result 5. Ask user if they want to continue?(yes/no)
if yes ==> repeat the entire steps     if no ==> print "Thanks for using Cydeo calculator!"
If user enters any invalid entry,  ask the user to re-enter until user provides a valid entry
         */
        Scanner scan=new Scanner(System.in);

        int result=0;

while (true){
        System.out.println("Enter first number");
       int number1= scan.nextInt();
        System.out.println("Enter math operator");
     char operator=scan.next().charAt(0);

    while (!( operator== '+'||operator == '-'||operator == '*'||operator == '/')) {
        System.out.println("Invalid entry, please re enter again");
        operator = scan.next().charAt(0);
    }
            System.out.println("Enter second number");
            int num2=scan.nextInt();
            switch (operator) {
                case '+':
                    result = number1 + num2;
                    break;
                case '-':
                    result = number1 - num2;
                    break;
                case '*':
                    result = number1 * num2;
                    break;
                case '/':
                    result = number1 + num2;
                    break;
            }
            System.out.println("result is "+result);
            System.out.println("Would you like to continue");
            String answer=scan.next().toLowerCase();
        while (!(answer.equals("yes")||answer.equals("no"))) {
            System.out.println("Invalid answer, re enter again");
            ;
            scan.next().toLowerCase();
        }
             if (answer.equals("no")) {
                 System.out.println("thank you for using Cydeo Calculator");
                 break;
             }


             }
            }



            }












