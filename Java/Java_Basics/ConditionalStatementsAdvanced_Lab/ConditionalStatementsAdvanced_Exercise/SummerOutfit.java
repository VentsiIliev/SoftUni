package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int temperature = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (temperature >= 10 && temperature <= 18) {
            switch (timeOfDay) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        if (temperature > 18 && temperature <= 24) {
            switch (timeOfDay) {
                case "Morning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
        }
        if (temperature >= 25) {
            switch (timeOfDay) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", temperature, outfit, shoes);

    }
}
