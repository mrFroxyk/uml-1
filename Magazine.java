import java.util.Objects;

/**
 * Класс, представляющий журнал.
 */
public class Magazine extends PrintedPublication {
  private int issueNumber;

  private static final int MIN_ISSUE_NUMBER = 1;

  /**
   * Конструктор по умолчанию.
   */
  public Magazine() {
    super();
    this.issueNumber = MIN_ISSUE_NUMBER;
  }

  /**
   * Конструктор с параметрами.
   */
  public Magazine(String title, int year, int pages, String language, int issueNumber) {
    super(title, year, pages, language);
    setIssueNumber(issueNumber);
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
    Magazine magazine = (Magazine) o;
    return issueNumber == magazine.issueNumber;
  }

  /**
   * Возвращает хеш-код объекта.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), issueNumber);
  }

  /**
   * Возвращает строковое представление объекта.
   */
  @Override
  public String toString() {
    return "Magazine: " + super.toString() + ", issueNumber=" + issueNumber;
  }

  /**
   * Получает номер выпуска.
   *
   * @return Номер выпуска.
   */
  public int getIssueNumber() {
    return issueNumber;
  }

  /**
   * Устанавливает номер выпуска.
   */
  public void setIssueNumber(int issueNumber) {
    if (issueNumber < MIN_ISSUE_NUMBER) {
      throw new IllegalArgumentException("Issue number must be greater than " + MIN_ISSUE_NUMBER);
    }
    this.issueNumber = issueNumber;
  }
}
