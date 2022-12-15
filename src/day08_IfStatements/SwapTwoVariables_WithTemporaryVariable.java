package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariable {
    public static void main(String[] args) {

        int a =10;
        int b =15;
        //------------------
        int c = b; //c=15
        b = a; //b= 10  every time when you assign a variable the old volue will be gone
        a = c; //


        //--------------------

        System.out.println("b = " + b);
        System.out.println("a = " + a);
        System.out.println("c = " + c);

    }
}
