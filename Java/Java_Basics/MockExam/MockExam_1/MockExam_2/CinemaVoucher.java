package MockExam.MockExam_1.MockExam_2;

import java.util.Scanner;

public class CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucher = Integer.parseInt(scanner.nextLine());

        double purchasePrice = 0;
        int tickets = 0;
        int otherPurchase = 0;
        String command = scanner.nextLine();
        while (!command.equals("End")) {
            String purchase = command;

            if (purchase.length() > 8) {
                purchasePrice = purchase.charAt(0) + purchase.charAt(1);
                if (purchasePrice <= voucher) {
                    voucher -= purchasePrice;
                    tickets++;
                } else {
                    break;
                }

            } else {
                purchasePrice = purchase.charAt(0);
                if (purchasePrice <= voucher) {
                    voucher -= purchasePrice;
                    otherPurchase++;
                } else {
                    break;
                }
            }
            command = scanner.nextLine();
        }
        System.out.printf("%d\n", tickets);
        System.out.printf("%d", otherPurchase);
    }
}
