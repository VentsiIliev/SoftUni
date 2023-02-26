package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise.MoreExercises;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mackerelPrice = Double.parseDouble(scanner.nextLine());//СКУМРИЯ
        double cacaPrice = Double.parseDouble(scanner.nextLine());// ЦАЦА

        double bonitoKg = Double.parseDouble(scanner.nextLine());//ПАЛАМУД
        double safriteKg = Double.parseDouble(scanner.nextLine());//САФРИТ
        double clamKg = Double.parseDouble(scanner.nextLine());//МИДИ

        double bonitoTotal = (mackerelPrice + (mackerelPrice * 0.6)) * bonitoKg;//ПАЛАМУД
        double safriteTotal =(cacaPrice + (cacaPrice * 0.8)) * safriteKg;//САФРИТ
        double clamTotal = clamKg * 7.50;//МИДИ

        double total = bonitoTotal + safriteTotal + clamTotal;

        System.out.printf("%.2f" , total);

    }
}
