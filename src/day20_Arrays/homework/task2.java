package day20_Arrays.homework;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        2. create string array, and store the names of your  class mates (10)
reverse each students names and print them in separate lines
ex:
arr = {java, python, c#}
output:
avaJ
nohtyp
#c
         */
        Scanner scan=new Scanner(System.in);
        String []names=new String[10];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter you classmates names");
            names[i]=scan.nextLine();

            for (int j = names[i].length() - 1; j >= 0; j--) {


                System.out.print(names[i].charAt(j));


                }
            System.out.println();
        }
        System.out.print(Arrays.toString(names));


    }
}
