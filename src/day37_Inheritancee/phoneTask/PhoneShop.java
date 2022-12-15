package day37_Inheritancee.phoneTask;

public class PhoneShop {
    public static void main(String[] args) {
        Iphone iphone=new Iphone("Iphone 12","6.7 inches",1000,"Black"  );
        Samsung samsung=new Samsung("Galxy 20","6 inches", 900,"White");
        Nokia nokia=new Nokia(" Brick","4 inches",50,"Gray");
        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(11111);
        iphone.text(121223);
        iphone.faceTime(214545);

        samsung.call(4545);
        samsung.text(2121);
        samsung.freeze();

        nokia.selfDefence();
        nokia.call( 212122);
    }
}
