package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());

        double commissionPercent = 0;
        boolean ifError = false;
        double totalCommission = 0;

        switch (town){
            case "Sofia":
                if (sales >= 0 && sales <= 500){
                    commissionPercent = 0.05;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercent = 0.07;
                } else if (sales > 1000 && sales <=10000) {
                    commissionPercent = 0.08;
                } else if (sales > 10000) {
                    commissionPercent = 0.12;
                }else{
                    ifError = true;
                }
                break;
            case "Varna":
                if (sales >= 0 && sales <= 500){
                    commissionPercent = 0.045;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercent = 0.075;
                } else if (sales > 1000 && sales <=10000) {
                    commissionPercent = 0.1;
                } else if (sales > 10000) {
                    commissionPercent = 0.13;
                }else{
                    ifError = true;
                }
                break;
            case "Plovdiv":
                if (sales >= 0 && sales <= 500){
                    commissionPercent = 0.055;
                } else if (sales > 500 && sales <= 1000) {
                    commissionPercent = 0.08;
                } else if (sales > 1000 && sales <=10000) {
                    commissionPercent = 0.12;
                } else if (sales > 10000) {
                    commissionPercent = 0.145;
                }else{
                    ifError = true;
                }
                break;
            default: ifError = true;
        }
        totalCommission = sales * commissionPercent;

        if (ifError){
            System.out.println("error");
        }else{
            System.out.printf("%.2f",totalCommission);
        }
    }

}
