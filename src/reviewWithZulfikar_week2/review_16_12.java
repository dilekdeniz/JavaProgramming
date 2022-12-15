package reviewWithZulfikar_week2;

import java.util.Scanner;

public class review_16_12 {
    public static void main(String[] args) {


        String name = "Robert Down Junior";
        String n1 = name.substring(0, 1).toUpperCase() + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2) + "." +
                name.substring(name.lastIndexOf(" ") + 1);
        System.out.println(n1);// R.D. Junior

        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.print(sum);

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int multiplication = 1;
        for (int i = 0; i <= number; i++) {
            multiplication = number * i;
            System.out.println(number + "x" + i + "=" + multiplication);

        }
        String result = "";
        for (int j = 1; j <= 5; j++) {
            System.out.println("*".repeat(j));


        }
    }
}