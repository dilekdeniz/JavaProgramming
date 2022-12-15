package day33_Statics.homework;

public class Iphone {
    public String model;
    public double price;
    public String color;
    public double size;
    public static String brand="Apple";
    public static String OS="IOS";
    public static String madeIn="China";

    public Iphone(String model, double price, String color, double size) {
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }


    public void faceTime(long phoneNumber){
        System.out.println(brand+" "+model+" can make face time and the phone number is: "+phoneNumber);
    }
    public void faceTime(String email){
        System.out.println(brand+" "+model+" can make face time and the email is: "+email);
    }
    public void call(long PhoneNumber){
        System.out.println("PhoneNumber = " + PhoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println("phoneNumber = " + phoneNumber);
    }


    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size=" + size +
                ", OS=" + OS +
                ", madeIn=" + madeIn +
                '}';
    }
}
