package NestedLoops_Lab.NestedLoops_Exercise.MoreExercise;

import java.util.Scanner;

public class LettersCombinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char start = scanner.next().charAt(0);
        char end = scanner.next().charAt(0);
        char ignore = scanner.next().charAt(0);
        int count = 0;
        for (char a = start; a <= end; a++) {
            if (a == ignore) {
                continue;
            }
            for (int b = start; b <= end; b++) {
                if (b == ignore) {
                    continue;
                }
                for (int c = start; c <= end; c++) {
                    if (c == ignore) {
                        continue;
                    }
                    count++;
                    System.out.printf("%c%c%c ", a, b, c);

                }
            }
        }
        System.out.print(count);
    }
}
