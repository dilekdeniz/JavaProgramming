package fatihsQuestions;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {


        int[] array = {10, 20, -54, 10, 200};
        System.out.println((sum(array)));
    }

    public static int sum(int[] array) {

        int sum = 0;
        for (int each : array) {
            if ((each > 9 && each < 100) || (each < -9 && each > -100)) {
                sum += each;

            }


        }
        return sum;
    }
}
