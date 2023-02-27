package ForLoops_Lab.ForLoops_Exercise;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int startPoints = Integer.parseInt(scanner.nextLine());

        int earnedPoints = 0;
        int tournamentsWon = 0;

        for (int i = 0; i < tournamentCount; i++) {

            String stage = scanner.nextLine();

            switch (stage) {
                case "W":
                    earnedPoints += 2000;
                    tournamentsWon++;
                    break;
                case "F":
                    earnedPoints += 1200;
                    break;
                case "SF":
                    earnedPoints += 720;
                    break;
            }
        }
        int totalPoints = startPoints + earnedPoints;
        int averagePoints = earnedPoints / tournamentCount;
        double winsPercent = tournamentsWon * 1.0 / tournamentCount * 100;

        System.out.printf("Final points: %d\n", totalPoints);
        System.out.printf("Average points: %.0f\n", Math.floor(averagePoints));
        System.out.printf("%.2f%%", winsPercent);
    }
}
