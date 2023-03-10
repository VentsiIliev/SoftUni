package MockExam.MockExam_1.MockExam_2;

import java.util.Scanner;

public class MovieRatings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int movieCount = Integer.parseInt(scanner.nextLine());

        String bestMovie = "";
        double highestRating = Integer.MIN_VALUE;

        String worstMovie = "";
        double lowestRating = Integer.MAX_VALUE;

        double ratingSum = 0;

        for (int i = 0; i < movieCount; i++) {
            String name = scanner.nextLine();
            double rating = Double.parseDouble(scanner.nextLine());

            ratingSum += rating;

            if (rating > highestRating) {
                highestRating = rating;
                bestMovie = name;
            } else if (rating < lowestRating) {
                lowestRating = rating;
                worstMovie = name;
            }
        }
        double averageRating = ratingSum / movieCount;
        System.out.printf("%s is with highest rating: %.1f\n", bestMovie, highestRating);
        System.out.printf("%s is with lowest rating: %.1f\n", worstMovie, lowestRating);
        System.out.printf("Average rating: %.1f", averageRating);
    }
}
