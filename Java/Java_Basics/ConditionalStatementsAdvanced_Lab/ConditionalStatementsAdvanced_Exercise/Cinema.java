package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projectionType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());

        int totalSeats = rows * columns;
        double price = 0;
        double totalPrice = 0;

        switch (projectionType){
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.5;
                break;
            case "Discount":
                price = 5;
                break;
        }
        totalPrice = price * totalSeats;
        System.out.printf("%.2f leva",totalPrice);
    }
}
