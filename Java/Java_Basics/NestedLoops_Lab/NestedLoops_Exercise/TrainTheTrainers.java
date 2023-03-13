package NestedLoops_Lab.NestedLoops_Exercise;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int juryCount = Integer.parseInt(scanner.nextLine());

        double totalGrades = 0;
        int gradesCount = 0;
        String command = scanner.nextLine();
        while (!command.equals("Finish")) {
            String presentation = command;

            double sumGradesForPresentation = 0;

            for (int i = 0; i < juryCount; i++) {
                double grades = Double.parseDouble(scanner.nextLine());
                sumGradesForPresentation += grades;
                gradesCount++;
                totalGrades += grades;
            }

            double averageForPresention = sumGradesForPresentation / juryCount;

            System.out.printf("%s - %.2f.\n", presentation, averageForPresention);

            command = scanner.nextLine();
        }
        double totalAverage = totalGrades / gradesCount;
        System.out.printf("Student's final assessment is %.2f.", totalAverage);
    }
}