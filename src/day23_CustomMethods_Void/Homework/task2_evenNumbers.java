package day23_CustomMethods_Void.Homework;

public class task2_evenNumbers {
    public static void main(String[] args) {
        /*
        2. create a method that can print even numbers between 1~100 in a
same line saperated by space
         */
        even(2,100);

    }
    public static void even(int x,int y){
        for (int i = 2; i <=100 ; i+=2) {
            System.out.print(i+" ");
        }
    }


}
