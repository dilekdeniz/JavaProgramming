package day10_NestedIf;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score = 400;

        if (score >= 0 && score <= 100) { // if the score is valid
        }
        if (score >= 60) { // if student passed the exam
            System.out.println("Passed");
        } else { //if the student failed exam
            System.out.println("Failed");
            System.out.println("Invalid Score");

        }

        //------------------------------------
        int age = 19;
        boolean hasId = true;
        if (hasId) { // if the person is 21 years old or older
            if (age >= 21) {
                System.out.println("Eligible to buy alcohol");
            } else { // if the person is less than 21 years old
                System.out.println("Not eligible to buy alcohol");
            }

        } else { // if the person does not have an id
            System.out.println("You m ust have an ID to buy alcohol");
        }

        //----------------------

        int number = 5;
        if (number >= 1 && number < +7) { // if th number is a valid (1-7)
            // 7 options
            if (number == 1) {
                System.out.println("Monday");
            } else if (number == 2) {
                System.out.println("Tuesday");
            } else if (number == 3) {
                System.out.println("Wednesday");
            } else if (number == 4) {
                System.out.println("Thursday");
            } else if (number == 5) {
                System.out.println("Friday");
            } else if (number == 6) {
                System.out.println("Saturday");
            } else {
                System.out.println("Sunday");
            }
        }else { //if the number is not valid
            System.out.println("Invalid Number");
        }

        }

        }

