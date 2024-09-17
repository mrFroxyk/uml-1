import java.util.Objects;

/**
 * Класс, представляющий учебник.
 */
public class Textbook extends PrintedPublication {
  private String gradeLevel;

  /**
   * Конструктор по умолчанию.
   */
  public Textbook() {
    super();
    this.gradeLevel = "Unknown";
  }

  /**
   * Конструктор с параметрами.
   */
  public Textbook(String title, int year, int pages, String language, String gradeLevel) {
    super(title, year, pages, language);
    this.gradeLevel = gradeLevel;
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
    Textbook textbook = (Textbook) o;
    return Objects.equals(gradeLevel, textbook.gradeLevel);
  }

  /**
   * Возвращает хеш-код объекта.
   */
  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), gradeLevel);
  }

  /**
   * Возвращает строковое представление объекта.
   */
  @Override
  public String toString() {
    return "Textbook: " + super.toString() + ", gradeLevel='" + gradeLevel + '\'';
  }

  /**
   * Получает уровень класса, на который рассчитан учебник.
   *
   * @return Уровень класса.
   */
  public String getGradeLevel() {
    return gradeLevel;
  }

  /**
   * Устанавливает уровень класса, на который рассчитан учебник.
   */
  public void setGradeLevel(String gradeLevel) {
    this.gradeLevel = gradeLevel;
  }
}
