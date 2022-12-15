package day23_CustomMethods_Void.Homework;

public class task10_dollarToTl {
    public static void main(String[] args) {
        /*
        10. create a method that can can convert dollar to lira
         */
        dollarToTl(10);
    }


public static void dollarToTl(double dollar){
        double rate=15.1;
        double converting=dollar*rate;
    System.out.println(converting);
}



}
