package day13_String;

public class StringMethods {
    public static void main(String[] args) {
        String word= "Cydeo"; // 01234
        char thirdChar =word.charAt(3);
        System.out.println("thirdChar= " + thirdChar);
/*char tenthchar= word.charAt(10); //10 is out of range.max index number is 4
        System.out.println("tenthchar = " + tenthchar);

 */
        System.out.println("-----------------");
        String s1="Batch 25 is the best batch";
        int totalChars =s1.length();
        System.out.println("totalChars= "+totalChars);
        char lastChar=s1.charAt(s1.length()-1);
        System.out.println("lastChar = " + lastChar);
        System.out.println("-------------------------");
    String str= "wooden spoon";
    str=str.toUpperCase();//sonucun buyuk harflerle yazilmasini istiyorsan bu formulu kullanmalisin
        System.out.println(str);
        String sentence= "Today is a great day to learn java programming language";
        sentence=sentence.toUpperCase();
        System.out.println(  sentence);




    }
}
