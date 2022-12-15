package day36_Inheritance.phone;

public class Test {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("iphone 12", "5.6 inches", "Black", 1000);


        Samsung samsung = new Samsung(  "galaxy S19", "6 inches", "White", 900);


        Nokia nokia = new Nokia("Brik", "4 inches", "Pink", 60);


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }

}

