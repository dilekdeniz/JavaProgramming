package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        /*
        1. Write a program that can reverse a String
Ex:
input:
Wooden Spoon
output:
noopS nedooW
         */
            String str="Wooden Spoon";
             //index:   012345...
            String result=""; //contain the reserved version of str
        //result+= str.charAt(str.length()-1);//n
         //   result+=str.charAt(11); //(simdilik 9 u hesapladik ama normalde boyle yapmayacagiz)
         //  result+=str.charAt(10); //o
        //  result+=str.charAt(9);
       //  result+=str.charAt(8);
        //.. boyle devam eder 0 a kadar. Bu cok uzun surer bu sekilde cozulmeyecek.  loop kullmamiz gerekiyor.
        for (int i =str.length()-1;  i >=0; i--) { // i: index numbers of str (starting last index to index 0
       result+= str.charAt(i); //adding each character to result
        }
        System.out.println(result);




    }
}
