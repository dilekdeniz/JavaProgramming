package day36_Inheritance.phone;

public class Samsung extends Phone {

    public Samsung( String model, String size, String colour, double price) {
        super("Samsung", model, size, colour, price);
    }
    public void freeze(){
        System.out.println(brand+model+" is freezing ");
    }
}
/*
1.3 Create a sub class of Phone named Samsung:
Variables:
brand, model, size, price,
color
Methods:
setInfo()
call(long phoneNumber)
text(long phoneNumber)
freeze()
toString()
 */