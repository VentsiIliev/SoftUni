package MockExam.MockExam_1.MockExam_2;

import java.util.Scanner;

public class OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rent = Integer.parseInt(scanner.nextLine());

        double statuesTotal = rent * 0.7;
        double cateringTotal = statuesTotal * 0.85;
        double soundTotal = (cateringTotal * 1.0) / 2;

        double total = rent + statuesTotal + cateringTotal + soundTotal;

        System.out.printf("%.2f", total);

    }
}
