package ForLoops_Lab.ForLoops_Exercise.MoreExercises;

import java.util.Scanner;

public class EqualPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int lastSum = 0;
        int diff = 0;

        for (int i=0;i<n ;i++ ) {
            int first = Integer.parseInt(sc.nextLine());
            int second = Integer.parseInt(sc.nextLine());
            int sum = first+second;

            if(i > 0) {
                diff = Math.abs(lastSum - sum);
            }
            lastSum = sum;
        }

        if (diff == 0){
            System.out.printf("Yes, value=%s", lastSum);
        }else{
            System.out.printf("No, maxdiff=%d", diff);
        }
    }
}
