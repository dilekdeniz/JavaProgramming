package day21_ForEachLoop.homework;

public class task2_OddEven {
    public static void main(String[] args) {
        /*
        2. Write a program that can count the even and odd number from an
array of integers
Note: MUST use for each loop
         */

        int[]numbers={1,5,10,22,14,7};
        String  odd=""; // neden string kullandik
        String even="";
        for(int each:numbers){

            if (each%2==0){
                even+=each+" ";
        } else {
                odd += each + " ";

            }
            }
            System.out.println("Odd numbers "+ odd);
            System.out.println("Even numbers "+even);


        }
    }

