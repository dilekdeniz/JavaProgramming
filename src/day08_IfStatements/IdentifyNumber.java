package day08_IfStatements;

public class IdentifyNumber {
    public static void main(String[] args) {
        int number =200;
        boolean isPositive = number>0; //true
        boolean isNegative = number <0; //false
        boolean isZero = number ==0; //false
        System.out.println(number + " is positive  number: " + isPositive );
        System.out.println(number + " is negative number: " + isNegative);
        System.out.println(number+ " is zero: " + isZero);

    }
}
