package MockExam.MockExam_1.MockExam_2;

import java.util.Scanner;

public class OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – име на филм – текст ("A Star Is Born", "Bohemian Rhapsody","Green Book" или "The Favourite")
        String movie = scanner.nextLine();
        String cinemaType = scanner.nextLine();
        int people = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        switch (movie) {
            case "A Star Is Born":
                if (cinemaType.equals("normal")) {
                    ticketPrice = 7.5;
                } else if (cinemaType.equals("luxury")) {
                    ticketPrice = 10.5;
                } else {
                    ticketPrice = 13.5;
                }
                break;
            case "Bohemian Rhapsody":
                if (cinemaType.equals("normal")) {
                    ticketPrice = 7.35;
                } else if (cinemaType.equals("luxury")) {
                    ticketPrice = 9.45;
                } else {
                    ticketPrice = 12.75;
                }
                break;
            case "Green Book":
                if (cinemaType.equals("normal")) {
                    ticketPrice = 8.15;
                } else if (cinemaType.equals("luxury")) {
                    ticketPrice = 10.25;
                } else {
                    ticketPrice = 13.25;
                }
                break;
            case "The Favourite":
                if (cinemaType.equals("normal")) {
                    ticketPrice = 8.75;
                } else if (cinemaType.equals("luxury")) {
                    ticketPrice = 11.55;
                } else {
                    ticketPrice = 13.95;
                }
                break;
        }
        double totalIncome = people * ticketPrice;
        System.out.printf("%s -> %.2f lv.", movie, totalIncome);
    }
}
