package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double change = Double.parseDouble(scanner.nextLine());
        double changeInCoins = change * 100;

        int coinsCount = 0;
        while (changeInCoins > 0) {

            if (changeInCoins >= 200) {
                changeInCoins -= 200;
                coinsCount++;
            } else if (changeInCoins >= 100) {
                changeInCoins -= 100;
                coinsCount++;
            } else if (changeInCoins >= 50) {
                changeInCoins -= 50;
                coinsCount++;
            } else if (changeInCoins >= 20) {
                changeInCoins -= 20;
                coinsCount++;
            } else if (changeInCoins >= 10) {
                changeInCoins -= 10;
                coinsCount++;
            } else if (changeInCoins >= 5) {
                changeInCoins -= 5;
                coinsCount++;
            } else if (changeInCoins >= 2) {
                changeInCoins -= 2;
                coinsCount++;
            } else if (changeInCoins == 1) {
                changeInCoins -= 1;
                coinsCount++;
            } else {
                break;
            }
        }
        System.out.printf("%d", coinsCount);
    }
}