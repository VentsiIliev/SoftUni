package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise.MoreExercise;

import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double pricePerKilometer = 0;

        if (kilometersPerMonth <= 5000){
            if ("Spring".equals(season) || "Autumn".equals(season)){
                pricePerKilometer = 0.75;
            } else if ("Summer".equals(season)) {
                pricePerKilometer = 0.9;
            }else if ("Winter".equals(season)) {
                pricePerKilometer = 1.05;
            }
        } else if (kilometersPerMonth > 5000 && kilometersPerMonth <= 10000) {
            if ("Spring".equals(season) || "Autumn".equals(season)){
                pricePerKilometer = 0.95;
            }else if ("Summer".equals(season)) {
                pricePerKilometer = 1.1;
            }else if ("Winter".equals(season)) {
                pricePerKilometer = 1.25;
            }
        } else if (kilometersPerMonth > 10000  && kilometersPerMonth <= 20000) {
            pricePerKilometer = 1.45;
        }

        double total = kilometersPerMonth * pricePerKilometer * 4 * 0.9;

        System.out.printf("%.2f",total);
    }
}
