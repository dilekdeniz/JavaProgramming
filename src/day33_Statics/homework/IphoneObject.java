package day33_Statics.homework;

public class IphoneObject {
    public static void main(String[] args) {

        Iphone iphone1 = new Iphone("Iphone13", 900, "green", 7.5);
        System.out.println(Iphone.OS);
        System.out.println(Iphone.madeIn);
        System.out.println(Iphone.brand);
        System.out.println(iphone1);
        iphone1.faceTime("abc@gmail.com");
        iphone1.faceTime(487547298434L);

    }
}
