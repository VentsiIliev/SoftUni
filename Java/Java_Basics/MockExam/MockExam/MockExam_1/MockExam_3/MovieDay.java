package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actionTime = Integer.parseInt(scanner.nextLine());
        int scenesCount = Integer.parseInt(scanner.nextLine());
        int sceneTime = Integer.parseInt(scanner.nextLine());

        double timeNeeded = (sceneTime * scenesCount) + (actionTime * 0.15);

        double difference = Math.round(timeNeeded - actionTime);
        if (timeNeeded <= actionTime) {
            System.out.printf("You managed to finish the movie on time! You have %.0f minutes left!", Math.abs(difference));
        } else {
            System.out.printf("Time is up! To complete the movie you need %.0f minutes.", Math.abs(difference));
        }
    }
}
