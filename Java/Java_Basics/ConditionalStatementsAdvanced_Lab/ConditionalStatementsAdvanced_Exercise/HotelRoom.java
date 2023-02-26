package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0;
        double apartmentPrice = 0;

        switch (month){
            case "May":
            case "October":
                studioPrice = 50;
                apartmentPrice = 65;
                if (nightsCount > 14){
                    studioPrice = studioPrice * 0.7;
                } else if ( nightsCount > 7) {
                    studioPrice = studioPrice * 0.95;
                }
                break;
            case "June":
            case "September":
                studioPrice = 75.20;
                apartmentPrice = 68.70;
                if (nightsCount > 14){
                    studioPrice = studioPrice * 0.8;
                }
                break;
            case "July":
            case "August":
                studioPrice = 76;
                apartmentPrice = 77;
                break;
        }

        if (nightsCount > 14){
            apartmentPrice = apartmentPrice * 0.9;
        }

        double apartmentTotal = nightsCount * apartmentPrice;
        double studioTotal = nightsCount * studioPrice;

        System.out.printf("Apartment: %.2f lv.\n", apartmentTotal);
        System.out.printf("Studio: %.2f lv.", studioTotal);

    }
}
