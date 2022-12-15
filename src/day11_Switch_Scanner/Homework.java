package day11_Switch_Scanner;

import java.lang.invoke.SwitchPoint;

public class Homework {
    public static void main(String[] args) {
        /*
        4. Create a class named Cydeo batches. In Cydeo we have three batch
types: US morning, US evening, EU.
Depending on a batch type (String) print information about the
batch.
If batch type is US morning ==> print "Class times are
10-5 EST. M, T, Th, F."
If batch type is US evening ==> print "Class times are 7-
10 EST. M, T, W, Th, S, S"
If batch type is EU ==> print "Class times are  10-5 EST.
M, T, W, Th, F."
If batch type is invalid, print "Invalid Btach"
Note:
 Solution 1: use if statement
Solution 2: use switch statement
Solution 2: use if & switch statements
mixed
         */
        String result ="";
        String Batch = "EU";
        switch (Batch){
            case "Us Morning":
                result = "\"Class times are\n" +
                        "10-5 EST. M, T, Th, F.\"";
                break;
            case "us Evening":
                result ="Class times are 7-\n" +
                        "10 EST. M, T, W, Th, S, S\"";
                break;
            case "EU":
                result= "Class times are  10-5 EST. M, T, W, Th, F.";
                break;
            default:
                result ="Invalid";





        }
        System.out.println(result);
    }
}
