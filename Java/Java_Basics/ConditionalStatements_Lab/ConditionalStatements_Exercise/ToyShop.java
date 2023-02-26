package ConditionalStatements_Lab.ConditionalStatements_Exercise;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double holidayPrice = Double.parseDouble(scanner.nextLine());

        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int teddyBears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        int toysTotal = puzzles + dolls + teddyBears + minions + trucks;

        double puzzlesTotal = puzzles * 2.6;
        double dollsTotal = dolls * 3;
        double teddyBearsTotal = teddyBears * 4.10;
        double minionsTotal = minions * 8.2;
        double trucksTotal = trucks * 2;
        double total = puzzlesTotal + dollsTotal + teddyBearsTotal + minionsTotal + trucksTotal;

         if (toysTotal >= 50){
             total = total - total * 0.25;
         }
         double totalProfit = total - total * 0.1;

         double difference = totalProfit - holidayPrice;

         if (totalProfit >= holidayPrice){
             System.out.printf("Yes! %.2f lv left.", difference);
         }else {
             System.out.printf("Not enough money! %.2f lv needed.", Math.abs(difference));
         }
    }
}
