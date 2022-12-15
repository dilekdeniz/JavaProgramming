package day21_ForEachLoop;

public class UniqElements {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Adam", "Cihad", "Cihad", "Cydeo"};

        for (String each : words) { //outer loop
            int count = 0;
            for (String element : words) {//inner loop
                if (element.equals(each)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each);
            }

        }
    }
}