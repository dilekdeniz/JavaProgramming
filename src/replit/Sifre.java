package replit;

import java.util.Scanner;

public class Sifre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean sifreGecerlimi = false;
        String girilensifre = "";
        int flag = 0;

        while (sifreGecerlimi != true) {
            System.out.println("Sifre giriniz");
            girilensifre = scan.nextLine();
            flag = 0;

            if (!(girilensifre.charAt(0) >= 'a' && girilensifre.charAt(0) <= 'z')) {
                System.out.println("Sifrenin ilk karakteri kucuk olmali");
                flag++;
            }
            if (!(girilensifre.charAt(girilensifre.length() - 1) >= '0' && girilensifre.charAt(girilensifre.length() - 1) <= '9')) {
                System.out.println("Sifrenin son karakteri sayi olmali");
                flag++;
            }
            if (girilensifre.length() < 9) {
                System.out.println("sifre en az 8 karakter olmali");
                flag++;
            }
            if (flag == 0) {
                sifreGecerlimi = true;
                System.out.println("Sifreniz basari ile kaydedildi");


            }
        }


    }
}



