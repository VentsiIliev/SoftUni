package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kilometers = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();
        double price = 0;

        if (kilometers < 20 && kilometers >= 0 && timeOfDay.equals("day")) {
            price = kilometers * 0.79 + 0.7;
        } else if (kilometers < 20 && kilometers >= 0 && timeOfDay.equals("night")) {
            price = kilometers * 0.90 + 0.7;
        } else if (kilometers >= 20 && kilometers < 100) {
            price = kilometers * 0.09;
        } else {
            price = kilometers * 0.06;
        }
        System.out.printf("%.2f",price);
    }
}