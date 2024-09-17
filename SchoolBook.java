import java.util.Objects;

/**
 * Класс, представляющий учебник (SchoolBook).
 */
public class SchoolBook extends Book {
    private String subject;
    private int edition;

    /**
     * Конструктор по умолчанию.
     */
    public SchoolBook() {
        super();
        this.subject = "Unknown";
        this.edition = 1;
    }

    /**
     * Конструктор с параметрами.
     */
    public SchoolBook(String title, int year, int pages, String language, String isbn, int chapters, String subject, int edition) {
        super(title, year, pages, language, isbn, chapters);
        this.subject = subject;
        setEdition(edition);
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
        SchoolBook schoolBook = (SchoolBook) o;
        return edition == schoolBook.edition && Objects.equals(subject, schoolBook.subject);
    }

    /**
     * Возвращает хеш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), subject, edition);
    }

    /**
     * Возвращает строковое представление объекта.
     */
    @Override
    public String toString() {
        return "SchoolBook: " + super.toString() + ", subject='" + subject + '\'' + ", edition=" + edition;
    }

    /**
     * Получает предмет учебника.
     *
     * @return Предмет учебника.
     */
    public String getSubject() {
        return subject;
    }

    /**
     * Устанавливает предмет учебника.
     */
    public void setSubject(String subject) {
        this.subject = subject;
    }

    /**
     * Получает номер издания учебника.
     *
     * @return Номер издания.
     */
    public int getEdition() {
        return edition;
    }

    /**
     * Устанавливает номер издания учебника.
     * Значение должно быть больше 0.
     *
     * @param edition Номер издания.
     * @throws IllegalArgumentException Если номер издания меньше 1.
     */
    public void setEdition(int edition) {
        if (edition < 1) {
            throw new IllegalArgumentException("Edition must be greater than 0.");
        }
        this.edition = edition;
    }
}
