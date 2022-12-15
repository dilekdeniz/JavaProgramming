package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int score = 135;
        if (score >= 0 && score <= 100) { // if the score is valid
            // 5 posibilities
            if (score >= 90) {
                //result = "Excellent" ; seklinde de yazabilirsin yukarda da String result == "" ; (temporary)
                // yazman lazim bu sekilde yapmak icin. sout (result); yazip bitirebilirsin
                System.out.println("Excellent");
            } else if (score >= 80) {
                System.out.println("Great");
            } else if (score >= 70) {
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {
            System.out.println("Invalid Score");
        }
        System.out.println("---------------------");
        //solution 2: use ternaries Only
        String result = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" :
                (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed" : "InvalidScore";
        System.out.println(result);
        System.out.println("----------");
        //third solution
        String result2 = "";
        if (score >= 0 && score <= 100) {
            result2 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" :
                    (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed";
        } else {
            result2 = "InvalidScore";
            System.out.println(result2);


        }

    }
}