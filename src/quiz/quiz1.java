package quiz;

import java.util.ArrayList;
import java.util.Arrays;

public class quiz1 {
    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>(Arrays.asList
        ("during","storm","rain","fell","season","cloudy","safe"));
        ArrayList<Integer>lengts=new  ArrayList<>();
        for(String word:words){
            lengts.add(word.length());

        }
        System.out.println(lengts);
    }
}
