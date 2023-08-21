package Enum;

/**
 * Виняток, який виникає при некоректному введенні параметрів з консолі.
 */
public class WrongInputConsoleParametersException extends Exception{

  /** Повідомлення про помилку. */
  String message;

  /**
   * Конструктор з параметрами.
   *
   * @param message повідомлення про помилку
   */

  public WrongInputConsoleParametersException(String message) {
    super(message);
    this.message = message;
  }
}
