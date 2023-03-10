package MockExam.MockExam_1.MockExam_2;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTickets = 0;
        int standardTickets = 0;
        int kidsTickets = 0;

        String name = scanner.nextLine();
        while (!name.equals("Finish")) {
            int emptySeats = Integer.parseInt(scanner.nextLine());

            int ticketsPurchased = 0;
            for (int i = 0; i < emptySeats; i++) {
                String ticketType = scanner.nextLine();
                if ("student".equals(ticketType)) {
                    studentTickets++;
                } else if ("standard".equals(ticketType)) {
                    standardTickets++;
                } else if ("kid".equals(ticketType)) {
                    kidsTickets++;
                } else if ("End".equals(ticketType)) {
                    break;
                }
                ticketsPurchased++;
            }
            System.out.printf("%s - %.2f%% full.\n", name, ticketsPurchased * 1.0 / emptySeats * 100);
            name = scanner.nextLine();
        }
       int totalTickets = studentTickets + standardTickets + kidsTickets;
        double averageStudent = (studentTickets * 1.0) / totalTickets * 100;
        double averageStandard = (standardTickets * 1.0) / totalTickets * 100;
        double averageKids = (kidsTickets * 1.0) / totalTickets * 100;

        System.out.printf("Total tickets: %d\n", totalTickets);
        System.out.printf("%.2f%% student tickets.\n", averageStudent);
        System.out.printf("%.2f%% standard tickets.\n", averageStandard);
        System.out.printf("%.2f%% kids tickets.\n", averageKids);
    }
}
