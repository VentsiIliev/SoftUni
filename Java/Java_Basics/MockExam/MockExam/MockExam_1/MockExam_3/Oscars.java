package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        double points = 0;
        double totalPoints = 0;
        boolean isNominee = false;
        for (int i = 0; i < juryCount; i++) {
            String juryName = scanner.nextLine();
            double juryPoints = Double.parseDouble(scanner.nextLine());
            juryPoints = (juryName.length() * juryPoints) / 2;
            academyPoints += juryPoints;
            if (academyPoints >= 1250.5) {
                isNominee = true;
                break;
            }
        }
        if (isNominee) {
            System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", name, academyPoints);
        } else {
            double difference = Math.abs(academyPoints - 1250.5);
            System.out.printf("Sorry, %s you need %.1f more!", name, difference);
        }
    }
}
