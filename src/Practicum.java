import java.util.Scanner;

public class Practicum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library library = new Library();

        while (true) {
            printMenu();

            int command = scanner.nextInt();
            if (command == 0) {
                System.out.println("Exit.");
                break;
            } else if (command == 1) {
                library.addBook();
            } else if (command == 2) {
                library.findByAuthor();
            } else if (command == 3) {
                library.printAll();
            } else {
                System.out.println("Sorry, there is no such command yet.");
            }
        }
    }

    public static void printMenu() {
        System.out.println("What would you like to do? ");
        System.out.println("1 — Add the book.");
        System.out.println("2 — Find the books of an author.");
        System.out.println("3 — See the list of books.");
        System.out.println("0 - Exit.");
    }

}
