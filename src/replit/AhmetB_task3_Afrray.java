package replit;

import java.util.Arrays;

public class AhmetB_task3_Afrray {
    public static void main(String[] args) {
        // ayni indexe sahip elementleri toplayip yeni olusturacagmz bir arrey bu toplamlari atayin
   int[][] arr={{3,4,5}, {2,3,6,7}};
  // input {{3,4,5},{2,3,6,7}};
        //3+2=5, 4+3=7.5+6=11
        //[5,7,11];

   //inner 2 array olacaigini ama bunlarin uzunluklarinin degisebilegini kabul ettk
        int ortakImdexSayisi=arr[0].length<arr[1].length ? arr[0].length: arr[1].length;

      int[]  ortakIndexToplamlari=new int [ortakImdexSayisi];
        for (int i = 0; i < ortakIndexToplamlari.length; i++) {
ortakIndexToplamlari[i]=arr[0][i]+arr[1][i];
        }
        System.out.println(Arrays.toString(ortakIndexToplamlari));
    }
}
