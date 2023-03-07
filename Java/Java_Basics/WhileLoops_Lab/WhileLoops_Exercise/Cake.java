package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());

        int cackeSize = width * length;
        int piaceSize = 1;
        int totalPeaces = cackeSize / piaceSize;
        String command = "";
        int takenPiaces = 0;
        int peacesCount = 0;
        boolean isNotEnoughCake = false;

        while (totalPeaces > 0) {
            command = scanner.nextLine();
            if (!command.equals("STOP")) {
                takenPiaces = Integer.parseInt(command);
            } else {
                break;
            }

            totalPeaces -= takenPiaces;
            peacesCount += takenPiaces;

        }
        if (cackeSize <= peacesCount) {
            isNotEnoughCake = true;
        }

        int difference = Math.abs(cackeSize - peacesCount);
        if (isNotEnoughCake) {
            System.out.printf("No more cake left! You need %d pieces more.", difference);
        } else {
            System.out.printf("%d pieces are left.", difference);
        }
    }
}
