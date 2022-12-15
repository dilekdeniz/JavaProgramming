package day25_CustomMethods_Overloading;

import utilities.ArraysUtility;

public class Test2_ArrayUtility {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("------------------------");

        double[]arr2={1.5,2.5,3.8,4.2};
        ArraysUtility.printEachElement(arr2);

        System.out.println("----------------- ------");

        char[]arr3={'a','b','c','d'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------------");

        String[]arr4={"Hello", "Cydeo", };
        ArraysUtility.printEachElement(arr4);

        System.out.println("------------------------");

        int[]n1={1,3,4,2,5,8};
        int max=ArraysUtility.max(n1);
        System.out.println("max number is= "+max);

        System.out.println("------------------------");

        double[]n2={1.5,2.7,3.5,1.2};
        double max2=ArraysUtility.max(n2);
        System.out.println("max2 is= "+max2);
        System.out.println("------------------------");

        int[]number={1,5,4,2,3};
        int min=ArraysUtility.min(number);
        System.out.println("------------------------");

        int[] a1 = {1,2,3,4,5,6,7};

        boolean r1 = ArraysUtility.contains(a1, 10);

        System.out.println("r1 = " + r1);
    }
}
