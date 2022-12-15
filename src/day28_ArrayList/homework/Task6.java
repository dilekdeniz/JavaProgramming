package day28_ArrayList.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        /*
        6. Write a program that can find the minimum number from an ArrayList of
integers
Ex:
list = [1,2,3,4,5];
output:
1
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 3, 4, 5));
        int min = list.get(0);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);

            }
        }
        System.out.println(min);
    }
}
