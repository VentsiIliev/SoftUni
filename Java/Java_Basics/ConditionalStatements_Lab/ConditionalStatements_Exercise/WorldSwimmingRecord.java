package ConditionalStatements_Lab.ConditionalStatements_Exercise;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSec = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeOneMeterSec = Double.parseDouble(scanner.nextLine());

        double time = distanceMeters * timeOneMeterSec;
        double delay = Math.floor(distanceMeters / 15) * 12.5;
        double totalTime = time + delay;
        double difference = recordSec - totalTime;

        if (totalTime < recordSec){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        }else {
            System.out.printf("No, he failed! He was %.2f seconds slower.",Math.abs(difference));
        }

    }
}
