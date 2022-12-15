package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        // create a variable that is capable to contain 5 names
        String myGroup []=new String[5];// 0~4
        //System.out.println(myGroup); // hashcodeso

        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";
       // myGroup[5]="asdf";n5. yi yazamazin


        System.out.println(Arrays.toString(myGroup));
        System.out.println("-------------------------------");

        String []days={"Monday", "Tuesday", "Wednesday", "Thursday", "Fiday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number=5;
        if (number<1||number>7){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number]);




    }
}
