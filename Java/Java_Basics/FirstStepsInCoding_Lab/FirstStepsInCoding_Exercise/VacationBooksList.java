package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pages = Integer.parseInt(scanner.nextLine());
        int pagesHour = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int hoursBook = pages / pagesHour;
        int daysNeeded =  hoursBook / days;

        System.out.println(daysNeeded);



    }
}
