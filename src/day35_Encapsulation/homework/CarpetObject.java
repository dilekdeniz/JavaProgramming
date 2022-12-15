package day35_Encapsulation.homework;

public class CarpetObject {
    public static void main(String[] args) {
        Carpet carpet1=new Carpet(10,5,50,true);
        System.out.println(carpet1.calcCost());
        Carpet carpet2=new Carpet(10.1,2.5,10,false);
        System.out.println(carpet2.calcCost());
    }
}
