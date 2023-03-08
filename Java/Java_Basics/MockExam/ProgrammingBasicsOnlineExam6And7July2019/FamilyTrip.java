package MockExam.ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double pricePerNight = Double.parseDouble(scanner.nextLine());
        int percentExtraSpending = Integer.parseInt(scanner.nextLine());

        double moneyLeft = budget - budget * ((percentExtraSpending * 1.0 ) / 100);

        if (nights > 7) {
            pricePerNight = pricePerNight * 0.95;
        }

        double stayTotal = nights * pricePerNight;

        double difference = Math.abs(stayTotal - moneyLeft);
        if (stayTotal <= moneyLeft) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", difference);
        }else {
            System.out.printf("%.2f leva needed.", difference);
        }
    }
}
