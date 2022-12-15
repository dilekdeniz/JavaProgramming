package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo123456School! @$%WoodenSpoon";
        // digits 123456 //letters CydeoWoodenSpoon //specialChars !@$%
        String digits = "";
        String letters = "";
        String specialChars = "";
        for (int i = 0; i < str.length(); i++) { // index numbers of str (0~last index)
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch <= 'z' && ch >= 'a' || ch <= 'Z' && ch >= 'A') {
                letters += ch;
            } else {
                if(ch!= ' ')// if the speacial character is not a space. ignores the spaces
                specialChars += ch;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);
    }

}
