package day23_CustomMethods_Void.Homework;

public class task12_negativePositiveOrZero {
    public static void main(String[] args) {
        /*
        12. create a method that can if the given integer is positive,
negative or zero
         */
        number(-11);
    }

    public static void number(int number){
        if (number<0){
            System.out.println(number+ " is negative number");
        } else if (number==0) {
            System.out.println(number+" is zero");
        }else {
            System.out.println(number +" is positive");
        }
    }
}
