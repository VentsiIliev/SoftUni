package NestedLoops_Lab.NestedLoops_Exercise;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int studentTotal = 0;
        int standardTotal = 0;
        int kidTotal = 0;

        String command = scanner.nextLine();
        while (!"Finish".equals(command)) {
            String movie = command;
            int capacity = Integer.parseInt(scanner.nextLine());

            int studentCount = 0;
            int standardCount = 0;
            int kidCount = 0;

            for (int i = 0; i < capacity; i++) {
                String ticketType = scanner.nextLine();

                if ("student".equals(ticketType)) {
                    studentCount++;
                } else if ("standard".equals(ticketType)) {
                    standardCount++;
                } else if ("kid".equals(ticketType)) {
                    kidCount++;
                } else {
                    break;
                }

            }
            studentTotal += studentCount;
            standardTotal += standardCount;
            kidTotal += kidCount;

            int totalForMovie = studentCount + standardCount + kidCount;
            double average = totalForMovie * 1.0 / capacity * 100;
            System.out.printf("%s - %.2f%% full.\n", movie, average);
            command = scanner.nextLine();
        }
        int totalTickets = standardTotal + studentTotal + kidTotal;
        double averageStudent = studentTotal * 1.0 / totalTickets * 100;
        double averageStandard = standardTotal * 1.0 / totalTickets * 100;
        double averageKid = kidTotal * 1.0 / totalTickets * 100;

        System.out.printf("Total tickets: %d\n",totalTickets);
        System.out.printf("%.2f%% student tickets.\n", averageStudent);
        System.out.printf("%.2f%% standard tickets.\n", averageStandard);
        System.out.printf("%.2f%% kids tickets.", averageKid);
    }
}
