package ConditionalStatements_Lab;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int result = num % 2;
        if (result == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }
    }
}
