package day07_Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        //remainder = numerator -(denominator *result)
       int num1 = 10;
       int num2 = 3;
       int division = num1/num2;
       int reminder = num1%num2;
       // 10 divide by 3 is equal to 3 with a remainder of 1
        System.out.println("division = " + division); // result gonna be 3
        System.out.println(num1+ " divided by " + num2+ " is equal to "+ division + "with a remainder of " + reminder);

        int number = 45;
        int number2 = 8;
        System.out.println("number = " + number);
        int remainder = number%number2;
        System.out.println("remainder = " + remainder);
        // whats the remainder of 25 divided 4
        System.out.println(25%4);
    }
}
