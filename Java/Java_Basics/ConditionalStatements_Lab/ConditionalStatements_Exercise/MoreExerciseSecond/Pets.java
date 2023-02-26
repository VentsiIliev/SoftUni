package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysAway = Integer.parseInt(scanner.nextLine());
        int foodInKg = Integer.parseInt(scanner.nextLine());
        double dogDailyKg = Double.parseDouble(scanner.nextLine());
        double catDailyKg = Double.parseDouble(scanner.nextLine());
        double turtleDailyGr = Double.parseDouble(scanner.nextLine());

        double turtleDailyKg = turtleDailyGr / 1000;

        double  foodNeededKg = (dogDailyKg + catDailyKg + turtleDailyKg) * daysAway;

        double diff = Math.abs(foodNeededKg - foodInKg);
        if (foodInKg >= foodNeededKg){
            System.out.printf("%.0f kilos of food left.", Math.floor(diff));
        }else{
            System.out.printf("%.0f more kilos of food are needed.",Math.ceil(diff));
        }
    }
}
