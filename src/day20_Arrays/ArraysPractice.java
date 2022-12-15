package day20_Arrays;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //   store teh elements: 10. 20, 50, 70
        int[] numbers = {10, 20, 50, 70}; //size:4
        System.out.println(Arrays.toString(numbers));

        System.out.println("---------------------------------");
        // create a variable that contains 5 scores
        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;
        System.out.println(Arrays.toString(scores));

        System.out.println("--------------------");
        String[] months = {"January", "February", "March", "April", "May..."};
        for (int i = 0; i < months.length; i++) { // i: represents the index numbers of array starting from 0
            System.out.println(months[i]);

        }

        System.out.println("----------------------------");
      //  for (int j = months.length-1; j >= 0; j--) ;
    //    System.out.println(months[j]);  hata verdiiii sor burayi i yazdiramadm
    }



        /*
        System.out.println(months[0]); boyle tek tek yapmak zaman kaybi loop kullanmak lazim
        System.out.println(months[1]);
        System.out.println(months[2]);
        System.out.println(months[3]);
        System.out.println(months[4]);

         */




    }
