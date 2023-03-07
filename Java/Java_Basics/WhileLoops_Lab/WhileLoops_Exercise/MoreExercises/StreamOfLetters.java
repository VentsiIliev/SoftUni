package WhileLoops_Lab.WhileLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class StreamOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myWord = "";
        int nCount = 0;
        int oCount = 0;
        int cCount = 0;

        String input = "";
        while (!input.equals("End")) {
            input = scanner.nextLine();
            char myChar = input.charAt(0);

            if (!(myChar >= 'A' && myChar <= 'Z') && !(myChar >= 'a' && myChar <= 'z')) {
                continue;
            }

            if (nCount == 1 && oCount == 1 && cCount == 1) {
                nCount = 0;
                oCount = 0;
                cCount = 0;
                System.out.printf("%s ", myWord);
                myWord = "";
            }

            switch (input) {
                case "n":
                    if (nCount == 0) {
                        nCount++;
                        continue;
                    } else {
                        myWord += input;
                    }
                    break;
                case "o":
                    if (oCount == 0) {
                        oCount++;
                        continue;
                    } else {
                        myWord += input;
                    }
                    break;
                case "c":
                    if (cCount == 0) {
                        cCount++;
                        continue;
                    } else {
                        myWord += input;
                    }
                    break;
                default:
                    myWord += input;
                    break;
            }
        }
    }
}
