package day13_String;

import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName= scan.next();

        System.out.println("Enter your last name");
        String lastName=scan.next();
   char f= firstName.charAt(0); // ilk bastaki karakteri sordugu icin 0 verdik.cunku index 0 ile basliyor
 char l=   lastName.charAt(0);
        String initial=""+f+"."+l; // initial mutlaka srtring olmali yani "" basta veya sonda bos bir string olmali
        System.out.println("initial = " + initial);
        scan.close();


    }
}
