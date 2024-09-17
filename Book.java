import java.util.Objects;

/**
 * Класс, представляющий книгу.
 */
public class Book extends PrintedPublication {
  private String author;

  /**
   * Конструктор по умолчанию.
   */
  public Book() {
    super();
    this.author = "Unknown";
  }

  /**
   * Конструктор с параметрами.
   */
  public Book(String title, int year, int pages, String language, String author) {
    super(title, year, pages, language);
    this.author = author;
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
    return Objects.equals(author, book.author);
  }

  /**
   * Возвращает хеш-код объекта.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), author);
  }

  /**
   * Возвращает строковое представление объекта.
   */
  @Override
  public String toString() {
    return "Book: " + super.toString() + ", author='" + author + '\'';
  }

  /**
   * Получает автора книги.
   *
   * @return Автор книги.
   */
  public String getAuthor() {
    return author;
  }

  /**
   * Устанавливает автора книги.
   */
  public void setAuthor(String author) {
    this.author = author;
  }
}
