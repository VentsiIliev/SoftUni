package MockExam.ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String brew = scanner.nextLine();
        String sugar = scanner.nextLine();
        int qty = Integer.parseInt(scanner.nextLine());

        double brewPrice = 0;

        switch (brew) {
            case "Espresso":
                brewPrice = 0.9;
                if (sugar.equals("Without")) {
                    brewPrice = brewPrice * 0.65;
                } else if (sugar.equals("Normal")) {
                    brewPrice = 1;
                } else {
                    brewPrice = 1.2;
                }
                if (qty >= 5) {
                    brewPrice = brewPrice * 0.75;
                }
                break;
            case "Cappuccino":
                brewPrice = 1;
                if (sugar.equals("Without")) {
                    brewPrice = brewPrice * 0.65;
                } else if (sugar.equals("Normal")) {
                    brewPrice = 1.2;
                } else {
                    brewPrice = 1.60;
                }
                break;
            case "Tea":
                brewPrice = 0.5;
                if (sugar.equals("Without")) {
                    brewPrice = brewPrice * 0.65;
                } else if (sugar.equals("Normal")) {
                    brewPrice = 0.6;
                } else {
                    brewPrice = 0.7;
                }
                break;
        }
        double total = qty * brewPrice;
        if (total > 15) {
            total = total * 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", qty, brew, total);
    }
}
