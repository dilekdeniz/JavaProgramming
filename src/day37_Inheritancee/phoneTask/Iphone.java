package day37_Inheritancee.phoneTask;

public class Iphone extends Phone{
    public Iphone( String model, String size, double price, String colour) {
        super("Apple", model, size, price, colour);
    }
    public void faceTime(long phoneNumber) {

    }
}
/*


 1.2 Create a subclass of Phone named IPhone:
                Variables:
                    brand, model, size, price, color
                Methods:
                    call(long phoneNumber)
                    text(long phoneNumber)
                    faceTime(long phoneNumber)
                    faceTime(String email)
                    toString()
 */