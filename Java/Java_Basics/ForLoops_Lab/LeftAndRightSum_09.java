package ForLoops_Lab;

import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < n; i++) {
            int leftNum = Integer.parseInt(scanner.nextLine());
            leftSum += leftNum;
        }
        for (int i = 0; i < n; i++) {
            int rightNum = Integer.parseInt(scanner.nextLine());
            rightSum += rightNum;
        }
        int diff = Math.abs(rightSum - leftSum);
        if (rightSum == leftSum){
            System.out.printf("Yes, sum = %d",rightSum);
        }else{
            System.out.printf("No, diff = %d",diff);
        }
    }
}
