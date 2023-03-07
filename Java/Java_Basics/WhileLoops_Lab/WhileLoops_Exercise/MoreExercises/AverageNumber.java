package WhileLoops_Lab.WhileLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int number = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            number = Integer.parseInt(scanner.nextLine());
            sum += number;
        }
        double average = (sum * 1.0) / n;
        System.out.printf("%.2f", average);
    }
}
