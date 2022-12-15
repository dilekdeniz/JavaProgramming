package day14_String;

public class StringMethod2 {
    public static void main(String[] args) {
        String str="JAva is fun, I love learning Java";
       String str2= str.replace("Java" , "Python"); //"Python  is fun, I love learning Python"
        System.out.println("str2 = " + str2);
        System.out.println("str = " + str);

        String email="JohnSmith@yahoo.com";
         email=email.replace("yahoo","gmail");
        System.out.println("email = " + email);

String sentence="Java Java Python Python C# c++ Python Python Python ";
String sentence2=sentence.replace("Python", ""); //3 tane bosluk olusacak onu gidermek icin tekrar replace yaptik
sentence2=sentence2.replace("   ", " ");
        System.out.println("sentence = " + sentence);
        System.out.println("sentence2 = " + sentence2);

        String s= "Dog Dog Dog Dog Dog Dog ";
        s= s.replace("Dog", "Cat");
        System.out.println("s = " + s);

        String s2= "C# is fun. C# is cool";
     s2=   s2.replace("C#" , "Java");
        System.out.println("s2 = " + s2);

        String s3="Java";
      s3=  s3.replace("a","e");
        System.out.println("s3 = " + s3);
        System.out.println("-------------------");
        String result= "Java JAva Java";
        //result=result.replace("Java", "Python");
        result=result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);
        String result2="C# is fun, C# is cool";
        result2=result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3= "Java";
        result3=result3.replaceFirst("a", "o");
        System.out.println("result3 = " + result3);


    }
}
