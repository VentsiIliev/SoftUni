package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class PipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int v = Integer.parseInt(scanner.nextLine());
        int p1DebitHour = Integer.parseInt(scanner.nextLine());
        int p2TwoDebitHour = Integer.parseInt(scanner.nextLine());
        double hours = Double.parseDouble(scanner.nextLine());

        double p1Contribution = p1DebitHour * hours;
        double p2Contribution = p2TwoDebitHour * hours;
        double waterPoured = p1Contribution+ p2Contribution;

        double poolLevel = waterPoured / v * 100;
        double p1percent = p1Contribution / waterPoured * 100;
        double p2percent = p2Contribution / waterPoured * 100;
        double diff = v - waterPoured;

        if (v >= waterPoured) {
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%", poolLevel, p1percent, p2percent);
            //System.out.printf("The pool is %.2f% full. Pipe 1: %.2f%. Pipe 2: %.2f%.", poolLevel, p1percent, p2percent);
        } else
            System.out.printf("For %.2f hours the pool overflows with %.2f liters.", hours, Math.abs(diff));
    }
}
