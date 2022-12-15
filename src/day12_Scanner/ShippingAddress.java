package day12_Scanner;

import java.util.Scanner;
import java.util.SortedMap;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter your building number: ");
        String buildingNumber =scan.next();
        scan.nextLine();

        System.out.println("enter your Street name: ");
        String streetName =scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityNAme = scan.nextLine();

        System.out.println("Enter your state name: ");
        String stateName = scan.nextLine();

        System.out.println("Enter you Zip Code: ");
        String zipCode =scan.next();

        scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityNAme = " + cityNAme);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println(fullName +"\n"+ buildingNumber+  " "+ streetName+"\n"+cityNAme+ " "+ stateName+" "+zipCode);
scan.close();

    }
}
/*
1. Enter your full name ( nextLine() )
2. Enter your building number ( next() )
3. Enter your Street name ( nextLine() )
4. Enter your city name ( nextLine() )
5. Enter your state ( nextLine() )
6. Enter your zip code ( next() )
Display the shipping address
John Smith
7925 Jones Branch Dr
McLean, VA 22012
 */