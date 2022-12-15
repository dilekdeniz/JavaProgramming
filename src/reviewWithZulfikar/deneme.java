package reviewWithZulfikar;

public class deneme {
    public static void main(String[] args) {
        String name="home";
        for (int i = 0; i <name.length() ; i++) {
            char ch=name.charAt(i);
            if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')){
                continue;
            }
            System.out.println(ch);
        }
    }
}
