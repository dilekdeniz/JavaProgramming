package day36_Inheritance.phone;

public class Nokia extends Phone {

    public Nokia( String model, String size, String colour, double price) {
        super("Nokia", model, size, colour, price);
    }
    public void selfDefense(){
        System.out.println(brand+model+"can be used for self defense");
    }
}
/*
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
