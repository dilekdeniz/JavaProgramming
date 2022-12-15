package day25_CustomMethods_Overloading.Homework;

import utilities.ArraysUtility;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        /*
        Task 2:
1. create a method that can return the max number from an integer
array
2. create a method that can return the max number from double array
3. create a method that can return the max number from long array
4. create a method that can return the max number from short array
5. create a method that can return the max number from float array
6. create a method that can return the max number from byte array
         */
        int[] numbers = {1, 2, 5, 4, 7, 10};
        int max = ArraysUtility.max(numbers);
        System.out.println(max);

        double[] numbers2 = {10.5, 50.2, 2.1, 4.4, 3};
        double max2 = ArraysUtility.max(numbers2);
        System.out.println(max2);

        long[] n1 = {15465l, 4654654l, 12l};
        System.out.println(maxOfLong(n1));
        long[] array = {1546445l, 464454654l, 12l};
        System.out.println(maxOfLong2(array));

        short[]array2={12,14,56,24};
        System.out.println(maxOfShort(array2));

        float[]array3={12,14,15};
        System.out.println((maxOfFloat(array3)));
    }

    public static long maxOfLong(long[] array) {
        long max = array[0];
        for (long each : array) {
            if (each > max) {
                max = each;
            }
        }
        return max;
    }

    public static long maxOfLong2(long[] array) {
        Arrays.sort(array);
        return array[array.length - 1];
    }
    public static short maxOfShort(short[]array2){
        Arrays.sort(array2);
        return array2[array2.length-1];

    }
    public static float maxOfFloat(float []array3){
        float max=array3[0];
        for(float each:array3){
            if(each>max);
            max=each;
        }
        return max;
    }

}