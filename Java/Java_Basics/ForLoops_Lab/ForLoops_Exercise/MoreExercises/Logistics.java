package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int loadCount = Integer.parseInt(scanner.nextLine());

        double loadPrice = 0;
        String vehicle = "";

        int vanTonsCount = 0;
        int truckTonsCount = 0;
        int trainTonsCount = 0;
        int totalTons = 0;

        for (int i = 0; i < loadCount; i++) {
            int tons = Integer.parseInt(scanner.nextLine());
            totalTons += tons;

            if (tons <= 3) {
                vehicle = "van";
                loadPrice = 200 * tons;
                vanTonsCount += tons;
            } else if (tons <= 11) {
                vehicle = "truck";
                loadPrice = 175 * tons;
                truckTonsCount += tons;
            } else {
                vehicle = "train";
                loadPrice = 120 * tons;
                trainTonsCount += tons;
            }
        }
        double vansPercent = vanTonsCount * 1.0 / totalTons * 100;
        double truckPercent = truckTonsCount * 1.0 / totalTons * 100;
        double trainPercent = trainTonsCount * 1.0 / totalTons * 100;
        double averagePrice = (vanTonsCount * 200 + truckTonsCount * 175 + trainTonsCount * 120) / (totalTons * 1.0);

        System.out.printf("%.2f\n", averagePrice);
        System.out.printf("%.2f%%\n", vansPercent);
        System.out.printf("%.2f%%\n", truckPercent);
        System.out.printf("%.2f%%\n", trainPercent);

    }
}
