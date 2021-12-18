package lv.sda.books;

import java.util.Scanner;

public class Application {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Ievadiet q, lai izietu.");
            System.out.println("Ievadiet ciparu:");
            String input = scanner.nextLine();

            if ("q".equalsIgnoreCase(input)) {
                System.out.println("Izejam, beidzam darbu.");
                break;
            }
        }
    }
}
