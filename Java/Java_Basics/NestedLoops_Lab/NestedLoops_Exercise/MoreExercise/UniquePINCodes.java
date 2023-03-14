package NestedLoops_Lab.NestedLoops_Exercise.MoreExercise;

import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1Limit = Integer.parseInt(scanner.nextLine());
        int num2Limit = Integer.parseInt(scanner.nextLine());
        int num3Limit = Integer.parseInt(scanner.nextLine());

        for (int num1 = 2; num1 <= num1Limit; num1 += 2) {
            for (int num2 = 2; num2 <= num2Limit; num2++) {
                for (int num3 = 2; num3 <= num3Limit; num3 += 2) {
                    if (num2 == 2 || num2 == 3 || num2 == 5 || num2 == 7) {
                        System.out.printf("%d %d %d\n", num1, num2, num3);
                    }

                }
            }

        }
    }
}