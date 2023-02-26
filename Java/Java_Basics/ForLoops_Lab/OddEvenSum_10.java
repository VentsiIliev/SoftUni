package ForLoops_Lab;

import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                even += num;
            }else {
                odd += num;
            }
        }
        int diff = Math.abs(odd - even);
        if (odd == even){
            System.out.println("Yes");
            System.out.printf("Sum = %d", odd);
        }else {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
