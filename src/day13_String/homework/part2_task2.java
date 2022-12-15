package day13_String.homework;

import java.util.Scanner;

public class part2_task2 {
    public static void main(String[] args) {
        /*
        2. Create a class called TipCalculator, write a program for a tip
calculator.
There will be different service quality benchmarks that will determine the
tip given.
There will also the ability to calculate based on the number of people in
the party and if there is a split of the bill or not.
Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent
= 25%
The program should display the following information based on the
user input:
Split or No split (Yes or No),  Number of people entered: (number)
(each person = & in output) Check amount: (number) Service Quality:
(String) Total to pay: Total tip: Total per person: Tip per person:
Ex:
Split or No split (Yes or No)?
Yes
Enter the number of people
4
Enter the check amount:
476
How was the srvice quality?
(Excellent/Great/Good/Fair/Poor)
Excellent
output:
Number of people entered: 4
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
HINT: you will need to use .equals() method
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Split or no split");
        String yesOrNo=scan.next().toLowerCase();
        System.out.println("Enter the number of people");
        int number= scan.nextInt();
        System.out.println("Enter the check amount");
        double amount=scan.nextDouble();
        System.out.println("How was the service quality? /Excellent/Great/Good/Fair/Poor"); //(Excellent/Great/Good/Fair/Poor)
        String serviceQuality=scan.next().toLowerCase();
        double tipRate=(serviceQuality.equals("Excellent"))? 0.25 :(serviceQuality.equals("Great"))?
                0.20:(serviceQuality.equals("Good"))? 0.20: (serviceQuality.equals("fair"))? 0.15:0.10;

        double totalTip=amount*tipRate;
        double totalAmount=amount+totalTip;
        System.out.println("number of people = " + number);
        System.out.println("amount = " + amount);
        System.out.println("totalAmount = " + totalAmount);
        System.out.println("totalTip = " + totalTip);
        double tipPerPerson=totalTip/number;
        double amountPerPerson=amount/4+tipPerPerson;
        System.out.println("amountPerPerson = " + amountPerPerson);
        System.out.println("tipPerPerson = " + tipPerPerson);








    }
}
