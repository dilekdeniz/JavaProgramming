package day36_Inheritance.phone;

public class Iphone extends Phone {
    public Iphone(String model, String size, String colour, double price) {
        super("Iphone", model, size, colour, price);
    }

    public void faceTime(long phoneNumber) {
        System.out.println(brand + " " + model + " is calling you from " + phoneNumber + " this number");

    }

    public void faceTime(String email) {
        System.out.println(brand + " " + model + " is texting you from " + email + " this e mail");
    }
}
/*
1.2 Create a sub class of Phone named IPhone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
faceTime(long phoneNumber)
faceTime(String email)

 */