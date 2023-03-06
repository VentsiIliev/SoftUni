package WhileLoops_Lab.WhileLoops_Exercise;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();

        String books = scanner.nextLine();
        int booksCount = 0;
        boolean isFound = false;
        while (!books.equals("No More Books")) {


            if (books.equals(searchedBook)) {
                isFound = true;
                break;
            }
            booksCount++;
            books = scanner.nextLine();
        }
        if (isFound) {
            System.out.printf("You checked %d books and found it.", booksCount);
        } else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.", booksCount);

        }
    }
}