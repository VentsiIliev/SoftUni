package NestedLoops_Lab.NestedLoops_Exercise;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());


        for (int i = num1; i <= num2; i++) {
            int sumEven = 0;
            int sumOds = 0;
            int number = i;
            int digit = 0;
            for (int j = 6; j >= 1; j--) {
                digit = number % 10;
                if (j % 2 == 0) {
                    sumEven += digit;
                } else {
                    sumOds += digit;
                }
                number = number / 10;
            }
            if (sumEven == sumOds) {
                System.out.print(i + " ");
            }
        }
    }
}
