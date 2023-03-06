package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double moneyNeeded = Double.parseDouble(scanner.nextLine());
        Double moneyAvailable = Double.parseDouble(scanner.nextLine());

        int daysCount = 0;
        int daysSpend = 0;
        boolean isMoneyEnough = false;
        boolean cantSaveMoney = false;

        while (moneyAvailable < moneyNeeded) {
            daysCount++;

            String action = scanner.nextLine();
            double money = Double.parseDouble(scanner.nextLine());

            switch (action) {
                case "spend":
                    daysSpend++;
                    moneyAvailable -= money;
                    if (moneyAvailable < 0) {
                        moneyAvailable = 0.0;
                    }
                    break;
                case "save":
                    moneyAvailable += money;
                    daysSpend = 0;
                    break;
            }

            if (daysSpend == 5) {
                cantSaveMoney = true;
                break;
            }
        }
        if (cantSaveMoney) {
            System.out.println("You can't save the money.");
            System.out.println(daysCount);
        }else {
            System.out.printf("You saved the money for %d days.", daysCount);
        }
    }
}

