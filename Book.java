import java.util.Objects;

/**
 * Класс, представляющий книгу.
 */
public class Book extends PrintedPublication {
    private String isbn;
    private int chapters;

    /**
     * Конструктор по умолчанию.
     */
    public Book() {
        super();
        this.isbn = "Unknown";
        this.chapters = 0;
    }

    /**
     * Конструктор с параметрами.
     */
    public Book(String title, int year, int pages, String language, String isbn, int chapters) {
        super(title, year, pages, language);
        this.isbn = isbn;
        setChapters(chapters);
    }

    /**
     * Проверяет, равны ли два объекта.
     */
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        if (getClass() != o.getClass())
            return false;
        Book book = (Book) o;
        return chapters == book.chapters && Objects.equals(isbn, book.isbn);
    }

    /**
     * Возвращает хеш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isbn, chapters);
    }

    /**
     * Возвращает строковое представление объекта.
     */
    @Override
    public String toString() {
        return "Book: " + super.toString() + ", ISBN='" + isbn + '\'' + ", chapters=" + chapters;
    }

    /**
     * Получает ISBN книги.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Устанавливает ISBN книги.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Получает количество глав в книге.
     */
    public int getChapters() {
        return chapters;
    }

    /**
     * Устанавливает количество глав в книге с проверкой на диапазон.
     */
    public void setChapters(int chapters) {
        if (chapters < 1 || chapters > 100) {
            throw new IllegalArgumentException("Chapters must be between 1 and 100.");
        }
        this.chapters = chapters;
    }
}
