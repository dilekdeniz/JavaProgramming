package day23_CustomMethods_Void.Homework;

public class task3_EligibleToBuyAlcohol {
    public static void main(String[] args) {
        Eligible(20);
    }



    public static void Eligible(int citizen){
        if(citizen<18){
            System.out.println("Not eligible to buy alcohol");
        }else{
            System.out.println("Eligible to buy alcohol");
        }
    }
}
