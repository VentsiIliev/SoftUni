package ConditionalStatements_Lab.ConditionalStatements_Exercise;

import java.util.Scanner;

public class GodzillaKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double uniformPrice = Double.parseDouble(scanner.nextLine());

        double uniformCost = people * uniformPrice;
        double decorPrice = budget - budget * 0.9;

        if (people > 150) uniformCost = uniformCost - uniformCost * 0.1;

        double totalCost = uniformCost + decorPrice;

        if (budget >= totalCost){
            double difference = budget - totalCost;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        }else{
            double difference = totalCost - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }



    }
}
