package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double moneyNeeded = 0;
        boolean isNotEnough = false;
        int actorsCount = 0;
        String command = scanner.nextLine();
        while (budget >= 0) {
            double pay = 0;
            String name = "";

            if ("ACTION".equals(command)) {
                break;
            } else {
                name = command;
            }

            if (name.length() > 15) {
                pay = budget * 0.2;
                if (pay > budget) {
                    isNotEnough = true;
                    budget = Math.abs(budget - pay);
                    break;
                } else {
                    budget -= pay;
                }
            } else {
                pay = Double.parseDouble(scanner.nextLine());
                if (pay > budget) {
                    isNotEnough = true;
                    budget = Math.abs(budget - pay);
                    break;
                } else {
                    budget -= pay;
                }
            }

            command = scanner.nextLine();
        }
        if (isNotEnough) {
            System.out.printf("We need %.2f leva for our actors.", budget);
        } else {
            System.out.printf("We are left with %.2f leva.", budget);
        }
    }
}
