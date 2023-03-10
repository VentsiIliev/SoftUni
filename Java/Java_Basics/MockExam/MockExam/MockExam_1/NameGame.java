package MockExam.MockExam_1;

import java.util.Scanner;

public class NameGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "";
        int maxPoints = 0;
        String winnerName = "";


        String command = scanner.nextLine();
        while (!command.equals("Stop")){
            int points = 0;
            name = command;
            for (int i = 0; i < name.length() ; i++) {
                int number = Integer.parseInt(scanner.nextLine());

                if (name.charAt(i) == number){
                    points += 10;
                }else {
                    points += 2;
                }
            }
            if (points >= maxPoints){
                maxPoints = points;
                winnerName = name;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The winner is %s with %d points!",winnerName, maxPoints);
    }
}