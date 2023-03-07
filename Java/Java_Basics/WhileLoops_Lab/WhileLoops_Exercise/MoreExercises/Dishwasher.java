package WhileLoops_Lab.WhileLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bottles = Integer.parseInt(scanner.nextLine());
        int detergent = bottles * 750;

        int loadCount = 0;
        int platesCount = 0;
        int potsCount = 0;
        boolean isNotEnough = false;

        while (detergent >= 0) {
            String command = scanner.nextLine();
            int load = 0;
            if (!command.equals("End")) {
                load = Integer.parseInt(command);
                loadCount++;
            } else {
                break;
            }
            if (loadCount % 3 == 0) {
                detergent = detergent - load * 15;
                potsCount += load;
            } else {
                detergent = detergent - load * 5;
                platesCount += load;
            }
            if (detergent < 0) {
                isNotEnough = true;
                break;
            }
        }
        if (isNotEnough) {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergent));
        } else {
            System.out.println("Detergent was enough!");
            System.out.printf("%d dishes and %d pots were washed.\n", platesCount, potsCount);
            System.out.printf("Leftover detergent %d ml.", detergent);

        }
    }
}