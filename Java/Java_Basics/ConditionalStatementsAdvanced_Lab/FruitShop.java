package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double qty = Double.parseDouble(scanner.nextLine());

        double price = 0;
        double total = 0;
        boolean isError = false;

        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day)){
            switch (fruit){
                case "banana":
                    price = 2.5;
                    break;
                case "apple":
                    price = 1.2;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.7;
                    break;
                case "pineapple":
                    price = 5.5;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    isError = true;
            }
        } else if ("Saturday".equals(day) || "Sunday".equals(day)){
            switch (fruit){
                case "banana":
                    price = 2.7;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.9;
                    break;
                case "grapefruit":
                    price = 1.6;
                    break;
                case "kiwi":
                    price = 3;
                    break;
                case "pineapple":
                    price = 5.6;
                    break;
                case "grapes":
                    price = 4.2;
                    break;
                default:
                    isError = true;;
            }
        }else{
            isError = true;
        }

        total = qty * price;

        if (isError){
            System.out.println("error");
        }else {
            System.out.printf("%.2f", total);
        }

    }
}
