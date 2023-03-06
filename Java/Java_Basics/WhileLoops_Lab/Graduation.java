package WhileLoops_Lab;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        int gradescount = 1;
        int poorGrades = 0;
        double gratesSum = 0;
        boolean isFail = false;
        while (gradescount <= 12) {

            if (poorGrades == 2) {
                isFail = true;
                break;
            }

            double grades = Double.parseDouble(scanner.nextLine());

            if (grades < 4) {
                poorGrades++;
                continue;
            } else {
                gratesSum += grades;
            }

            gradescount++;
        }

        double averageGrates = gratesSum / 12;

        if (isFail) {
            System.out.printf("%s has been excluded at %d grade", studentName, gradescount);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrates);
        }

    }
}
