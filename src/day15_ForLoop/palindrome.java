package day15_ForLoop;

public class palindrome {
    public static void main(String[] args) {


        String word2 = "anna";
        String result2 = "";

        for (int i = word2.length() - 1; i >= 0; i--) {
            result2 += word2.charAt(i);
        }
        boolean isPalindrome = word2.equalsIgnoreCase(result2); //
        System.out.println("isPalindrome= " + isPalindrome);

    }


}
