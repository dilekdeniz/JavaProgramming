package day15_ForLoop;

public class ReplaceX {
    public static void main(String[] args) {

        /*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea
 */
        String str="xcodes";
     String result=   str.replace("x","a").replace("X", "a");
            //acodeX                                    acodea
        System.out.println(result);

    }
}
