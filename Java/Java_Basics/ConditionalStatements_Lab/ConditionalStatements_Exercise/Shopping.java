package ConditionalStatements_Lab.ConditionalStatements_Exercise;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int graphicCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        double graphicCardsTotal = graphicCards * 250;

        double cpuPrice = graphicCardsTotal - graphicCardsTotal * 0.65;
        double cpuTotal = cpuPrice * cpu;

        double ramPrice = graphicCardsTotal - graphicCardsTotal * 0.9;
        double ramTotal = ramPrice * ram;

        double totalWithoutDiscount = graphicCardsTotal + cpuTotal + ramTotal;
        double discount = totalWithoutDiscount - totalWithoutDiscount * 0.85;

        double total;
        if (graphicCards > cpu){
             total = totalWithoutDiscount - discount;
        }else{
            total = totalWithoutDiscount;
        }
        double difference;
        if (budget >= total){
            difference = budget - total;
            System.out.printf("You have %.2f leva left!" , difference);
        }else{
            difference = total - budget;
            System.out.printf("Not enough money! You need %.2f leva more!" , difference);
        }


    }
}
