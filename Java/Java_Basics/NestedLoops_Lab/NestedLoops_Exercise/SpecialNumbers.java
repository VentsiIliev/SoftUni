package NestedLoops_Lab.NestedLoops_Exercise;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1111; i <= 9999; i++) {
            int currentNumber = i;
            int digit = 0;
            int count = 0;
            boolean isNotSpecial = false;

            for (int j = 1; j <= 4; j++) {

                digit = currentNumber % 10;

                if (digit == 0) {
                    isNotSpecial = true;
                    break;
                }

                if (n % digit == 0) {
                    count++;
                } else {
                    isNotSpecial = true;
                    break;
                }

                currentNumber = currentNumber / 10;
            }

            if (!isNotSpecial) {
                System.out.print(i + " ");
            }
        }
    }
}