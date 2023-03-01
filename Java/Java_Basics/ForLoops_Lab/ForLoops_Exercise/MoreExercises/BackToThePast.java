package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritance = Double.parseDouble(scanner.nextLine());
        int yearToLive = Integer.parseInt(scanner.nextLine());

        int ivanAge = 18;
        double evenYearsMoney = 0;
        double oddYearsMoney = 0;
        for (int i = 1800; i <= yearToLive; i++) {

            if (i % 2 == 0) {
                evenYearsMoney = evenYearsMoney + 12000;
            } else {
                oddYearsMoney = oddYearsMoney + 12000 + (50 * ivanAge);
            }
            ivanAge++;
        }
        double moneyNeeded = oddYearsMoney + evenYearsMoney;
        double difference = Math.abs(inheritance - moneyNeeded);

        if (inheritance >= moneyNeeded){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", difference);
        }else {
            System.out.printf("He will need %.2f dollars to survive.", difference);
        }
    }
}
