package day05_Concatenation;

import day02_HelloWorld.HelloCydeo;

import java.nio.channels.OverlappingFileLockException;

public class FullName {
    public static void main(String[] args) {
        String firstName ="Dilek";
        String lastName = "Deniz";
        int age= 30;
        String companyName = "Cydeo";
        String jobTitle = "SDET";
        int salary =100000;
        String fullName = firstName +  " "  +  lastName;
        System.out.println("firstName = " + firstName);
        System.out.println("lastName = " + lastName);
        System.out.println("fullName = "  + fullName);
// fullName of the person is-----
        System.out.println("Full name of the person is " + fullName);
        // ---is---years old
        System.out.println(fullName + " is "+ age + " years old.");
        //Fullname is JobTitle, works at CompanyName, and FullNAme' salary is Salary
        System.out.println(fullName + " is " + jobTitle +", works at " + companyName
                +" , and "+fullName + "'s salary is $" +salary);


    }
}
