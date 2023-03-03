package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class OddEvenPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbersCount = Integer.parseInt(scanner.nextLine());

        double oddSum = 0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;

        double evenSum = 0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;

        for (int i = 1; i <= numbersCount; i++) {
            double number = Double.parseDouble(scanner.nextLine());

            if (i % 2 == 0) {
                evenSum += number;
                if (number > evenMax) {
                    evenMax = number;
                }
                if (number < evenMin) {
                    evenMin = number;
                }
            } else {
                oddSum += number;
                if (number > oddMax) {
                    oddMax = number;
                }
                if (number < oddMin) {
                    oddMin = number;
                }
            }

        }
        if (numbersCount == 0) {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.println("OddMin=No,");
            System.out.println("OddMax=No,");
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else if (numbersCount == 1) {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.printf("OddMin=%.2f,\n", oddMin);
            System.out.printf("OddMax=%.2f,\n", oddMax);
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.println("EvenMin=No,");
            System.out.println("EvenMax=No");
        } else {
            System.out.printf("OddSum=%.2f,\n", oddSum);
            System.out.printf("OddMin=%.2f,\n", oddMin);
            System.out.printf("OddMax=%.2f,\n", oddMax);
            System.out.printf("EvenSum=%.2f,\n", evenSum);
            System.out.printf("EvenMin=%.2f,\n", evenMin);
            System.out.printf("EvenMax=%.2f\n", evenMax);
        }

    }
}
