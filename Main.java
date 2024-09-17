import java.util.ArrayList;
import java.util.Scanner;

/**
 * Главный класс программы для управления публикациями.
 */
public class Main {
    private static ArrayList<PrintedPublication> publications = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    private static final String HELP_TEXT = """
            1. Add new publication
            2. Remove publication by index
            3. Print all publications
            4. Compare two publications by index
            5. Exit
            Enter your choice:
            """;

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            System.out.println(HELP_TEXT);
            int choice = readIntInput();
            switch (choice) {
                case 1:
                    addPublication();
                    break;
                case 2:
                    removePublication();
                    break;
                case 3:
                    printAllPublications();
                    break;
                case 4:
                    comparePublications();
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    /**
     * Считывает целочисленный ввод от пользователя.
     *
     * @return Введенное целое число.
     */
    private static int readIntInput() {
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter a valid integer.");
                scanner.next();
            }
        }
    }

    /**
     * Добавляет новую публикацию в список.
     */
    private static void addPublication() {
        System.out.println("""
                Which publication would you like to add?
                1. Magazine
                2. Book
                3. SchoolBook
                """);
        String choice = scanner.next();
        switch (choice) {
            case "1":
                addMagazine();
                break;
            case "2":
                addBook();
                break;
            case "3":
                addSchoolBook();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }

    /**
     * Добавляет новый журнал в список публикаций.
     */
    private static void addMagazine() {
        System.out.println("Enter metadata about the magazine:");
        System.out.println("Enter title:");
        String title = scanner.next();
        System.out.println("Enter year:");
        int year = readIntInput();
        System.out.println("Enter number of pages:");
        int pages = readIntInput();
        System.out.println("Enter language:");
        String language = scanner.next();
        System.out.println("Enter theme:");
        String theme = scanner.next();
        System.out.println("Enter circulation:");
        int circulation = readIntInput();
        publications.add(new Magazine(title, year, pages, language, theme, circulation));
        System.out.println("Magazine added successfully!");
    }

    /**
     * Добавляет новую книгу в список публикаций.
     */
    private static void addBook() {
        System.out.println("Enter metadata about the book:");
        System.out.println("Enter title:");
        String title = scanner.next();
        System.out.println("Enter year:");
        int year = readIntInput();
        System.out.println("Enter number of pages:");
        int pages = readIntInput();
        System.out.println("Enter language:");
        String language = scanner.next();
        System.out.println("Enter ISBN:");
        String isbn = scanner.next();
        System.out.println("Enter number of chapters:");
        int chapters = readIntInput();
        publications.add(new Book(title, year, pages, language, isbn, chapters));
        System.out.println("Book added successfully!");
    }

    /**
     * Добавляет новый учебник в список публикаций.
     */
    private static void addSchoolBook() {
        System.out.println("Enter metadata about the school book:");
        System.out.println("Enter title:");
        String title = scanner.next();
        System.out.println("Enter year:");
        int year = readIntInput();
        System.out.println("Enter number of pages:");
        int pages = readIntInput();
        System.out.println("Enter language:");
        String language = scanner.next();
        System.out.println("Enter ISBN:");
        String isbn = scanner.next();
        System.out.println("Enter number of chapters:");
        int chapters = readIntInput();
        System.out.println("Enter subject:");
        String subject = scanner.next();
        System.out.println("Enter edition:");
        int edition = readIntInput();
        publications.add(new SchoolBook(title, year, pages, language, isbn, chapters, subject, edition));
        System.out.println("SchoolBook added successfully!");
    }

    /**
     * Удаляет публикацию по индексу.
     */
    private static void removePublication() {
        System.out.println("Enter index of publication to remove: ");
        int index = readIntInput();
        if (index >= 0 && index < publications.size()) {
            publications.remove(index);
            System.out.println("Publication removed successfully");
        } else {
            System.out.println("Invalid index");
        }
    }

    /**
     * Печатает все публикации в списке.
     */
    private static void printAllPublications() {
        System.out.println("All publications:");
        for (PrintedPublication publication : publications) {
            System.out.println(publication);
        }
        System.out.println();
    }

    /**
     * Сравнивает две публикации по индексу.
     */
    private static void comparePublications() {
        System.out.println("Enter index of first publication: ");
        int index1 = readIntInput();
        System.out.println("Enter index of second publication: ");
        int index2 = readIntInput();
        if (index1 >= 0 && index1 < publications.size() && index2 >= 0 && index2 < publications.size()) {
            PrintedPublication pub1 = publications.get(index1);
            PrintedPublication pub2 = publications.get(index2);
            if (pub1.equals(pub2)) {
                System.out.println("Publications are equal");
            } else {
                System.out.println("Publications are not equal");
            }
        } else {
            System.out.println("Invalid index");
        }
    }
}
