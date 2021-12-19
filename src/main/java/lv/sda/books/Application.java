package lv.sda.books;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Application {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Search Book");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Get book info");
            System.out.println("5. List Available Books");
            System.out.println(" To quit press: q");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                System.out.println("Quiting application");
                break;
            }
            switch (input) {
                case "1":
                    System.out.println("Searching for book");
                    break;
                case "2":
                    System.out.println("Adding book");

                    break;
                case "3":
                    System.out.println("Removing book");
                    System.out.println("Provide Isbn of the book to remove: ");
                    scanner.nextLine();
                    break;
                case "4":
                    System.out.println("Getting book info");
                    break;
                case "5":
                    System.out.println("Listing available books:");
                    break;
                default:
                    System.out.println("Wrong input, please try again");
            }
            System.out.println();

        }
    }
}
