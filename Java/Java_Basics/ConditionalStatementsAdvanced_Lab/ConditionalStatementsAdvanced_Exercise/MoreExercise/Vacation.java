package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise.MoreExercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String accommodationType = "";
        String location = "";
        double price = 0;

        if (budget <= 1000) {
            accommodationType = "Camp";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.65;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.45;
                    break;

            }
        } else if (budget > 1000 && budget <= 3000) {
            accommodationType = "Hut";
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    price = budget * 0.8;
                    break;
                case "Winter":
                    location = "Morocco";
                    price = budget * 0.6;
                    break;
            }

        } else {
            accommodationType = "Hotel";
            price = budget * 0.9;
            switch (season) {
                case "Summer":
                    location = "Alaska";
                    break;
                case "Winter":
                    location = "Morocco";
                    break;
            }
        }

        System.out.printf("%s - %s - %.2f", location, accommodationType, price);
    }
}
