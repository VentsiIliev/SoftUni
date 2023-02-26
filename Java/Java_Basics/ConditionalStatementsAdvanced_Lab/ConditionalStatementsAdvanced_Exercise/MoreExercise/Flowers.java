package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise.MoreExercise;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holidayOrNot = scanner.nextLine();

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;
        boolean isHoliday = false;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = 2;
                rosesPrice = 4.1;
                tulipsPrice = 2.5;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.5;
                tulipsPrice = 4.15;
                break;
        }

        double total = (chrysanthemums * chrysanthemumsPrice) + (roses * rosesPrice) + (tulips * tulipsPrice);

        if (holidayOrNot.equals("Y")) {
            total = total * 1.15;
        }

        if (tulips > 7 && season.equals("Spring")) {
            total = total * 0.95;

        }
        if (roses >= 10 && season.equals("Winter")){
            total = total * 0.9;
        }

        int flowersTotal = chrysanthemums + roses + tulips;

        if (flowersTotal > 20){
            total = total * 0.8;
        }

        total = total + 2;

        System.out.printf("%.2f",total);
    }
}
