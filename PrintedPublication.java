import java.util.Objects;

/**
 * Класс, представляющий печатное издание.
 */
public class PrintedPublication {
  protected String title;
  protected int year;
  protected int pages;
  protected String language;

  private static final int MIN_YEAR = 0;
  private static final int MAX_YEAR = 9999;
  private static final int MIN_PAGES = 1;
  private static final int MAX_PAGES = 10000;

  /**
   * Конструктор по умолчанию.
   */
  public PrintedPublication() {
    this.title = "Unknown";
    this.year = MIN_YEAR;
    this.pages = MIN_PAGES;
    this.language = "Unknown";
  }

  /**
   * Конструктор с параметрами.
   */
  public PrintedPublication(String title, int year, int pages, String language) {
    this.title = title;
    setYear(year);
    setPages(pages);
    this.language = language;
  }

  /**
   * Проверяет, равны ли два объекта.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    PrintedPublication that = (PrintedPublication) o;
    return year == that.year &&
        pages == that.pages &&
        Objects.equals(title, that.title) &&
        Objects.equals(language, that.language);
  }

  /**
   * Возвращает хеш-код объекта.
   */
  @Override
  public int hashCode() {
    return Objects.hash(title, year, pages, language);
  }

  /**
   * Возвращает строковое представление объекта.
   */
  @Override
  public String toString() {
    return "{title='" + title + '\'' +
        ", year=" + year +
        ", pages=" + pages +
        ", language='" + language + '\'' +
        '}';
  }

  /**
   * Получает название издания.
   *
   * @return Название издания.
   */
  public String getTitle() {
    return title;
  }

  /**
   * Устанавливает название издания.
   */
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Получает год издания.
   *
   * @return Год издания.
   */
  public int getYear() {
    return year;
  }

  /**
   * Устанавливает год издания.
   */
  public void setYear(int year) {
    if (year < MIN_YEAR || year > MAX_YEAR) {
      throw new IllegalArgumentException("Year must be between " + MIN_YEAR + " and " + MAX_YEAR);
    }
    this.year = year;
  }

  /**
   * Получает количество страниц.
   *
   * @return Количество страниц.
   */
  public int getPages() {
    return pages;
  }

  /**
   * Устанавливает количество страниц.
   */
  public void setPages(int pages) {
    if (pages < MIN_PAGES || pages > MAX_PAGES) {
      throw new IllegalArgumentException("Pages must be between " + MIN_PAGES + " and " + MAX_PAGES);
    }
    this.pages = pages;
  }

  /**
   * Получает язык издания.
   *
   * @return Язык издания.
   */
  public String getLanguage() {
    return language;
  }

  /**
   * Устанавливает язык издания.
   */
  public void setLanguage(String language) {
    this.language = language;
  }
}
