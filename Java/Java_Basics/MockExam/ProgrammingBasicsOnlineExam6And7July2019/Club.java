package MockExam.ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public record Club() {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double profit = Double.parseDouble(scanner.nextLine());
        double totalProfit = 0;

        boolean isNotEnough = false;
        while (totalProfit <= profit) {
            String drinkName = "";
            int drinkCount = 0;
            double orderTotal = 0;

            String command = scanner.nextLine();

            if (command.equals("Party!")) {
                isNotEnough = true;
                break;
            } else {
                drinkName = command;
                drinkCount = Integer.parseInt(scanner.nextLine());
            }

            int drinkPrice = drinkName.length();
            orderTotal += drinkPrice * drinkCount;

            if (orderTotal % 2 != 0) {
                orderTotal = orderTotal * 0.75;
            }

            totalProfit += orderTotal;
        }

        double difference = Math.abs(profit - totalProfit);

        if (isNotEnough) {
            System.out.printf("We need %.2f leva more.\n", difference);
        } else {
            System.out.println("Target acquired.");
        }

        System.out.printf("Club income - %.2f leva.", totalProfit);
    }
}
