package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
       char[]letters=new char[26] ;
        for (char i = 'A',j=0; i <'Z'&& j<letters.length ; i++,j++) { // int i=0, j='A'... seklinde yaparsak letters[i]=(char)j yapmamiz lazim
          letters[j] = i;
        }

            System.out.println(Arrays.toString(letters));

char ch='A';
        for (int i = 0; i < letters.length; i++,ch++) {
            letters[i]=ch;
        }

    }
}
