package day15_ForLoop.homework;

public class task7 {
    public static void main(String[] args) {
/*
7. Write a program that can reverse any given string
Ex:
input:
Wooden Spoon
output:
noopS nedooW

 */
        String str="Wooden Spoon";
        String result ="";
        for (int i = str.length()-1; i >=0 ; i--) {
            result+=str.charAt(i);


        }


        System.out.println(result);

    }
}
