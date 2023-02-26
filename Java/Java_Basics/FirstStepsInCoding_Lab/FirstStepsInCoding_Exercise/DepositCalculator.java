package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class DepositCalculator {
    public static void  main(String[] arg){
        Scanner scanner = new Scanner(System.in);

        double deposit = Double.parseDouble(scanner.nextLine());
        double months = Double.parseDouble(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());

        double annualInterest = deposit * annualInterestRate / 100;
        double monthlyInterest = annualInterest / 12;
        double sum = deposit + months * monthlyInterest;

        System.out.println(sum);
        }








    }

