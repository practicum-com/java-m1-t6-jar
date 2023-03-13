import java.util.ArrayList;
import java.util.Scanner;

public class Library {

    ArrayList<Book> bookList;
    Scanner scanner;

    public Library() {
        bookList = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addBook() {
        System.out.println("Enter the book name:");
        String name = scanner.nextLine();

        System.out.println("Enter the book's author:");
        String author = scanner.nextLine();

        System.out.println("Enter the year of printing:");
        int year = scanner.nextInt();

        bookList.add(new Book(name, author, year));
    }

    public void findByAuthor() {
        System.out.println("Enter the book's author:");
        String author = scanner.nextLine();

        for (Book book : bookList) {
            if (book.getAuthor().equals(author)) {
                System.out.println(book.getTitle() + ", " + book.year);
            }
        }
    }

    public void printAll() {
        System.out.println("A total of " + bookList.size() + " books found.");
        for (Book book : bookList) {
            System.out.println(book.getAuthor() + " " + book.getTitle() + ", " + book.getYear());
        }
    }

}
