package day25_CustomMethods_Overloading.Homework;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 3:
1. create a method that can return the min number from an integer
array
2. create a method that can return the min number from double array
3. create a method that can return the min number from long array
4. create a method that can return the min number from short array
5. create a method that can return the min number from float array
6. create a method that can return the min number from byte array
         */
        int[]array1={12,14,58,74,14};
        System.out.println(minOfArray(array1));

        double[]array2={10.5,12.5,2.5,1.4};
        System.out.println(minOfArray(array2));

        long []array3={121212l,54546813l,4412l};
        System.out.println(minOfArray(array3));

        short []array4={12,14,58,17};
        System.out.println(minOfArray(array4));

        float[]array5={1,2,1,5,5,2};
        System.out.println(minOfArray(array5));
        byte[]array6={1,2,54,12};
        System.out.println(minOfArray(array6));
    }
    public static int minOfArray(int[] array1){
        Arrays.sort(array1);
        int min = array1[0];
        return min;


    }
    public static double minOfArray(double[]array2){
        Arrays.sort(array2);
        double min2=array2[0];
        return min2;
    }
    public static long minOfArray(long[]array3){
        Arrays.sort(array3);
        long min3=array3[0];
        return min3;
    }
    public static short minOfArray(short[]array4){
        Arrays.sort(array4);
        short min=array4[0];
        return min;
    }
    public static float minOfArray(float[]array5){
        Arrays.sort(array5);
        float min=array5[0];
        return min;
    }
    public static byte minOfArray(byte []array6){

        Arrays.sort(array6);
        byte min=array6[0];
        return min;

       }

    }

