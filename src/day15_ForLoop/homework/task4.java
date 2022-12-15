package day15_ForLoop.homework;

public class task4 {
    public static void main(String[] args) {
        int i,fact=1;

        int num=5;

        for ( i=num; i>0; i--) {

            fact=fact*i;

        }
        System.out.println(fact);
    }
}
