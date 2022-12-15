package day08_IfStatements;

public class SingleIfStatementIntro {
    public static void main(String[] args) {
        //positive
        int n = 200;
        if(n>0){
            System.out.println(n +" is positive"); // if the n is greater than zero, then it is positive
        }
        //negative
        if (n<0){
            System.out.println(n + "is negative"); // if n is less than zero, then negative
            //zero
            if (n==0){
                System.out.println(n + "is zero");

            }

        }


    }
}
