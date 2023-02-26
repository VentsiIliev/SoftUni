package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise.MoreExercises;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegPrice = Double.parseDouble(scanner.nextLine());
        double fruitPrice = Double.parseDouble(scanner.nextLine());
        int vegKg = Integer.parseInt(scanner.nextLine());
        int fruitKg = Integer.parseInt(scanner.nextLine());
        double vegPriceEuro = vegPrice * vegKg / 1.94;
        double fruitPriceEuro = fruitPrice * fruitKg / 1.94;
        double productionTotalPriceEuro = vegPriceEuro + fruitPriceEuro;
        System.out.printf("%.2f" , productionTotalPriceEuro);

    }
}

