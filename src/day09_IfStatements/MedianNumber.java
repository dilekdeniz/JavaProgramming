package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 10, b = 15, c = 20;
        // if we have three different numbers, one must be min, one must be max, one must be median number
        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b < a && b > c);
        boolean cIsMedian = (c > a && c < b) || (c < a && c > b);
        // or you can write boolean cIsMedian = !aIsMedian &&!bIsMedian;
        if (aIsMedian) {
            System.out.println(a + " is  the median number");
        }
        if (bIsMedian) {
            System.out.println(b + " is the median number");
        }
        if (cIsMedian){
            System.out.println(c + " is the median number");
        }
    }
}



/* bu sekilde de yapabilirsin


    if (a <b && a>c) {
    System.out.println(a + "is median number");
}
    if (b<c && b>a){
        System.out.println(b +" is median number");
    }
    if (c>a && c<b){
        System.out.println(c + " is median number");
    }
*/


/*
2. Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers
			Ex:
				a = 10, b= 15, c = 20;
			Output:
				15 is the median number
			Possibility #1: a could be median number
			Possibility #2: b could be median number
			Possibility #3: c could be median number
 */