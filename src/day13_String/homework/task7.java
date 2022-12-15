package day13_String.homework;

public class task7 {
    public static void main(String[] args) {
        /*
        7. Write a program  for CheckWords, the program accepts 3 words and :
- if they are same length:  print "All words are same length"
- if some same length and others not:    print "Not Same nor
Different lengths"
- if all different length :  print "All different length"
         */
        String word="Dilekk";
        String word1= "Nihal";
        String word2="Emma";
        int totalWordChar=word.length();
        int totalWord1Char=word1.length();
        int totalWord2Char=word2.length();
        if (totalWordChar==totalWord1Char&& totalWord1Char==totalWord2Char) {
            System.out.println("All the words are same lenght");
        } else if (totalWordChar==totalWord1Char && totalWord1Char!=totalWord2Char
                ||totalWordChar!=totalWord1Char&&totalWord1Char ==totalWord2Char){
            System.out.println("Not Same nor  Different lengths");
        }else{
            System.out.println("All different length");



        }
    }
    }
