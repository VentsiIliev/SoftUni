package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rounds = Integer.parseInt(scanner.nextLine());
        double result = 0;

        int zeroToTen = 0;
        int tenToNineteen = 0;
        int twentyToTwentynine = 0;
        int thirtyToThirtynine = 0;
        int fortyToFifty = 0;
        int invalidNumbers = 0;

        for (int i = 0; i < rounds; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number >= 0 && number < 10) {
                result += number * 0.2;
                zeroToTen++;
            } else if (number > 0 && number <= 19) {
                result += number * 0.3;
                tenToNineteen++;
            } else if (number > 0 && number <= 29) {
                result += number * 0.4;
                twentyToTwentynine++;
            } else if (number > 0 && number <= 39) {
                result += 50;
                thirtyToThirtynine++;
            } else if (number > 0 && number <= 50) {
                result += 100;
                fortyToFifty++;
            } else {
                result = result / 2;
                invalidNumbers++;
            }
        }

        double zeroToTenPercent = (1.0 * zeroToTen) / rounds * 100;
        double tenToNineteenPercent = (1.0 * tenToNineteen) / rounds * 100;
        double twentyToTwentyninePercent = (1.0 * twentyToTwentynine) / rounds * 100;
        double thirtyToThirtyninePercent = (1.0 * thirtyToThirtynine) / rounds * 100;
        double fortyToFiftyPercent = (1.0 * fortyToFifty) / rounds * 100;
        double invalidNumbersPercent = (1.0 * invalidNumbers) / rounds * 100;

        System.out.printf("%.2f\n", result);
        System.out.printf("From 0 to 9: %.2f%%\n", zeroToTenPercent);
        System.out.printf("From 10 to 19: %.2f%%\n", tenToNineteenPercent);
        System.out.printf("From 20 to 29: %.2f%%\n", twentyToTwentyninePercent);
        System.out.printf("From 30 to 39: %.2f%%\n", thirtyToThirtyninePercent);
        System.out.printf("From 40 to 50: %.2f%%\n", fortyToFiftyPercent);
        System.out.printf("Invalid numbers: %.2f%%", invalidNumbersPercent);
    }
}
