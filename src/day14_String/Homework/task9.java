package day14_String.Homework;

public class task9 {
    public static void main(String[] args) {
        /*
        9. Create a class called EmailTask2.
Assume that email address is constructed by person's first name and
followed by an underscore and last name.
Write a program that will print out information about user based on
email. Print first name, last name, and domain.
First and Last name should be printed with proper format -
uppercase first letter and remaining lowercase.
Ex:
input:
craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
         */
        String email="craig_federighi@apple.com";
    String firstName=email.substring(0,email.indexOf("_"));
    String lastName=email.substring(email.indexOf("_")+1,email.indexOf("@"));
    String domain=email.substring(email.indexOf("@")+1,email.indexOf("."));

        firstName = (""+firstName.charAt(0)).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName = (""+lastName.charAt(0)).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println("First name: "+firstName + "\n" + "Last name: "+lastName+ "\n" + "Domain: "+domain);

    }
}
