package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int liters = Integer.parseInt(scanner.nextLine());
        double discount = Double.parseDouble(scanner.nextLine());

        double pensPrice = pens * 5.8;
        double markersPrice = markers * 7.2;
        double litersPrice = liters * 1.2;

        double totalPrice = pensPrice + markersPrice + litersPrice;
        double totalAfterDiscount = totalPrice - totalPrice * discount / 100;

        System.out.println(totalAfterDiscount);

    }
}
