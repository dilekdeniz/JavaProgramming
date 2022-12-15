package reviewWith_Zulfikar_071222;

public class CustomMethods {
    public static void main(String[] args) {
     webTesting();
     apiTesting();
     manuelTesting("Ahmet");
     manuelTesting("Ahmet","Google");
     dateTesting();
     String s="house";

    }
    public static void manuelTesting(String name){
        System.out.println(name+" ,please test this manuel test");
    }
    public static void manuelTesting(String name,String projectName) {
        System.out.println(name+", please test this"+projectName+" manuel tes");

    }
    public static void webTesting() {
        System.out.println("This is for web testing");
    }
    public static void apiTesting(){
        System.out.println("This is for web testing");
    }
    public static void dateTesting(){
        System.out.println("This is for api testing");
    }

    }

