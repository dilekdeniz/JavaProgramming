package day28_ArrayList.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*
        4. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E",
"F", "G"}
         */
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.addAll(Arrays.asList("A", "B", "C"));
        ArrayList<String> arr2= new ArrayList<>();
        arr2.addAll(Arrays.asList("D", "E", "F", "G"));
       arr1.addAll(arr2);
        System.out.println(arr1);
    }
}