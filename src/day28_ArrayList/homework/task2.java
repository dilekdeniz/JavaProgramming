package day28_ArrayList.homework;

import java.util.ArrayList;
import java.util.Arrays;

public class task2 {
    public static void main(String[] args) {

        /*
        2. write a program that can swap the first and last elements of an
integer arraylist
            ex:
                list = [1,2,3,4,5];
                output: [5,2,3,4,1];
         */
        ArrayList<Integer>list=new ArrayList();
        list.addAll(Arrays.asList(1,2,3,4,5));
        int lastIndex=list.size();
        int temp=list.get(0);
       list.set(0,list.get(list.size()-1));
       list.set(list.size()-1,temp);

        System.out.println(list);

    }
}

