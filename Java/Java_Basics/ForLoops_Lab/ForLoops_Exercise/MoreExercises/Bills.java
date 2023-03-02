package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double waterBill = 20;
        double internetBill = 15;
        double otherBills = 0;

        double waterTotal = waterBill * months;
        double internetTotal = internetBill * months;
        double electricityTotal = 0;

        for (int i = 0; i < months; i++) {
            double electricityBill = Double.parseDouble(scanner.nextLine());
            otherBills = otherBills + (electricityBill + waterBill + internetBill) * 1.2;
            electricityTotal += electricityBill;
        }
        double average = ((internetTotal + waterTotal + electricityTotal + otherBills) / months);

        System.out.printf("Electricity: %.2f lv\n", electricityTotal);
        System.out.printf("Water: %.2f lv\n", waterTotal);
        System.out.printf("Internet: %.2f lv\n", internetTotal);
        System.out.printf("Other: %.2f lv\n", otherBills);
        System.out.printf("Average: %.2f lv", average);
    }
}
