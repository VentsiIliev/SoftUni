package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String show = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        int minutesWithoutAds = Integer.parseInt(scanner.nextLine());

        double minutesPlusAds = minutesWithoutAds * 1.2;
        double totalTime = (minutesPlusAds * episodes * seasons) + (seasons * 10);

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", show, totalTime);
    }
}
