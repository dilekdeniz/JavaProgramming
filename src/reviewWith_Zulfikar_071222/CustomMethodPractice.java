package reviewWith_Zulfikar_071222;

public class CustomMethodPractice {
    public static void main(String[] args) {
        spaces(" this is java office hours");
      //  investment(20000.0,1.2,2010};
    }

    //write a method,count all the space in given string,then print the number of space
    // this is java office hours-->5
    public static void spaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;

            }

            System.out.println("count= " + count);
        }
        // write a java method to calculate total money in your bank account
        // mehtod receives 3 arguents: original amount, rate, year.


       /* public static double investment(int amount,double rate, int year){
            for (int i = 0; i < year; i++) {
                amount += amount + amount * rate;

                //amount=amount+amount*rate
                //amount=amount+amount*rate

            }
            System.out.println("Total amount is= " + amount);
        }



        */
    }
}
   





