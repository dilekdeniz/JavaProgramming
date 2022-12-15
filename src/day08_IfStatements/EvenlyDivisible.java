package day08_IfStatements;

public class EvenlyDivisible {
    public static void main(String[] args) {

        int number= 65;
        boolean divisibleBy2 = 65%2 == 0;
        boolean divisibileBy3 = number %3 ==0;
        boolean divisibleBy5 = number %5 ==0;
        System.out.println(number + " is divisible by 2:  " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divisibileBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);




    }
}
/* number=65
output 65 is divisible by 2: false
output 65 is divisible by 3: false
output 65 is divisible by 5: true

 */