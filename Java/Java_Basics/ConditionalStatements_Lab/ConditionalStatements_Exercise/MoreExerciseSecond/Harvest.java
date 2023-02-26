package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int area = Integer.parseInt(scanner.nextLine());
        double grapePerSquareMeter = Double.parseDouble(scanner.nextLine());
        int wineNeeded = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double totalGrapeKg = area * grapePerSquareMeter;
        double productionForWine = totalGrapeKg - totalGrapeKg * 0.6;
        double totalWineLiters = productionForWine / 2.5;


        double diff = Math.abs(wineNeeded - totalWineLiters);
        if (wineNeeded <= totalWineLiters){
            double winePerPerson = diff / workers;
            System.out.printf("Good harvest this year! Total wine: %.0f liters.\n", Math.floor(totalWineLiters));
            System.out.printf("%.0f liters left -> %.0f liters per person.", Math.ceil(diff), Math.ceil(winePerPerson));
        }else{
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", Math.floor(diff));
        }
    }
}
