package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int fishMenu = Integer.parseInt(scanner.nextLine());
        int vegMenu = Integer.parseInt(scanner.nextLine());

        double chickenMenuPrice = chickenMenu * 10.35;
        double fishMenuPrice = fishMenu * 12.4;
        double vegMenuPrice = vegMenu * 8.15;
        double menuTotal = chickenMenuPrice + fishMenuPrice + vegMenuPrice;
        double dessertPrice = menuTotal * 0.2;

        double total = menuTotal + dessertPrice + 2.5;
        System.out.println(total);

    }
}
