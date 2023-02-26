package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise.MoreExercises;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String weather = scanner.nextLine();

        switch (weather){
            case"sunny":
                System.out.printf("It's warm outside!");
            break;
            default:
                System.out.printf("It's cold outside!");
        }

    }
}
