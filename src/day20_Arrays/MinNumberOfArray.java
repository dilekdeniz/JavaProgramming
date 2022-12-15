package day20_Arrays;

public class MinNumberOfArray {
    public static void main(String[] args) {

        int []numbers={100, 500, 30, 40, 600, 80, 90};
        int min=numbers[0]; //100

        for (int i = 0; i < numbers.length; i++) {//i:0,1,2,3...
            if(numbers[i]<min){
                min=numbers[i];

            }
        }
        System.out.println(min);



        /*int[]numbers={10,20,30,7,5} // baska bir ornek
int min=10;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]<min){
                min=numbers[i];

            }
        }
*/
    }
}
