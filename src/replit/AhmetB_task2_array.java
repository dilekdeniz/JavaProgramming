package replit;

public class AhmetB_task2_array {
    public static void main(String[] args) {
        int[][] arr = {{5, 7}, {5, 8, 9}, {0, 1}};
      //  her bir inner arrayin son elementinin toplami icin methid olustur
   // yani 7+9+1=17 sonucunu elde etmemiz lazim/ arr[0].lengt-1, arr[1].length-1,
        // arr[2].lenght-1;
        sonElementlerinToplami(arr);
    }

    public static void sonElementlerinToplami(int [][]arr){
    int toplam=0;
        for (int i = 0; i < arr.length; i++) {
          toplam+=  arr[i][(arr[i].length-1)];
        }
        System.out.println("inner arraylarin son elementlerinin toplami: " +toplam);
    }




}
