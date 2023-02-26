package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        int capacity = length * width * height;
        double liters = capacity * 0.001;
        double litersNeeed = liters - liters * percent / 100;
        System.out.println(litersNeeed);
        }

    }

