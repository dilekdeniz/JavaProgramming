package day25_CustomMethods_Overloading;

public class quiz {
    public static void main(String[] args) {
     dosum(10,20);
     dosum(10.0,20.3);

       }
       public static void  dosum( double x, double y) {
           System.out.println("double " + (x + y));
       }
    public static void dosum(float x, float y){
        System.out.println("float"+ (x+y));
}
    public static void dosum(int x, int y){
        System.out.println("int"+(x+y));
    }
}
