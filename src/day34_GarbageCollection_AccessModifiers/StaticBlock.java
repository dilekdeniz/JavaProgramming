package day34_GarbageCollection_AccessModifiers;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method");
    }
    static {
        System.out.println("Static block");// it runs before everything and only runs one time
    }
    static {
        System.out.println("static block 2");
    }
    static {
        System.out.println("static block 3");
    }
}

