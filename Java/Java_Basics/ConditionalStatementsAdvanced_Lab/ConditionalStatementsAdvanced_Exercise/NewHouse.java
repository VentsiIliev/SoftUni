package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowersType = scanner.nextLine();
        int flowerCount = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double total = 0;

        switch (flowersType) {
            case "Roses":

                if (flowerCount <= 80 && flowerCount >= 0) {
                    price = 5;
                } else if (flowerCount > 80) {
                    price = 5 * 0.9;
                }
                break;

            case "Dahlias":

                if (flowerCount <= 90 && flowerCount >= 0) {
                    price = 3.8;
                } else if (flowerCount > 90) {
                    price = 3.8 * 0.85;
                }
                break;

            case "Tulips":

                if (flowerCount <= 80 && flowerCount >= 0) {
                    price = 2.8;
                } else if (flowerCount > 80) {
                    price = 2.8 * 0.85;
                }
                break;

            case "Narcissus":
                if (flowerCount >= 120) {
                    price = 3;
                } else  {
                    price = 3 * 1.15;
                }
                break;

            case "Gladiolus":
                if (flowerCount >= 80) {
                    price = 2.5;
                } else {
                    price = 2.5 * 1.20;
                }
                break;
        }

        total = flowerCount * price;
        double diff = Math.abs(budget - total);

        if (budget >= total){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerCount, flowersType, diff );
        }else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}