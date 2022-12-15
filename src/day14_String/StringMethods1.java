package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "  batch 25   ";
        str1= str1.trim(); //trim, returns new string without the white spaces
        System.out.println(str1);
        String str2="Cydeo School";
        int n1=str2.indexOf("h");
        System.out.println("n1 = " + n1);
        int n2 =str2.indexOf("ool"); // bir karakterden birkac tane varxa yanindaki karakterleri yazinca ilk karakteri verir.
        System.out.println("n2 = " + n2);

        String str3="Java Programming Language";
     int n3 =str3.indexOf("an"); // 2. a yi bulmak icin yaninda bosluk biraktik cunku java dan sonra bosluk var
        System.out.println("n3 = " + n3);
        int n4= str3.indexOf("g ");
        System.out.println("n4 = " + n4);
        String s="Java Nova Cava Wawa orange";
        int FirstA=s.indexOf("a");
        int LastA=s.lastIndexOf("a");
        int SecondA=s.indexOf("a ");
        int ThirdA=s.indexOf("a C");
        //int fouthA=s.indexof "ava w"
        int FourthA =s.lastIndexOf("av"); // sagdan basliyor
        int fifthA=s.lastIndexOf("va")+1;
        //int fifthA=s.lastIndexOf("va")+1;
        int sixtA=s.lastIndexOf("aw");
        int seventhA= s.indexOf("a o");
        //int seventA=s.lastIndexOf(str; "a ");
        System.out.println("FirstA = " + FirstA);
        System.out.println("LastA = " + LastA);
        System.out.println("SecondA = " + SecondA);
        System.out.println("ThirdA = " + ThirdA);
        System.out.println("FourthA = " + FourthA);
        System.out.println("fifthA = " + fifthA);
        System.out.println("sixtA = " + sixtA);
        System.out.println("seventhA = " + seventhA);

    }
}
