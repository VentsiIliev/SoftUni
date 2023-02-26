package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String destination = "";

        if (budget <= 100){
            destination = "Bulgaria";
        } else if (budget <= 1000) {
            destination = "Balkans";
        } else if (budget > 1000) {
            destination = "Europe";
        }

        double price = 0;
        String accommodation = "";

        switch (destination){
            case "Bulgaria":
                switch (season){
                    case "summer":
                        price = budget * 0.3;
                        accommodation = "Camp";
                        break;
                    case "winter":
                        price = budget * 0.7;
                        accommodation = "Hotel";
                        break;
                }
                break;

            case "Balkans":
                switch (season){
                    case "summer":
                        price = budget * 0.4;
                        accommodation = "Camp";
                        break;
                    case "winter":
                        price = budget * 0.8;
                        accommodation = "Hotel";
                        break;
                }
                break;

            case "Europe":
                switch (season){
                    case "summer":
                    case "winter":
                        price = budget * 0.9;
                        accommodation = "Hotel";
                        break;
                }
                break;

        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", accommodation, price);
    }
}
