package NestedLoops_Lab;

import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination = scanner.nextLine();
        while (!destination.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double moneySaved = 0;
            while (moneySaved < minBudget) {
                double money = Double.parseDouble(scanner.nextLine());
                moneySaved += money;
            }
            System.out.printf("Going to %s!\n", destination);
            destination = scanner.nextLine();
        }
    }
}
