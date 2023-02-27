package ForLoops_Lab.ForLoops_Exercise;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        double toyPrice = Double.parseDouble(scanner.nextLine());

        double moneySaved = 0;
        int toysCount = 0;
        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                moneySaved += i * 5 - 1;
            } else {
                toysCount++;
            }
        }
        double moneyFromToys = toysCount * toyPrice;
        double totalSaved = moneyFromToys + moneySaved;
        double diff = Math.abs(washingMachinePrice - totalSaved);

        if (washingMachinePrice <= totalSaved) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
