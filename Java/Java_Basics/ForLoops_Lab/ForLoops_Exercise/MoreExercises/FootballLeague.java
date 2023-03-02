package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int fansCount = Integer.parseInt(scanner.nextLine());

        int a = 0;
        int b = 0;
        int v = 0;
        int g = 0;

        for (int i = 0; i < fansCount; i++) {
            String sector = scanner.nextLine();

            switch (sector) {
                case "A":
                    a++;
                    break;
                case "B":
                    b++;
                    break;
                case "V":
                    v++;
                    break;
                case "G":
                    g++;
                    break;
            }
        }

        double sectorA = ((a * 1.0) / fansCount) * 100;
        double sectorB = ((b * 1.0) / fansCount) * 100;
        double sectorV = ((v * 1.0) / fansCount) * 100;
        double sectorG = ((g * 1.0) / fansCount) * 100;
        double stadiumFullPercent = ((1.0 *fansCount) / stadiumCapacity) * 100;

        System.out.printf("%.2f%%\n", sectorA);
        System.out.printf("%.2f%%\n", sectorB);
        System.out.printf("%.2f%%\n", sectorV);
        System.out.printf("%.2f%%\n", sectorG);
        System.out.printf("%.2f%%\n", stadiumFullPercent);
    }
}
