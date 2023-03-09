package MockExam.MockExam_1;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int gamesPlayed = Integer.parseInt(scanner.nextLine());

        int wins = 0;
        int draws = 0;
        int loses = 0;

        int points = 0;
        String result = "";
        for (int i = 0; i < gamesPlayed; i++) {
            result = scanner.nextLine();
            if (result.equals("W")){
                wins++;
                points += 3;
            } else if (result.equals("D")) {
                draws++;
                points += 1;
            }else {
                loses++;
            }
        }

        double winRate = (wins * 1.0) / gamesPlayed * 100;
        if (gamesPlayed == 0){
            System.out.printf("%s hasn't played any games during this season.", teamName);
        }else {
            System.out.printf("%s has won %d points during this season.\n", teamName, points);
            System.out.println("Total stats:");
            System.out.printf("## W: %d\n", wins);
            System.out.printf("## D: %d\n", draws);
            System.out.printf("## L: %d\n", loses);
            System.out.printf("Win rate: %.2f%%", winRate);
        }
    }
}