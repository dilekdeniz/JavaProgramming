package day33_Statics.homework;

public class CydeoStudent {

    public String name;
    public int age,batchNumber, groupNumber;
    public char gender,grade;
    public static String schoolName="Cydeo";
    public static String programmingLanguage="Java";

    public CydeoStudent(String name, int age, int batchNumber, int groupNumber, char gender, char grade) {
        this.name = name;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.gender = gender;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name+" study");
    }
    public void attendClass(){
        System.out.println(name+"attended the class");
    }
    static {
        programmingLanguage="Java";
        schoolName="Cydeo";
    }


    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", gender=" + gender +
                ", grade=" + grade +
                ", schoolName=" + schoolName +
                ", programmingLanguage=" + programmingLanguage +

                '}';
    }
}

/*
1. CydeoStudent Task
1. Create a class named CydeoStudent:
Attributes:
instances: name, age,
gender, id, grade, batchNumber, groupNumber
statics: schoolName,
programmingLanguage
Add a constructor that can set All the
fields (instances)
Actions:
study()
attendClass()
printSchoolName(): displays
the school name
printProgLanguage():
displays the name of programming language
toString()
 */