package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
/*
toCharArray(): retrusn a char array
				"abc".toCharArray() ====> {'a', 'b', 'c'}
				split(value): retruns String array

				"I love learning java programming language".split(" ") ===> {"I", "love", "learning" ,"java", "programming" ....}

				"ABC".split("")  ===>  {"A", "B", "C"}
 */
    String str="Java";
    char []chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));
    for(char each:str.toCharArray()){
        System.out.println(each);
    }
        System.out.println("------------------");


        String sentence = "Wooden Spoon";
        String[] words =  sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------------------------");


        String s="Today is a nice day.Today is Monday.Today we learn Java";
        String[] sentences =s.split("\\. "); // nokta ile bolmek istiyorsan \\. seklinde yazmak gerek

        System.out.println(Arrays.toString(sentences));





    }
}
