package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {
        String email="Cydeo.School@gmail.com";
        //domain:
        int beginningIndex=email.indexOf("@")+1;
       int endingIndex= email.lastIndexOf(".");
       String domain = email.substring(beginningIndex,endingIndex);
        System.out.println("domain = " + domain);

        String str1="Java is fun, Java is cool, I love Java";
        String s1=str1.substring(0, 10+1); //java is fun
        int beg=str1.indexOf(" J")+1;
        int end = str1.lastIndexOf(",");
        String s2=str1.substring(beg,end);//java is cool
        String s3 =str1.substring(str1.lastIndexOf("I"));

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);



    }
}
