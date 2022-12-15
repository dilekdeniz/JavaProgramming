package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100: excellent
        80~89: Great
        70~79: Good
        60~69 :Passed
        0~59: Failed
         */
        int score = 135;
        if (score >= 0 && score <= 100) { // if the score is valid
            // 5 posibilities
            if (score >= 90) {
                //result = "Excellent" ; seklinde de yazabilirsin yukarda da String result == "" ; (temporary)
                // yazman lazim bu sekilde yapmak icin. sout (result); yazip bitirebilirsin
                System.out.println("Excellent");
                }else if (score >= 80) {
                    System.out.println("Great");
                    }else if (score >= 70) {
                        System.out.println("Good");
                        }else if (score >= 60) {
                            System.out.println("Passed");
                        } else {
                            System.out.println("Failed");
                            }
                        }else{
                            System.out.println("Invalid Score");
                        }
                    }
                }
