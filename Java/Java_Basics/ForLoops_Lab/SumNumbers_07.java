package ForLoops_Lab;

import java.util.Scanner;

public class SumNumbers_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (maxNum < num){
                maxNum = num;
            }
            if (minNum > num) {
                minNum = num;
            }
        }
        System.out.printf("Max number: %d\n",maxNum);
        System.out.printf("Min number: %d",minNum);
    }
}
