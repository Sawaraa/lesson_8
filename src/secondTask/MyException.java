package secondTask;

public class MyException extends Throwable {

  String message;

  public MyException(String message) {
    super(message);
    this.message = message;
  }
}
