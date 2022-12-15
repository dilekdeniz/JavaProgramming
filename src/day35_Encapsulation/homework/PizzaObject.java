package day35_Encapsulation.homework;

public class PizzaObject {
    public static void main(String[] args) {
        Pizza pizza1 = new Pizza("medium", 3, 5);
        System.out.println(pizza1.calcCost());

    }
}