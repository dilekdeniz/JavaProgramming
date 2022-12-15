package day20_Arrays;

public class MaxNumberOfArray {
    public static void main(String[] args) {

        int []numbers={10, 5, 4, 20, 1, 0};
        int max=numbers[0];//10 this is just assemption
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max) { //if there in the array that is grater than the current max number
                max = numbers[i];
            }
        }

        System.out.println(max);



    }
}
