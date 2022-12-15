package day33_Statics.homework;

public class PersonObject {
    public static void main(String[] args) {
        Person person1 = new Person("Dilek", 30, 'F');
        System.out.println(Person.hasWings);
        System.out.println(Person.isHuman);
        System.out.println(Person.numberOfEyes);
        System.out.println(Person.numberOfHead);
        System.out.println(person1);
        person1.sleep();
        person1.eat("pizza");
        person1.drink("coke");



    }
    }
