package day23_CustomMethods_Void.Homework;

import java.util.Arrays;

public class task14_EachElement {
    public static void main(String[] args) {
        /*
        14. create a method named printEachElement that can print each
elements of an integer array

         */
        int[] array = {10, 20, 30, 40};
        printEachElement(array);

    }

    public static void printEachElement(int[] array) {

        for (int each : array) {
            System.out.print(each + " ");

        }
    }
}
