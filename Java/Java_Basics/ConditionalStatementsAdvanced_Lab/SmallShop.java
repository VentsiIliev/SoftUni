package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String product = scanner.nextLine();
        String town = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());

        double price = 0;

        switch (product) {
            case "coffee":
                switch (town) {
                    case "Sofia":
                        price = 0.50;
                        break;
                    case "Plovdiv":
                        price = 0.40;
                        break;
                    case "Varna":
                        price = 0.45;
                        break;
                }
                break;

            case "water":
                switch (town) {
                    case "Sofia":
                        price = 0.8;
                        break;
                    case "Plovdiv":
                        price = 0.70;
                        break;
                    case "Varna":
                        price = 0.70;
                        break;
                }
                break;

            case "beer":
                switch (town) {
                    case "Sofia":
                        price = 1.2;
                        break;
                    case "Plovdiv":
                        price = 1.15;
                        break;
                    case "Varna":
                        price = 1.10;
                        break;
                }
                break;

            case "sweets":
                switch (town) {
                    case "Sofia":
                        price = 1.45;
                        break;
                    case "Plovdiv":
                        price = 1.3;
                        break;
                    case "Varna":
                        price = 1.35;
                        break;
                }
                break;

            case "peanuts":
                switch (town) {
                    case "Sofia":
                        price = 1.6;
                        break;
                    case "Plovdiv":
                        price = 1.5;
                        break;
                    case "Varna":
                        price = 1.55;
                        break;
                }
        }
        double total = qty * price;
        System.out.printf("%2f", total);
    }
}