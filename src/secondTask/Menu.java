package secondTask;

import java.util.Scanner;

public class Menu {

  Scanner scanner = new Scanner(System.in);

  int firstNumber;
  int secondNumber;

  void menu() {
    System.out.println("Введіть першу цифру");
    firstNumber = scanner.nextInt();
    System.out.println("Введіть другу цифру");
    secondNumber = scanner.nextInt();

    scanner.close();
  }

}
