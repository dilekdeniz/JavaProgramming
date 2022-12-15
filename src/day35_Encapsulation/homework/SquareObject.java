package day35_Encapsulation.homework;

public class SquareObject {
    public static void main(String[] args) {
        Square square1=new Square(5);
        square1.setSide(10);
       square1.calcAre();
       square1.calcPerimeter();
        System.out.println(square1.calcAre());
        System.out.println(square1.calcPerimeter());

    }
}
