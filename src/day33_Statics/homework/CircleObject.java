package day33_Statics.homework;

public class CircleObject {
    public static void main(String[] args) {

        Circle circle1=new Circle(4);
        System.out.println(circle1);
        circle1.calcArea();
        circle1.calcPerimeter();
        Circle.printPi();


    }
}
