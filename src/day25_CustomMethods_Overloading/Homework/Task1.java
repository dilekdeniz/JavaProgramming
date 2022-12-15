package day25_CustomMethods_Overloading.Homework;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
        Task1:
1. create a method that can merge two integer arrays.
2. create a method that can merge two double arrays.
3. create a method that can merge two char arrays.
4. create a method that can merge two String arrays.
         */
        double[] str2 = {10.5};
        double[] str3 = {15.2};
        System.out.println(Arrays.toString(merge2Arrays(str2, str3)));

        char[] ch1 = {'a'};
        char[] ch2 = {'b'};
        System.out.println(Arrays.toString(merge2Char(ch1,ch2)));

        String []sentence1={"I love Java"};
        String []sentence2={"I'm jooking. I don't like java"};
        System.out.println(Arrays.toString(merge2String(sentence1,sentence2)));

    }

    public static double[] merge2Arrays (double[] str2,double[] str3){

        double []result= new double[str2.length+str3.length];
        int i=0;
        for(double each:str2){
            result[i++]=each;
        }
        for(double each:str3){
            result[i++]=each;

        }
        return result;
    }

    public static char[] merge2Char(char []ch1, char[]ch2){
        char []result=new char[ch1.length+ch2.length];
        int i=0;
        for(char each:ch1){
            result[i++]=each;
        }
        for(char each: ch2){
            result[i++]=each;
        }
        return result;
    }

    public static String []merge2String(String []sentence1, String []sentence2){
        String []result=new String[sentence1.length+sentence2.length];
        int i=0;
        for(String each: sentence1){
            result[i++]=each;
        }
        for(String each:sentence2){
            result[i++]=each;
        }
        return result;
    }
}
