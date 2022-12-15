package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {


        //substring(beginnig index, ending index)
         String word= "Cydeo School";
         //            012345...
        //String brand
        //String word1= word.substring(0,4); result = Cyde
       String word1= word.substring(0,4+1);
        System.out.println("word1 = " + word1);

        String str1= word.substring(6);
        System.out.println(str1);
        String word2= "Java Programming Language";
              //  String s1; //Java
             //   String s2;//Programming
               // String s3;//Language
        String s1=word2.substring(0, word2.indexOf(" "));// neden harfleri kullanmadi cunku her seferinden degisebilir.
        String s2=word2.substring(word2.indexOf(" ")+1,word2.lastIndexOf(" "));
        String s3= word2.substring(word2.lastIndexOf(" ")+1);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


        String dilek="Dilek love java";
        String dilek1=dilek.substring(0,dilek.indexOf(" "));
        String dilek2=dilek.substring(dilek.indexOf(" ")+1,dilek.lastIndexOf(" "));
        String dilek3=dilek.substring(dilek.lastIndexOf(" ")+1);
        System.out.println(dilek1);
        System.out.println(dilek2);
        System.out.println(dilek3);


    }

}
