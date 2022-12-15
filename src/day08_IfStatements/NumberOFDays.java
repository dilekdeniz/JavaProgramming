package day08_IfStatements;

public class NumberOFDays {
    public static void main(String[] args) {
        int number =5;
        boolean has28Days = number ==2;
        boolean has30days = number == 4 || number == 6 || number ==9 ||  number ==11; //for the months that has 30days
        boolean has31Days = !has30days && !has28Days;
        if (has31Days) {
            System.out.println("31 Days");
        }
            if (has30days){
                System.out.println("30 Days");
            }
            if (has28Days){
                System.out.println(" 28 Days");

        }





    }
}
