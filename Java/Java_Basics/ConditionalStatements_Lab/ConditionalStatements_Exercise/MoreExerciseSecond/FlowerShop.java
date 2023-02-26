package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int magnolii = Integer.parseInt(scanner.nextLine());
        int zumbuli = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int kaktusi = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double magTotal = magnolii * 3.25;
        double zumTotal = zumbuli * 4;
        double rozTotal = rozi * 3.5;
        double kakTotal = kaktusi * 8;
        double orderTotal = magTotal + zumTotal + rozTotal + kakTotal;
        double totalMinusTax = orderTotal - orderTotal * 0.05;

        double diff = Math.abs(totalMinusTax - giftPrice);
        if (totalMinusTax >= giftPrice){
            System.out.printf("She is left with %.0f leva.", Math.floor(diff));
        }else{
            System.out.printf("She will have to borrow %.0f leva.", Math.ceil(diff));
        }

    }
}
