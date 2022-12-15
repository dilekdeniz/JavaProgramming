package day26_FrequencyMethodsPractice;

public class Merge2Arrays {
    public static int[]merge(int[]arr1, int []arr2){
        int[]result=new int[arr1.length+arr2.length];
        int i=0;
        for (int each:arr1){
            result[i++]=each;
        }
        for (int each:arr2){
            result[i++]=each;
        }
        return result;
    }
}
