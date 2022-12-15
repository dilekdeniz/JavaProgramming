package replit;

import java.util.Scanner;

public class Email {
    public static void main(String[] args) {
        //DO NOT TOUCH FOLLOWING LINE/LINES
        /*
          String email="Cydeo.School@gmail.com";
        //domain:
        int beginningIndex=email.indexOf("@")+1;
       int endingIndex= email.lastIndexOf(".");
       String domain = email.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);
         */
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        //WRITE YOUR CODE BELOW
        String firstName=""+email.substring(0,email.indexOf("_"));
        String lastName=""+email.substring(email.indexOf("_")+1,email.indexOf("@"));
        String domain = email.substring(email.indexOf("@")+1,email.indexOf("."));
        firstName= (""+firstName.charAt(0) ).toUpperCase()+ firstName.substring(1).toLowerCase();
        lastName = ("" + lastName.charAt(0)).toUpperCase()+ lastName.substring(1).toLowerCase();

        System.out.println("First name : "+ firstName+ "\n" + "Last name : "+ lastName+ "\n"+ "Domain : " + domain);
    }

    }
