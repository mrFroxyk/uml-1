import java.util.Objects;

/**
 * Класс, представляющий журнал (Magazine).
 */
public class Magazine extends PrintedPublication {
    private String theme;
    private int circulation;

    /**
     * Конструктор по умолчанию.
     */
    public Magazine() {
        super();
        this.theme = "Unknown";
        this.circulation = 0;
    }

    /**
     * Конструктор с параметрами.
     */
    public Magazine(String title, int year, int pages, String language, String theme, int circulation) {
        super(title, year, pages, language);
        this.theme = theme;
        setCirculation(circulation);
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
        return circulation == magazine.circulation && Objects.equals(theme, magazine.theme);
    }

    /**
     * Возвращает хеш-код объекта.
     */
    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), theme, circulation);
    }

    /**
     * Возвращает строковое представление объекта.
     */
    @Override
    public String toString() {
        return "Magazine: " + super.toString() + ", theme='" + theme + '\'' + ", circulation=" + circulation;
    }

    /**
     * Получает тематику журнала.
     *
     * @return Тематика журнала.
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Устанавливает тематику журнала.
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * Получает тираж журнала.
     *
     * @return Тираж журнала.
     */
    public int getCirculation() {
        return circulation;
    }

    /**
     * Устанавливает тираж журнала.
     * Значение должно быть больше 0.
     *
     * @param circulation Тираж журнала.
     * @throws IllegalArgumentException Если тираж меньше 1.
     */
    public void setCirculation(int circulation) {
        if (circulation < 1) {
            throw new IllegalArgumentException("Circulation must be greater than 0.");
        }
        this.circulation = circulation;
    }
}
