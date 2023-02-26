package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysStay = Integer.parseInt(scanner.nextLine());
        String accommodationType = scanner.nextLine();
        String feedback = scanner.nextLine();

        double pricePerNight = 0;

        switch (accommodationType){
            case "room for one person":
                pricePerNight = 18;
                break;
            case "apartment":
                pricePerNight = 25;
                if (daysStay > 15){
                    pricePerNight = pricePerNight * 0.5;
                } else if (daysStay < 10) {
                    pricePerNight = pricePerNight * 0.70;
                }else {
                    pricePerNight = pricePerNight * 0.65;
                }
                break;
            case "president apartment":
                pricePerNight = 35;
                if (daysStay > 15){
                    pricePerNight = pricePerNight * 0.8;
                } else if (daysStay < 10) {
                    pricePerNight = pricePerNight * 0.10;
                }else {
                    pricePerNight = pricePerNight * 0.85;
                }
                break;
        }

        double totalPrice = 0;

        if (feedback.equals("positive")){
            totalPrice = (daysStay - 1) * pricePerNight * 1.25;
        }else {
            totalPrice = (daysStay - 1) * pricePerNight * 0.9;
        }

        System.out.printf("%.2f", totalPrice);

    }
}
