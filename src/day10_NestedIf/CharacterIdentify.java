package day10_NestedIf;

public class CharacterIdentify {
    public static void main(String[] args) {
        /*
        write a program that can identify if the givern character is a digit or Alphabetic character or a special
        character
         */
        char ch='@';
        if (ch>='0' && ch<='9') {
            System.out.println("Digit");
        } else if ( (ch>='A' && ch<='Z') || (ch>='a' && ch<='z') )
        System.out.println("Alphabetic");
        else
        System.out.println("Special Character");




    }
}
