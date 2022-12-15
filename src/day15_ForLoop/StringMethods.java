package day15_ForLoop;

public class StringMethods {
    public static void main(String[] args) {

        String str=" ";
        boolean r=str.isEmpty();
        System.out.println(r);


      boolean r1=  str.isBlank();
        System.out.println(r1);
        String str2="Cydeo   ";
        System.out.println(str2.isBlank());
        System.out.println("--------------------------" );
        String s1="CYDEO";
        String s2="cydeo";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //Yes.YES.YeS.yES,YEs...
        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("----------------------");
        String sentence= "My favorite programming language is Java  ";
        boolean hasCSharp=sentence.contains("C#");
        boolean hasJava =sentence.contains("Java");
        boolean hasJava2=sentence.contains("java");
       boolean hasJava3= sentence.toLowerCase().contains("java");
       boolean r3=sentence.contains("java") || sentence.contains("Java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava2);
        System.out.println(hasJava3);

        String input="I love JaVa";
        String input2= "Java";

        System.out.println(input.equals(input2));//f\alse
        System.out.println(input.equalsIgnoreCase(input2));//false
        System.out.println(input.contains("Java"));//false
        System.out.println(input.toUpperCase().contains("JAVA"));
        System.out.println("---------------");
        String a= "Wooden Spoon";
        boolean x=a.startsWith("Woo");//true
        boolean y= a.endsWith("Sponn");
        boolean z=a.toLowerCase().startsWith("woeden");
        //in order to ignore the case sensivity we first create the lower case/upper case version of string
        // and then compare it with lowecase/uppercase
        System.out.println(x);



    }
}
