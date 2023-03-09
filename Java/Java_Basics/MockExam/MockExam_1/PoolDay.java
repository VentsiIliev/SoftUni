package MockExam.MockExam_1;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeople = Integer.parseInt(scanner.nextLine());
        double entryFee = Double.parseDouble(scanner.nextLine());
        double loungerPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double totalEntryFee = totalPeople * entryFee;
        double umbrellaTotalPrice = Math.ceil((totalPeople * 1.0) / 2) * umbrellaPrice;
        double totalLongerPrice = Math.ceil((totalPeople * 1.0) * 0.75) * loungerPrice;

        double total = totalEntryFee + umbrellaTotalPrice + totalLongerPrice;

        System.out.printf("%.2f lv.", total);
    }
}
