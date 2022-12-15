package day04_Variables;

public class Rectangle {
    public static void main(String[] args) {
        double length = 10.5;
        double width = 5.5;
        double area = width*length;
        double perimeter = 2*(width+length);

        System.out.println("width = " + width);
        System.out.println("length = " + length);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);
    }




}


// Create a class named Rectangle, write a program that can calculate the area and perimeter of any given Rectangle
// length and width  area = length*width perimeter= lenght*2 +width*2