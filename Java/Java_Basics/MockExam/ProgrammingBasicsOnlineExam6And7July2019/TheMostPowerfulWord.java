package MockExam.ProgrammingBasicsOnlineExam6And7July2019;

import java.util.Scanner;

public class TheMostPowerfulWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxScore = 0;
        String mostPowerfulWord = "";

        String command = scanner.nextLine();
        while (!command.equals("End of words")) {
            int sum = 0;
            String word = command;
            for (int i = 0; i < word.length(); i++) {
                sum += word.charAt(i);
            }
            switch (word.charAt(0)) {
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                case 'Y':
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'y':
                    sum = sum * word.length();
                    break;
                default:
                    sum = sum / word.length();
            }
            if (sum > maxScore) {
                maxScore = sum;
                mostPowerfulWord = word;
            }
            command = scanner.nextLine();
        }
        System.out.printf("The most powerful word is %s - %d", mostPowerfulWord, maxScore);
    }
}
