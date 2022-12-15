package replit;

import java.util.Arrays;

public class AhmetB_Task_Array {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de her bir ic arraydeki elementleri toplayip, yeni olusturacagimiz tek katli bir array’e bu toplamlari atayin.input :
int[][] arr = {{3,4,5}, {2,3,6,7}}; output: [12,18]
         */
        int[][] arr = {{3, 1, 2, 4}, {1, 2}, {3, 4, 5}, {10}, {2, 7}};
        int[] outPut = new int[arr.length];
        int innertoplami = 0;
        for (int i = 0; i < arr.length; i++) {
            innertoplami = 0;
            for (int j = 0; j < arr[i].length; j++) {
                innertoplami += arr[i][j];
            }

            outPut[i] = innertoplami;
        }
        System.out.println(Arrays.toString(outPut));
    }
}
