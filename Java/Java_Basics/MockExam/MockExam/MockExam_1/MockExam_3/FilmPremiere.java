package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        String bundle = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double bundlePrice = 0;
        switch (movie) {
            case "John Wick":
                if ("Drink".equals(bundle)) {
                    bundlePrice = 12;
                } else if ("Popcorn".equals(bundle)) {
                    bundlePrice = 15;
                } else {
                    bundlePrice = 19;
                }
                break;
            case "Star Wars":
                if ("Drink".equals(bundle)) {
                    bundlePrice = 18;
                } else if ("Popcorn".equals(bundle)) {
                    bundlePrice = 25;
                } else {
                    bundlePrice = 30;
                }
                break;
            case "Jumanji":
                if ("Drink".equals(bundle)) {
                    bundlePrice = 9;
                } else if ("Popcorn".equals(bundle)) {
                    bundlePrice = 11;
                } else {
                    bundlePrice = 14;
                }
                break;
        }
        double total = bundlePrice * tickets;
        if (tickets >= 4 && "Star Wars".equals(movie)) {
            total = total * 0.7;
        } else if (tickets == 2 && "Jumanji".equals(movie)) {
            total = total * 0.85;
        }
        System.out.printf("Your bill is %.2f leva.", total);
    }
}
