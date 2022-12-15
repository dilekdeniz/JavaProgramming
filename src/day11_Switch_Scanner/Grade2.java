package day11_Switch_Scanner;

public class Grade2 {
    public static void main(String[] args) {
        char ch ='E';
        //String result= ""; srcond solution
        switch (ch) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                System.out.println("Passed"); // result = "passed"
                break;
            case 'F' :
                System.out.println("Failed");
            default:
                System.out.println("Invalid"); // result ="Passed"
                // sout (result)


        }

        }




    }

/*
if the grade is A  or B or C or D  ====> passed other wise ===> "failed"
ya da a b c d normal degerler f ise failed kalan her sey invalid
 */