package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stepsTarger = 10000;

        boolean isFail = false;

        int totalSteps = 0;
        while (totalSteps <= stepsTarger) {
            String input = scanner.nextLine();
            int stepsInput = 0;
            if (!input.equals("Going home")) {
                stepsInput = Integer.parseInt(input);
                totalSteps += stepsInput;
            } else {
                stepsInput = Integer.parseInt(scanner.nextLine());
                totalSteps += stepsInput;
                break;
            }
        }
        if (totalSteps < stepsTarger) {
            isFail = true;
        }
        int difference = Math.abs(totalSteps - stepsTarger);
        if (isFail){
            System.out.printf("%d more steps to reach goal.\n", difference);
        }else {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", difference);
        }

    }
}
