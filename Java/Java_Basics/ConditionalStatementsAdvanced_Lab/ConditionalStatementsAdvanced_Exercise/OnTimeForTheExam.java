package ConditionalStatementsAdvanced_Lab.ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = examHour * 60 + examMinutes;
        int arrivalTImeInMinutes = arrivalHour * 60 + arrivalMinutes;

        int diff = Math.abs(examTimeInMinutes - arrivalTImeInMinutes);

        if (examTimeInMinutes < arrivalTImeInMinutes) {
            System.out.println("Late");
        } else if (examTimeInMinutes == arrivalTImeInMinutes || diff <= 30) {
            System.out.println("On time");
        } else {
            System.out.println("Early");
        }

        //IF EARLY AND ON TIME
        if (examTimeInMinutes > arrivalTImeInMinutes && diff < 60) {
            if (diff >= 10) {
                System.out.printf("%d minutes before the start", diff);
            } else {
                System.out.printf("%d minutes before the start", diff);
            }
        } else if (examTimeInMinutes > arrivalTImeInMinutes && diff >= 60) {
            int hour = diff / 60;
            int minutes = diff % 60;
            if (minutes >=10){
                System.out.printf("%d:%d hours before the start", hour, minutes);
            }else{
                System.out.printf("%d:0%d hours before the start",hour, minutes);
            }
        }

        //IF LATE
        if (examTimeInMinutes < arrivalTImeInMinutes && diff < 60) {
            if (diff >= 10) {
                System.out.printf("%d minutes after the start", diff);
            } else {
                System.out.printf("%d minutes after the start", diff);
            }
        } else if (examTimeInMinutes < arrivalTImeInMinutes && diff >= 60) {
            int hour = diff / 60;
            int minutes = diff % 60;
            if (minutes >=10){
                System.out.printf("%d:%d hours after the start", hour, minutes);
            }else{
                System.out.printf("%d:0%d hours after the start",hour, minutes);
            }
        }

    }
}
