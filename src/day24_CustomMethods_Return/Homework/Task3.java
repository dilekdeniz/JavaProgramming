package day24_CustomMethods_Return.Homework;

public class Task3 {
    public static void main(String[] args) {
        /*
        3. create a method named reverse that passes one string parameter,
the method can return the reversed string
Ex:
str = "Java";
reverse(str) ==> avaJ
         */
        String str="Java";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        String reverse="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reverse += str.charAt(i);
        }

        return reverse;
    }

    }

