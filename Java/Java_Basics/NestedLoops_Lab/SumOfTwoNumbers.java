package NestedLoops_Lab;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());

        boolean isFound = false;
        int count = 0;
        int x1 = 0;
        int x2 = 0;
        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magicNumber) {
                    x2 = j;
                    isFound = true;
                    break;
                }
            }
            if (isFound) {
               x1 = i;
                break;
            }
        }
        if (isFound) {
            System.out.printf("Combination N:%d (%d + %d = %d)", count, x1, x2, magicNumber);
        }else {
            System.out.printf("%d combinations - neither equals %d", count, magicNumber);
        }
    }
}
