package MockExam.MockExam_1.MockExam_3;

import javax.swing.plaf.basic.BasicTextUI;
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Series {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int showsCount = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;
        for (int i = 0; i < showsCount; i++) {
            String showName = scanner.nextLine();
            double showPrice = Double.parseDouble(scanner.nextLine());

            switch (showName) {
                case "Thrones":
                    showPrice = showPrice * 0.5;
                    totalPrice += showPrice;
                    break;
                case "Lucifer":
                    showPrice = showPrice * 0.6;
                    totalPrice += showPrice;
                    break;
                case "Protector":
                    showPrice = showPrice * 0.7;
                    totalPrice += showPrice;
                    break;
                case "TotalDrama":
                    showPrice = showPrice * 0.8;
                    totalPrice += showPrice;
                    break;
                case "Area":
                    showPrice = showPrice * 0.9;
                    totalPrice += showPrice;
                    break;
                default:
                    totalPrice += showPrice;

            }
        }
        double difference = Math.abs(budget - totalPrice);
        if (totalPrice > budget) {
            System.out.printf("You need %.2f lv. more to buy the series!", difference);
        } else {
            System.out.printf("You bought all the series and left with %.2f lv.", difference);
        }
    }
}
