package day23_CustomMethods_Void.Homework;

public class task4_EligibleToVote {
    public static void main(String[] args) {
        /*
        4. create a method that can check if a person is eligible to vote
Ex:
eligibleToVote(19, "USA");
output:
You are not eligible to vote!
         */
        EligibleToVote(18,"TR");
    }
    public static void EligibleToVote(int age, String citizen){
        if (age>=18 &&citizen.contains("USA") ){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
