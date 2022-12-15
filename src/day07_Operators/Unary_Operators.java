package day07_Operators;

public class Unary_Operators {
    public static void main(String[] args) {
        int num1 = +25; // using + is not mondatory to use it.
        int num2 = -25;
        System.out.println(num1 <0); //false
        int a = 25;
        System.out.println(++a); //26
        System.out.println(--a); //25
        int b = 5;
        ++b; // pre increment : increases the value by 1 right away
        System.out.println("b = " + b);
        --b;
        System.out.println("b = " + b); // once ++ ile arttirdigimiz icin -- yapinca yine ayni sayiya donmus oldu
       int c =100;
        System.out.println(c++); //post increment
        System.out.println(c);

        System.out.println("-------------");
        int x =200;
        System.out.println(--x);//199  . pre decrement
        int y = 200;
        System.out.println(y--);
        System.out.println(y);

        int z = 45;
        System.out.println(++z );  //46    z=46

        System.out.println(z++ );  //46     z =47 olacak ama tek asamada olmuyor
        System.out.println(z);   //47

        int q = 30;
        System.out.println(--q); //29 , q=29
        System.out.println(q--);  //29   q= 28
        System.out.println(q);  //28




    }
}
