package day05_Concatenation;

public class ShippingAddress {
    public static void main(String[] args) {

        String name = "Dilek", buildingNumber = "123B", streetName = "Kayisdagi", city = "Istanbul",
                state = "Turkey", zipCode =  "1234B";
        System.out.println(name + "\n" +buildingNumber + " " + streetName + "\n" +  city + "," + state +  " "
    + zipCode);
      String shippingAddress = name + "\n" +buildingNumber + " " + streetName + "\n" +  city + "," + state +  " "
              + zipCode;
        System.out.println(shippingAddress);


    }
}

/*
Dilek
123B Kayisdagi
Istanbul, Turkey 1234B
your code should be like this format
 */