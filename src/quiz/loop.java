package quiz;

public class loop {
    public static void main(String[] args) {
        String loop = "12C45o45k 4t121es21654ek45k54ur e121d2er78i102m";
        String letters = "";
        for (int i = 0; i < loop.length(); i++) {
            char each=loop.charAt(i);
        if(each<='z'&&each>='a'|| each<='Z'&&each>='A'|| each==' '){

            letters+=each;


        }

        }
        System.out.println(letters);

    }
}





