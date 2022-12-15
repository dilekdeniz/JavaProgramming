package day08_IfStatements;

import java.util.concurrent.locks.Condition;

public class SingleIfStatements {
    public static void main(String[] args) {
        int number= 300;  //eger bur 301 olsaydi hic bir sey print etmeyecekti
        boolean evenNumber = number %2==0;
        boolean oddNumber = ! evenNumber; // not even number
        if (evenNumber) {
            System.out.println(number + " is even number"); // true
        }
            if (oddNumber) {
                System.out.println(number + "is odd number"); // false (bunu print etmeyecek)

            }

            // System.out.println("Odd Number");
            //System.out.println("Even Number");

        }
    }

