package ConditionalStatements_Lab.ConditionalStatements_Exercise;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        double episodeLength = Double.parseDouble(scanner.nextLine());
        double breakLength = Double.parseDouble(scanner.nextLine());

        double lunchTIme = breakLength / 8;
        double restTIme = breakLength / 4;
        double timeLeft = breakLength - lunchTIme - restTIme;

        if (timeLeft >= episodeLength){
           double freeTIme = breakLength - lunchTIme - restTIme - episodeLength;
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name , Math.ceil(freeTIme));
        }else{
            double timeNeeded = episodeLength - timeLeft;
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name , Math.ceil(timeNeeded));
        }
    }
}
