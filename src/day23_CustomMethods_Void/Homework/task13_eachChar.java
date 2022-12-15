package day23_CustomMethods_Void.Homework;

public class task13_eachChar {
    public static void main(String[] args) {
        /*
        13. create a method named printEachChar that can print each
characters of a string
         */
        PrintEachChar("Dilek");
    }
    public static void PrintEachChar(String word){
        for (int i = 0; i < word.length(); i++) {
            System.out.print(word.charAt(i)+", ");

        }

    }
}
