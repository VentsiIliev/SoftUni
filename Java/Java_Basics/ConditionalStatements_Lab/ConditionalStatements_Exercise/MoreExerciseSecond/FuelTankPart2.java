package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double liters = Double.parseDouble(scanner.nextLine());
        String clubCard = scanner.nextLine();

        double gasPrice = 0.93;
        double gasolinePrice = 2.22;
        double dieselPrice = 2.33;

        //double price = 0;
        double total = 0;
        double discountPrice = 0;

        if ("Yes".equals(clubCard) && "Gas".equals(fuelType)){
            discountPrice = gasPrice - 0.08;
            if (liters >= 20 && liters <= 25) {
                total = 0.92 * discountPrice * liters;
                
            } else if (liters > 25) {
                total = 0.90 * discountPrice * liters;
            } else if (liters < 20 && liters >= 0) {
                total = liters * discountPrice;
            }

        } if ("No".equals(clubCard) && "Gas".equals(fuelType)) {
            if (liters >= 20 && liters <= 25){
                total = 0.92 * gasPrice * liters;
            } else if (liters > 25) {
                total = 0.90 * gasPrice * liters;
            }else if (liters < 20 && liters >= 0) {
                total = liters * gasPrice;
            }
        }

        if ("Yes".equals(clubCard) && "Diesel".equals(fuelType)){
            discountPrice = dieselPrice - 0.12;
            if (liters >= 20 && liters <= 25) {
                total = 0.92 * discountPrice * liters;

            } else if (liters > 25) {
                total = 0.90 * discountPrice * liters;

            }else if (liters < 20 && liters >= 0) {
                total = liters * discountPrice;
            }

        } if ("No".equals(clubCard) && "Diesel".equals(fuelType)) {
            if (liters >= 20 && liters <= 25){
                total = 0.92 * dieselPrice * liters;

            } else if (liters > 25) {
                total = 0.90 * dieselPrice * liters;

            }else if (liters < 20 && liters >= 0 ) {
                total = liters * dieselPrice;
            }
        }

        if ("Yes".equals(clubCard) && "Gasoline".equals(fuelType)){
            discountPrice = gasolinePrice - 0.18;
            if (liters >= 20 && liters <= 25) {
                total = 0.92 * discountPrice * liters;

            } else if (liters > 25) {
                total = 0.90 * discountPrice * liters;

            }else if (liters < 20 && liters >= 0) {
                total = liters * discountPrice;
            }

        } if ("No".equals(clubCard) && "Gasoline".equals(fuelType)) {
            if (liters >= 20 && liters <= 25){
                total = 0.92 * gasolinePrice * liters;

            } else if (liters > 25) {
                total = 0.90 * gasolinePrice * liters;

            }else if (liters < 20 && liters >= 0) {
                total = liters * discountPrice;
            }
        }

        System.out.printf("%.2f lv.", total);
    }
}
