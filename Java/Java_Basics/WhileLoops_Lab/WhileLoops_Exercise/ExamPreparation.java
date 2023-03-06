package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        int poorGradesAllowance = Integer.parseInt(scanner.nextLine());

        int gradesCount = 0;
        int gradesSum = 0;
        int poorGradesCount = 0;
        String lastProblemName = "";
        boolean isEnough = false;
        while (poorGradesCount < poorGradesAllowance) {

            String problemName = scanner.nextLine();
            if (problemName.equals("Enough")) {
                isEnough = true;
                break;
            }
            lastProblemName = problemName;

            int grades = Integer.parseInt(scanner.nextLine());

            gradesSum += grades;
            gradesCount++;

            if (grades <= 4) {
                poorGradesCount++;
            }
        }
        double averageScore = gradesSum * 1.0 / gradesCount;
        if (isEnough) {
            System.out.printf("Average score: %.2f\n", averageScore);
            System.out.printf("Number of problems: %d\n", gradesCount);
            System.out.printf("Last problem: %s", lastProblemName);

        } else {
            System.out.printf("You need a break, %d poor grades.", poorGradesCount);
        }
    }
}
