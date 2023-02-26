package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());
        int workDays = 365 - daysOff;

        int daysOffPlay = daysOff * 127;
        int workDaysPlay = workDays * 63;
        int playtime = daysOffPlay + workDaysPlay;

        int diff = Math.abs(30000 - playtime);
        double diffHours = diff / 60.0;
        double diffMinutes = diff % 60;

        if (playtime <= 30000){
            System.out.printf("Tom sleeps well\n");
            System.out.printf("%.0f hours and %.0f minutes less for play", Math.floor(diffHours), diffMinutes );
        }else {
            System.out.printf("Tom will run away\n");
            System.out.printf("%.0f hours and %.0f minutes more for play", Math.floor(diffHours), diffMinutes);

        }
    }
}
