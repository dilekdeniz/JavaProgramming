package day33_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1=new Student("Ahmet");
        Student student2=new Student("Aygun",'F');
        Student student3=new Student("Nigara",11 );
        Student student4=new Student("Dilek", 11,'A');
        Student student5=new Student("Nihal",'F',30);
        Student student6=new Student("Emma",'F',20,12);
        Student student7=new Student("Gulsah",'F',30,50,'A');
        System.out.println(student2==student1); // false

        Student[]students={student1,student2,student3,student4,student5,student6,student7};
        System.out.println(Arrays.toString(students) );

    }
}
