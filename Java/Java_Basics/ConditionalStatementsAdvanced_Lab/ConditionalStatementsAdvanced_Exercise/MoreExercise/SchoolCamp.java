package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise.MoreExercise;

import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String vacationType = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String sport = "";

        switch (vacationType) {
            case "Winter":
                switch (groupType) {
                    case "boys":
                        price = 9.6;
                        sport = "Judo";
                        break;
                    case "girls":
                        price = 9.6;
                        sport = "Gymnastics";
                        break;
                    case "mixed":
                        price = 10;
                        sport = "Ski";
                        break;
                }
                break;

            case "Spring":
                switch (groupType) {
                    case "boys":
                        price = 7.2;
                        sport = "Tennis";
                        break;
                    case "girls":
                        price = 7.2;
                        sport = "Athletics";
                        break;
                    case "mixed":
                        price = 9.5;
                        sport = "Cycling";
                        break;
                }
                break;
            case "Summer":
                switch (groupType) {
                    case "boys":
                        price = 15;
                        sport = "Football";
                        break;
                    case "girls":
                        price = 15;
                        sport = "Volleyball";
                        break;
                    case "mixed":
                        price = 20;
                        sport = "Swimming";
                        break;
                }
                break;
        }
        double total = studentsCount * price * nightsCount;
        if (studentsCount >= 50) {
            total = total * 0.5;
        } else if (studentsCount >= 20 && studentsCount < 50) {
            total = total * 0.85;
        } else if (studentsCount >= 10 && studentsCount < 20) {
            total = total * 0.95;
        }
        System.out.printf("%s %.2f lv.", sport, total);
    }
}