package day22_MultiDimensionalArray.Homework;

import java.util.Arrays;

public class task_reverse {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a two dimensional array (return new
array)
Ex:
array = { {1,2,3}, {4,5,6}};
output:
reverse = { {6,5,4}, {3,2,1},};
         */
        int[][] array = { {1,2,3}, {4,5,6}};

        int[][] reverse = new int[array.length][];

        for (int i = array.length - 1,k = 0; i >= 0; i--,k++) {

            reverse[k] = new int[array[i].length];
    
            for (int j = array[i].length - 1,l = 0; j >= 0; j--,l++) {

                reverse[k][l] = array[i][j];

            }

        }

        System.out.println(Arrays.deepToString(reverse));
 }
}


