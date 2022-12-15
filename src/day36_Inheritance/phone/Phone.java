package day36_Inheritance.phone;

public class Phone {
    public String brand,model,size,colour;
    public double price;

    public Phone(String brand, String model, String size, String colour, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.colour = colour;
        this.price = price;
    }
    public void call(long phoneNumber) {
        System.out.println(phoneNumber + " is calling " + brand + " " + model);
    }
    public void text(long phoneNumber){
        System.out.println(phoneNumber+" is texting "+brand+" "+model);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
/*
1. Phone Task:
1.1 Create a class named Phone:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
toString()
toString()

1.4 Create a sub class of Phone named Nokia:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
selfDefense()
toString()
1.5 Create a class named Phone Objects and test of the
sub class' objects
 */