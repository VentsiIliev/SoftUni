package MockExam.MockExam_1.MockExam_3;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        double totalIncome = 0;
        int peopleCount = 0;
        boolean isFull = false;
        String command = scanner.nextLine();
        while (!"Movie time!".equals(command)) {
            int people = Integer.parseInt(command);
            if ((people + peopleCount) > capacity || peopleCount >= capacity) {
                isFull = true;
                break;
            }
            double income = 0;
            if (people % 3 == 0) {
                income = people * 5 - 5;
            } else {
                income = people * 5;
            }
            totalIncome += income;
            peopleCount += people;
            command = scanner.nextLine();
        }
        if (isFull) {
            System.out.println("The cinema is full.");
        } else {
            int difference = capacity - peopleCount;
            System.out.printf("There are %d seats left in the cinema.\n", difference);
        }

        System.out.printf("Cinema income - %.0f lv.", totalIncome);
    }
}
