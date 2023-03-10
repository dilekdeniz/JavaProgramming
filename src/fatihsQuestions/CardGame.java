package fatihsQuestions;

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER A NUMBER BETWEEN 1 AND 52");
        int cardNumber = scan.nextInt();
        scan.close();

        String cardRank = "";
        String cardSuit = "";
        boolean flag = true;

        switch (cardNumber / 14) { // needs to be 14, not 13, because 14 is the first number of the next card type
            case 0:
                cardSuit = "Clubs";
                break;
            case 1:
                cardSuit = "Diamonds";
                break;
            case 2:
                cardSuit = "Hearts";
                break;
            case 3:
                cardSuit = "Spades";
                break;
            default:
                System.out.println("Invalid card number");
                flag = false;
        }

        if (flag) {

            switch (cardNumber % 13) {
                case 0:
                    cardRank = "King";
                    break;
                case 1:
                    cardRank = "Ace";
                    break;
                case 11:
                    cardRank = "Jack";
                    break;
                case 12:
                    cardRank = "Queen";
                    break;
                default:
                    cardRank = (cardNumber % 13) + "";  // Converting a number to a string.
            }
            if (cardNumber < 1)
                System.out.println("invalid card number ");
            else {
                System.out.println("The card you picked is " + cardRank + " of " + cardSuit);
            }

        }
    }
}

