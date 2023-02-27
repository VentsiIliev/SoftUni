package ForLoops_Lab.ForLoops_Exercise;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double points = Double.parseDouble(scanner.nextLine());
        int juryCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < juryCount; i++) {

            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            points += judgeName.length() * judgePoints / 2;

            if (points > 1250.5){
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, points);
                break;
            }
        }
        double diff = 1250.5 - points;
        if (points <= 1250.5){
            System.out.printf("Sorry, %s you need %.1f more!", actorName, diff);
        }
    }
}
