package day35_Encapsulation.homework;

import java.util.ArrayList;

public class Arrayyy {
    public static void main(String[] args) {
        ArrayList<Integer> deneme = new ArrayList<>();
        deneme.add(3);
        deneme.add(2);
        deneme.add(1);
        Integer a = 1;
        deneme.remove(a);
        System.out.println(deneme);
    }

}