package day35_Encapsulation.homework;

public class CircleTask {
    private double radius;
    public static double pi;

    public CircleTask(double radius) {
        this.radius = radius;
    }

    public CircleTask(double radius, double pi) {
        setRadius(radius);
        setPi(pi);
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (!(radius <= 0)) {
            return;
        }

    }

    public static double getPi() {
        return pi;
    }

    public static void setPi(double pi) {
        CircleTask.pi = pi;

    }

    static {

        pi = 3.14;
    }
    public double calcArea() {
        return pi * radius * radius;
    }
    public double calPerimeter() {
        return 2 * pi * radius;


    }

    @Override
    public String toString() {
        return "CircleTask{" +
                "radius=" + radius +
                '}';
    }
}

