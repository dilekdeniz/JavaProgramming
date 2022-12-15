package day06_PrinitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12"+1); // 121, concatenation
        System.out.println(100-50); // 50, subtraction
        System.out.println(10 * 6); // 60. multiplication

        System.out.println(100 / 3); //result number is decimal so you have to write at least one of the number as
                                    // a decimal otherwise you can the result as 33 not 33.33333
        System.out.println(100.0 / 3);  // 33.33....
        System.out.println(100  / 3.0); // 33.33...
        System.out.println(100d/3); // 33.33...

        int a =100;
        double b = a/6; //16
        //integer divided by another integer so you get another integer number
        System.out.println(b);

        double c= (double)a/6;
        System.out.println(c); //16.66666...
        System.out.println( 100D );

        // % formula: numaretor - (denominator * integer)
        System.out.println( 20 % 5 );
        System.out.println( 20 % 6); // 20-(6*3) = 2 , Burdaki 3 sonuctaki 3.33 ten geliyor.
        // 3..33 decimal number ama integer sonucu yazmamiz gerekiyor







    }
}




/*
+= addition
- =subtract
* =multiplication
/ =division
% = remainder

 */