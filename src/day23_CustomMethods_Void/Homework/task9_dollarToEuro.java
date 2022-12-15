package day23_CustomMethods_Void.Homework;

public class task9_dollarToEuro {
    public static void main(String[] args) {
        /*
        9. create a method that can convert dollar to euro
         */
        dollarToEuro(100.0);

    }

    //    9. create a method that can convert dollar to euro
    public static void dollarToEuro(double dollar) {
        double euro = dollar * 0.90;
        System.out.println(dollar + " dollar is = " + euro+" euro");
    }
}