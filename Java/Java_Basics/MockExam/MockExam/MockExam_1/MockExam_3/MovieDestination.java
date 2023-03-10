package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double pricePerDay = 0;
        switch (season) {
            case "Winter":
                switch (destination) {
                    case "Dubai":
                        pricePerDay = 45000;
                        break;
                    case "Sofia":
                        pricePerDay = 17000;
                        break;
                    case "London":
                        pricePerDay = 24000;
                        break;
                }
                break;
            case "Summer":
                switch (destination) {
                    case "Dubai":
                        pricePerDay = 40000;
                        break;
                    case "Sofia":
                        pricePerDay = 12500;
                        break;
                    case "London":
                        pricePerDay = 20250;
                        break;
                }
                break;
        }
        double total = pricePerDay * days;
        if ("Dubai".equals(destination)) {
            total = total * 0.7;
        } else if ("Sofia".equals(destination)) {
            total = total * 1.25;
        }
        double difference = Math.abs(total - budget);
        if (budget >= total) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", difference);
        } else {
            System.out.printf("The director needs %.2f leva more!", difference);
        }
    }
}
