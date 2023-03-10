package MockExam.MockExam_1.MockExam_2;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double people = Double.parseDouble(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.1;

        double clothesTotal = 0;
        if (people > 150) {
            clothes = clothes * 0.9;
            clothesTotal = people * clothes;

        }else {
            clothesTotal = people * clothes;
        }

        double total = clothesTotal + decor;

        double difference = Math.abs(total - budget);

        if (total > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }
    }
}
