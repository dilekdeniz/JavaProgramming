package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {

        // : nu else ? bu da if
        int n =5;
       String result=  (n==1)? "Monday" : (n==2)? "Tuesday" :(n==3)? "Wednesday" : ( n==4)? "Thursday"
               : (n==5)? "Friday"  :(n==6)?  "Saturday" :"Sunday";
// burda 5 else if blocks kullandik :(n==1)?
        System.out.println(result);

    }
}
