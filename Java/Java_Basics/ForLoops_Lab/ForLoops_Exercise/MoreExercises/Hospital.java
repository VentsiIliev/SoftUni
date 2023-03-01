package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int period = Integer.parseInt(scanner.nextLine());

        int treatedPatients = 0;
        int untreatedPatients = 0;
        int doctorsCount = 7;

        for (int i = 1; i <= period; i++) {

            if (i % 3 == 0){
                if (untreatedPatients > treatedPatients){
                    doctorsCount++;
                }
            }

            int patientsCount = Integer.parseInt(scanner.nextLine());

            if (doctorsCount >= patientsCount) {
                treatedPatients += patientsCount;
            }else {
                treatedPatients += doctorsCount;
                untreatedPatients = untreatedPatients + (patientsCount - doctorsCount);
            }
        }
        System.out.printf("Treated patients: %d.\n",treatedPatients);
        System.out.printf("Untreated patients: %d.",untreatedPatients);
    }
}
