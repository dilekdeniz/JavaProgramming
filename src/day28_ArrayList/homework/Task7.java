package day28_ArrayList.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        /*
        7. Write a program that can return the first duplicated element from an
arrayList of Integer
Ex:
list = [1,2,2,3,4,4,5,6,7,7];
output:
2
         */
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7));

        Integer firstDuplicated = 0;

        for (Integer each : list) {
            if (list.indexOf(each) != list.lastIndexOf(each)) {
                firstDuplicated = each;
                break;
            }
        }

        System.out.println(firstDuplicated);

    }

}