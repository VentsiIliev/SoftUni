package ForLoops_Lab.ForLoops_Exercise;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int openTabs = Integer.parseInt(scanner.nextLine());
        double salary = Double.parseDouble(scanner.nextLine());

        double totalFine = 0;
        for (int i = 0; i < openTabs; i++) {
            String website = scanner.nextLine();
            switch (website) {
                case "Facebook":
                    totalFine = totalFine + 150;
                    break;
                case "Instagram":
                    totalFine = totalFine + 100;
                    break;
                case "Reddit":
                    totalFine = totalFine + 50;
                    break;
            }
            if (totalFine >= salary) {
                break;
            }
        }
        double diff = salary - totalFine;

        if (totalFine < salary) {
            System.out.printf("%.0f", diff);
        } else {
            System.out.printf("You have lost your salary.");
        }
    }
}