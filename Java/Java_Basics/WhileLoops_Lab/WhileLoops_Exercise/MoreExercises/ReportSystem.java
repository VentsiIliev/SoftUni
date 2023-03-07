package WhileLoops_Lab.WhileLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int moneyNeeded = Integer.parseInt(scanner.nextLine());

        int moneyRaised = 0;

        int cardCustomers = 0;
        int cardPaymentTotal = 0;

        int cashCustomers = 0;
        int cashPaymentTotal = 0;

        int customerCount = 1;
        boolean isMoneyEnough = false;

        while (moneyRaised < moneyNeeded) {
            String command = scanner.nextLine();
            int itemPrice = 0;

            if (command.equals("End")) {
                break;
            } else {
                itemPrice = Integer.parseInt(command);
            }

            if (customerCount % 2 == 0) {
                if (itemPrice < 10) {
                    customerCount++;
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cardPaymentTotal += itemPrice;
                    cardCustomers++;
                    customerCount++;
                    moneyRaised += itemPrice;
                }
            } else {
                if (itemPrice > 100) {
                    customerCount++;
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    cashPaymentTotal += itemPrice;
                    cashCustomers++;
                    customerCount++;
                    moneyRaised += itemPrice;
                }
            }

            if (moneyRaised >= moneyNeeded) {
                isMoneyEnough = true;
                break;
            }
        }
        if (isMoneyEnough) {
            double averageCashPayments = (cashPaymentTotal * 1.0) / cashCustomers;
            double averageCardPayments = (cardPaymentTotal * 1.0) / cashCustomers;
            System.out.printf("Average CS: %.2f\n", averageCashPayments);
            System.out.printf("Average CC: %.2f", averageCardPayments);
        } else {
            System.out.println("Failed to collect required money for charity.");
        }
    }
}
