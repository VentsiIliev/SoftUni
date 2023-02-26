package ConditionalStatements_Lab.ConditionalStatements_Exercise.MoreExerciseSecond;

import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelLevel = Double.parseDouble(scanner.nextLine());

        switch (fuelType) {
            case "Diesel":
                if (fuelLevel < 25) {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
                } else if (fuelLevel >= 25) {
                    System.out.printf("You have enough %s.", fuelType.toLowerCase());
                }
                break;
            case "Gasoline":
                if (fuelLevel < 25) {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
                } else if (fuelLevel >= 25) {
                    System.out.printf("You have enough %s.", fuelType.toLowerCase());
                }
                break;
            case "Gas":

                if (fuelLevel < 25) {
                    System.out.printf("Fill your tank with %s!", fuelType.toLowerCase());
                } else if (fuelLevel >= 25) {
                    System.out.printf("You have enough %s.", fuelType.toLowerCase());
            }
                break;
            default:
                System.out.printf("Invalid fuel!");
                break;

                }

            }
        }


