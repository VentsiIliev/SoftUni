package ForLoops_Lab.ForLoops_Exercise;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            sum += num;
            if (num > maxNumber) {
                maxNumber = num;
            }
        }
        int sumWithoutMax = sum - maxNumber;
        int diff = sumWithoutMax - maxNumber;
        if (sumWithoutMax == maxNumber) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMax);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d ", Math.abs(diff));
        }
    }
}
