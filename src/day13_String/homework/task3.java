package day13_String.homework;

public class task3 {
    public static void main(String[] args) {
        String word= "Fenerbahce";
        char firsttChar= word.charAt(0);
        char lasttChar =word.charAt(word.length()-1);
        if (firsttChar==lasttChar) {
            System.out.println(firsttChar +" and " +lasttChar  + " of the string are same");
        }else {
            System.out.println(firsttChar + " and " +lasttChar+ "  of the string are not same");
        }
    }
}
