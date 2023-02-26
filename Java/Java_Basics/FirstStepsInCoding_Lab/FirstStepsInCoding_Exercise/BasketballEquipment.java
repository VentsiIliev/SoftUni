package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double annualTax = Double.parseDouble(scanner.nextLine());

        double sneakers = annualTax - annualTax * 0.4;
        double uniform = sneakers - sneakers * 0.2;
        double ball = uniform / 4;
        double accessories = ball / 5;
        double total = annualTax + sneakers + uniform + ball + accessories;
        System.out.println(total);

        }

    }

