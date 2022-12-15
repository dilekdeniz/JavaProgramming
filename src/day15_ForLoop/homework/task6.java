package day15_ForLoop.homework;

public class task6 {
    public static void main(String[] args) {
        /*
        6. Write a program that can return the sum of digits from a  string
Ex:
input: A1B2C3
output:    6
Hint: You need to get each of the character by using a loop
             To convert char to number:
             '0' - 48   ==> 0
              '1' - 48   ==> 1
         */


        String str = "A1B2C3";

        int sum = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                for (int x = 48; x < 58; x++) { // 0=48 in ASCI table 9=57
                    if (str.charAt(i) == x) {
                        sum += x - 48;


                    }


                }
                System.out.println("Sum :" + sum);
            }
        }
    }
}