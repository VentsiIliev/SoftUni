package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;
        String oddOrEven = "";
        boolean isZero = false;

        switch (operator){
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
               if ( n2 == 0 ){
                   isZero = true;
               }else {
                   result = n1 * 1.0 / n2;
               }
               break;
            case "%":
                if ( n2 == 0 ){
                    isZero = true;
                }else {
                    result = n1 * 1.0 % n2;
                }
                break;
        }

        if ("+".equals(operator) || "-".equals(operator) || "*".equals(operator)) {
            if (result % 2 == 0){
                oddOrEven = "even";
            }else {
                oddOrEven = "odd";
            }
            System.out.printf("%d %s %d = %.0f - %s", n1, operator, n2,result, oddOrEven);
        }else if ("/".equals(operator) && !isZero){
            System.out.printf("%d %s %d = %.2f", n1,operator, n2, result);
        }else if ("%".equals(operator) && !isZero){
            System.out.printf("%d %s %d = %.0f", n1,operator, n2, result);
        }else {
            System.out.printf("Cannot divide %d by zero", n1);
        }


    }
}
