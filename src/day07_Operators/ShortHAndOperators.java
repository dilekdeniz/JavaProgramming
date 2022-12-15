package day07_Operators;

public class ShortHAndOperators {
    public static void main(String[] args) {
        //assignment: =
        int number =100;
        System.out.println("number = " + number); //100
        number =200;
        System.out.println("number = " + number); //200
        String word ="Java Programming";
        System.out.println("word = " + word); // Java Programming
        word = "Wooden Spoon";
        System.out.println("word = " + word); // Wooden Spoon
        word = "Cydeo";
        System.out.println("word = " + word);
        //word =123; you can not assign a number to string
        word = "123"+1;
        System.out.println("word = " + word); // 1231
        System.out.println("------------");
        //Additional Assignment;
        int x = 100;
        System.out.println("x = " + x);
        System.out.println("200 = " + 200); //300
        x =x+200;
        System.out.println("x = " + x); //300
        String str = "Wooden";
        str += "Spoon";
        System.out.println("str = " + str); //WoodenSpoon
        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 +=5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1000.50;
        //deposit 300$
        availableBalance+=300; //availableBalance =1000.50+300
        System.out.println("availableBalance = " + availableBalance); //1300.5
        //---------------------------

        //withdrawing 500$
        System.out.println("availableBalance = " + availableBalance);
        availableBalance  -=500; // availableBalance = 1300.5-500;
        System.out.println("availableBalance = " + availableBalance);
        //withdrawing 200, then depositing 400$
        availableBalance -= 200; // availableBalance = 600.5
        availableBalance+= 400; // 600.5+400 = 1000.5
        System.out.println("availableBalance = " + availableBalance);
        //------------------------

        double salary = 500000.5;
        System.out.println("salary = " + salary);
        salary *=  2;// salary =salary*2
        System.out.println("salary = " + salary); //1000001.0
        double doge =0.00000001;
        doge *=1000000;
        System.out.println("doge = " + doge);
        //---------------------------
        double num2 =25000;
        num2/=2;
        System.out.println("num2 = " + num2);
        double num3 = 100;
        // % =
        num3 %=3;
        System.out.println("num3 = " + num3); // 1
        //----------------------------------
        int amount =127; //cents
        int quarters = amount/25;

        int cents =amount%25;
        System.out.println("cents = " + cents); // 2
        System.out.println("quarters = " + quarters); // 5

        //--------------------
        int cents2 = 127;
        cents2 %=25;
        System.out.println("cents2 = " + cents2); //2
        //-----------------------
        int y =300;
        y %=16;
        System.out.println("y = " + y); //12
        //--------------------------
        int balance =3500;
        //insurance fee:153
        balance %= 153;
        System.out.println("balance = " + balance);




























    }
}
