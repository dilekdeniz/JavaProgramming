package day39_Recap.shape;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square=new Square(10);
        System.out.println(square);
        square.setSide(15);
        System.out.println(square);

        Rectangle rectangle=new Rectangle(5,6);
        rectangle.setLength(10);
        System.out.println(rectangle);
        System.out.println(rectangle.getLength());
        System.out.println(rectangle.getName());
        Circle circle=new Circle(10);
        System.out.println(circle);
        circle.setRadius(15.5);
        System.out.println(circle.getRadius());
        System.out.println(circle);
        System.out.println(circle.getName());

    }
}
