package day09_IfStatements;

public class LeapYear {
    public static void main(String[] args) {


        int year =2000;
        boolean leapYear = year %4==00;
        if(leapYear){
            System.out.println("Year" + year+ " is a leap year");
        }
        if (!leapYear){
            System.out.println("Year "+ year+ "is Not a leap year");
        }
        //--------------------------------------------

        if (leapYear){
            System.out.println("Year " + year+ " is a leap year");
        }else {
            System.out.println("Year " + year + " is not a leap year");
        }
    // is & else is more efficient then if




        // if & else :When there only 2 options/possibilities (not more or less than 2 conditions)
       /* if (condition){
        statementA
        }else {//otherwise
        statementB
        }
        StatementA = if condition Must be true
        StatementB = if condition must be false

        yes or no
        leap year
        female or male
        pass ir fail
        married or not married
        employed or not employed
        odd or even
        eligible or not elegibile
        for those kind of text you can use if else.

        */

    }
}
