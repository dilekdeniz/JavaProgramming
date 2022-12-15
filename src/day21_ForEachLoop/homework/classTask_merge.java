package day21_ForEachLoop.homework;

import java.util.Arrays;

public class classTask_merge {
    public static void main(String[] args) {
       /* Task
        1. write a program that can merge two arrays of integers
        Ex:
        arr1 = {1,2,3,4}
        arr2 = {5,6}
        output     arr3 = {1,2,3,4,5,6}
       */
    int []arr1={1,2,3,4};
    int []arr2={5,6};
      int []result= new int[arr1.length+arr2.length];
        int i=0;
      for(int each:arr1) {
          result[i++] = each;
      }
      for(int each:arr2){
          result[i++]=each;
      }
        System.out.println(Arrays.toString(result));




    }
}
