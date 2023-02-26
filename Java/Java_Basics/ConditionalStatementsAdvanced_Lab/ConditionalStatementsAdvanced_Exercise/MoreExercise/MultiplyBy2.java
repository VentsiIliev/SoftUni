package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise.MoreExercise;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double input = Double.parseDouble(scanner.nextLine());
        double result = 0;

        while (input >= 0 ){
            result = input * 2;
            System.out.printf("Result: %.2f\n", result);
            input = Double.parseDouble(scanner.nextLine());
            if (input < 0 ){
                System.out.print("Negative number!");
            }




        }
    }
}


