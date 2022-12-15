package day23_CustomMethods_Void.Homework;

public class task5_GradeOFStudents {
    public static void main(String[] args) {
        /*
        5. create a method that can calculate the grade of the student based
on the score
         */
        grade(50);
    }

    public static void grade(int score) {
        String result = "";

        if (score < 0 || score > 100) {

            result = "Invalid";

        } else {

            result = (score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F";

        }
        System.out.println(result);
    }
}
