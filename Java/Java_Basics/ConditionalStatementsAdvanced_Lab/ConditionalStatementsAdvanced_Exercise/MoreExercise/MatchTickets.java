package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise.MoreExercise;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String ticketCategory = scanner.nextLine();
        int peopleCount = Integer.parseInt(scanner.nextLine());

        double moneyNeeded = 0;
        double moneyLeft = 0;
        boolean isMoneyEnough = false;

        if (peopleCount >=1 && peopleCount <=4){
            moneyLeft = budget * 0.25;
        } else if (peopleCount >= 5 && peopleCount <= 9) {
            moneyLeft = budget * 0.4;
        } else if (peopleCount >= 10 && peopleCount <= 24) {
            moneyLeft = budget * 0.5;
        } else if (peopleCount >= 25 && peopleCount <= 49) {
            moneyLeft = budget * 0.6;
        }else {
            moneyLeft = budget * 0.75;
        }

        switch (ticketCategory){
            case "VIP":
                moneyNeeded = peopleCount * 499.99;
                break;
            case "Normal":
                moneyNeeded = peopleCount * 249.99;
                break;
        }

        double diff = Math.abs(moneyNeeded - moneyLeft);

        if (moneyLeft >= moneyNeeded){
            isMoneyEnough = true;
        }
        if (isMoneyEnough){
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
