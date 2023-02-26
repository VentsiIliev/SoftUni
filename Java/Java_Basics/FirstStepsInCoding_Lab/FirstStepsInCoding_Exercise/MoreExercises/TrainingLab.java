package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise.MoreExercises;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double hInMeters = Double.parseDouble(scanner.nextLine());
        double wInMeters = Double.parseDouble(scanner.nextLine());

        double hInCm = hInMeters * 100;
        double wInCm = wInMeters * 100;

        double wWithoutHallway = wInCm - 100;
        double seatsInOneRoll = wWithoutHallway / 70;

        double seatsInOneColon = hInCm / 120;
        double totalSeats = Math.floor(seatsInOneColon) * Math.floor(seatsInOneRoll) - 3;

        System.out.println(totalSeats);


    }
}