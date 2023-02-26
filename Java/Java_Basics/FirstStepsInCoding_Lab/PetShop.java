package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFood = Integer.parseInt(scanner.nextLine());
        int catFood = Integer.parseInt(scanner.next());
        double dogTotal = (dogFood * 2.5);
        int catTotal = (catFood * 4);
        System.out.println(dogTotal + catTotal);

    }
}
