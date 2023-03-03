package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

public class ClockPartTwo {
    public static void main(String[] args) {

        int hour = 0;
        int minutes = 0;

        for (int i = 0; i <= 60; i++) {

            if (hour == 23 && minutes == 59 && i == 60) {
                break;
            }
            if (minutes == 59 && i == 60) {
                minutes = 0;
                i = 0;
                hour++;
            }
            if (i == 60) {
                i = 0;
                minutes++;
            }

            System.out.printf("%d : %d : %d\n", hour, minutes, i);
        }
    }
}
