package Enum;

/**
 * Клас, що представляє перераховування місяців.
 *
 * Даний клас описує перераховування місяців разом з їх характеристиками,
 * такими як кількість днів та сезон до якого вони належать.
 *
 * @author Daniella
 * @since 2023
 */
public class EnumMonths extends EnumSeasons{

  /**
   * Перераховування для місяців з визначенням кількості днів та сезонів.
   */
  enum Months {
    JANUARY(31, Seasons.WINTER), FEBRUARY (28, Seasons.WINTER),
    MARCH(31, Seasons.SPRING), APRIL(30, Seasons.SPRING),
    MAY(31, Seasons.SPRING), JUNE(30, Seasons.SUMMER),
    JULY(31, Seasons.SUMMER), AUGUST(31, Seasons.SUMMER),
    SEPTEMBER(30, Seasons.FALL), OCTOBER(31, Seasons.FALL),
    NOVEMBER(30, Seasons.FALL), DECEMBER(31, Seasons.WINTER);
    int days;
    Seasons seasons;

    /**
     * Конструктор для перераховування місяців.
     *
     * @param days    кількість днів у місяці
     * @param seasons сезон, до якого належить місяць
     */
    Months(int days, Seasons seasons) {
      this.days = days;
      this.seasons = seasons;
    }


    /**
     * Отримати кількість днів у місяці.
     *
     * @return кількість днів
     */
    public int getDays() {
      return days;
    }


    /**
     * Отримати сезон, до якого належить місяць.
     *
     * @return сезон
     */
    public Seasons getSeasons() {
      return seasons;
    }
  }
}
