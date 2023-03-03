package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

public class Clock {
    public static void main(String[] args) {
        int hour = 0;

        for (int i = 0; i <= 60; i++) {

            if (hour == 23 && i == 60) {
                break;
            }
            if (i == 60) {
                i = 0;
                hour++;
            }

            System.out.printf("%d : %d\n", hour, i);
        }
    }
}
