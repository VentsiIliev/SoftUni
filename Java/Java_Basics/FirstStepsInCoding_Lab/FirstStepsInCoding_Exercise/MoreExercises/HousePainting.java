package FirstStepsInCoding_Lab.FirstStepsInCoding_Exercise.MoreExercises;

import java.util.Scanner;

public class HousePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	x – височината на къщата – реално число в интервала [2...100]
        double x = Double.parseDouble(scanner.nextLine());
        //2.	y – дължината на страничната стена – реално число в интервала [2...100]
        double y = Double.parseDouble(scanner.nextLine());
        //3.	h – височината на триъгълната стена на прокрива – реално число в интервала [2...100]
        double h = Double.parseDouble(scanner.nextLine());

        double rearWallArea = x * x;
        double doorArea = 1.2 * 2;
        double frontWallArea = rearWallArea - doorArea;
        double frontAndBackWalls = rearWallArea + frontWallArea;

        double sideWallArea1 = x * y;
        double windowArea = 1.5 * 1.5;
        double sideWallArea2 = sideWallArea1 - 2 * windowArea;
        double leftAndRightWallArea = sideWallArea1 + sideWallArea2;

        double greenPaint = (leftAndRightWallArea + frontAndBackWalls) / 3.4;

         double roofSIdes =  2 * (x * y);
         double roofTriangles = 2 * ((x * h) / 2);
         double roofArea = roofTriangles + roofSIdes;
         double redPaint = roofArea / 4.3;

         System.out.printf("%.2f %n" , greenPaint);
         System.out.printf("%.2f" , redPaint);
        }
    }

