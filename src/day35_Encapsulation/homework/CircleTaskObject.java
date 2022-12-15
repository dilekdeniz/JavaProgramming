package day35_Encapsulation.homework;

public class CircleTaskObject {
    public static void main(String[] args) {
        CircleTask circleTask1 = new CircleTask(10);

        circleTask1.setRadius(5.2);
        System.out.println(circleTask1.getRadius());

        CircleTask circleTask2 = new CircleTask(5);
      //  circleTask2.setRadius(6);
        System.out.println(circleTask2.getRadius());


        circleTask2.calcArea();
        System.out.println(circleTask2.calcArea());

        circleTask1.calPerimeter();
        System.out.println(circleTask1.calPerimeter());
    }
}