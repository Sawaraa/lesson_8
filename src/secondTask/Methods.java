package secondTask;

public class Methods extends Menu{

  void check() throws MyException, IllegalAccessException {

    String messageForMyException = "Перша та друга цифра є більшими за  0";

    if(firstNumber < 0 && secondNumber < 0){
      throw new IllegalArgumentException("Перша та друга цифра є меншими за 0");
    }

    if((firstNumber == 0 && secondNumber != 0)
      || (firstNumber != 0 && secondNumber == 0))
    {
      throw new ArithmeticException("Перша цифра дорівнює 0, друга цифра не дорівнює 0 "
          + "перша цифра не дорівнює 0, друга цифра дорівнює 0");
    }

    if(firstNumber == 0 || secondNumber == 0){
      throw new IllegalAccessException("Перша та друга цифра дорівнює 0");
    }

    if(firstNumber > 0 && secondNumber > 0){
      throw new MyException(messageForMyException);
    }

  }

  public void devide() throws MyException, IllegalAccessException {
   /* if( secondNumber == 0){
      System.out.println("На нуль ділити не можна");
    }else {
      int devide = firstNumber / secondNumber;
      System.out.println(firstNumber + " / " + secondNumber + " = " + devide);
    }*/
    check();
    int devide = firstNumber / secondNumber;
    System.out.println(firstNumber + " / " + secondNumber + " = " + devide);
  }

  public void minus() throws MyException, IllegalAccessException {
    check();
    int minus =  firstNumber - secondNumber;
    System.out.println( firstNumber + " - " + secondNumber + " = " + minus);
  }

  public void multiply() throws MyException, IllegalAccessException {
    check();
    int multiply = firstNumber * secondNumber;
    System.out.println( firstNumber + " * " + secondNumber + " = " + multiply);
  }

  public void add() throws MyException, IllegalAccessException {
    check();
    int add = firstNumber + secondNumber;
    System.out.println( firstNumber + " + " + secondNumber + " = " + add);
  }

}
