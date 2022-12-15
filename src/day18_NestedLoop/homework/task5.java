package day18_NestedLoop.homework;

public class task5 {
    public static void main(String[] args) {
        /*
       5 . Write a program that can find the unique characters from a string
without using index() and lastIndexOf() methods
Ex:
str = "aabccdeef";  output: bdf
Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the
frequency.
if frequency of a character == 1  =========> unique
         */
        String str="aaabbdhjdyyd"; // h and j are unique
        String result="";

        for (int i = 0; i <str.length() ; i++) {
            int count=0;
            char ch=str.charAt(i);

            for (int j = 0; j <str.length() ; j++) {
                char each=str.charAt(j);

                if (ch==each)
                    count++;

            }

            if (count==1){
                result+=ch;
            }




        }

        System.out.println(result);
    }
}
