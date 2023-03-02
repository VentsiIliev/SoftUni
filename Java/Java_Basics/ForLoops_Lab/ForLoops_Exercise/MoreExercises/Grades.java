package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentsCount = Integer.parseInt(scanner.nextLine());

        int weakGrades = 0;
        int averageGrades = 0;
        int goodGrades = 0;
        int excellentGrades = 0;

        double gradesSum = 0;

        for (int i = 0; i < studentsCount; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradesSum += grade;

            if (grade >= 2 && grade <= 2.99) {
                weakGrades++;
            } else if (grade <= 3.99) {
                averageGrades++;
            } else if (grade <= 4.99) {
                goodGrades++;
            } else {
                excellentGrades++;
            }
        }
        double weakGradesPercent = ((weakGrades * 1.0) / studentsCount) * 100;
        double averageGradesPercent = ((averageGrades * 1.0) / studentsCount) * 100;
        double goodGradesPercent = ((goodGrades * 1.0) / studentsCount) * 100;
        double excellentGradesPercent = ((excellentGrades * 1.0) / studentsCount) * 100;

        double averageGrade = gradesSum / studentsCount;

        System.out.printf("Top students: %.2f%%\n", excellentGradesPercent);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", goodGradesPercent);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", averageGradesPercent);
        System.out.printf("Fail: %.2f%%\n", weakGradesPercent);
        System.out.printf("Average: %.2f", averageGrade);
    }
}
