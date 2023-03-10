package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class FavoriteMovie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int movieCount = 0;
        int maxPoint = 0;
        boolean isLimitReached = false;
        String winner = "";
        String command = scanner.nextLine();
        while (!"STOP".equals(command)) {
            String movie = command;
            int points = 0;
            if (movieCount >= 6) {
                isLimitReached = true;
                break;
            }
            for (int i = 0; i < (movie.length()); i++) {
                if (movie.charAt(i) >= 65 && movie.charAt(i) <= 90) {
                    points += movie.charAt(i) - movie.length();
                } else if (movie.charAt(i) >= 97 && movie.charAt(i) <= 122) {
                    points += (movie.charAt(i) - (2 * movie.length()));
                }else {
                    points += movie.charAt(i);
                }
                if (points > maxPoint) {
                    maxPoint = points;
                    winner = movie;
                }
            }
            movieCount++;
            command = scanner.nextLine();
        }
        if (isLimitReached) {
            System.out.println("The limit is reached.");
        }
        System.out.printf("The best movie for you is %s with %d ASCII sum.", winner, maxPoint);
    }
}
