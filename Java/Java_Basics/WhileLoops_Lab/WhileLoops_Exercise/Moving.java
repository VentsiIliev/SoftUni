package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthSpace = Integer.parseInt(scanner.nextLine());
        int lengthSpace = Integer.parseInt(scanner.nextLine());
        int heightSpace = Integer.parseInt(scanner.nextLine());

        int totalSpace = widthSpace * lengthSpace * heightSpace;

        boolean isFull = false;
        while (totalSpace > 0) {
            String input = scanner.nextLine();
            if (!input.equals("Done")) {
                int boxInput = Integer.parseInt(input);
                totalSpace -= boxInput;
            } else {
                break;
            }
            if ( totalSpace < 0){
                isFull = true;
                break;
            }
        }
        if (isFull) {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(totalSpace));
        }else {
            System.out.printf("%d Cubic meters left.", totalSpace);
        }
    }
}
