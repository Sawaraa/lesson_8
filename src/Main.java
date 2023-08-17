import java.util.Scanner;

public class Main extends Enum {

  static void menu(){
    System.out.println("Натисніть 1, щоб перевірити чи існує такий місяць");
    System.out.println("Натисніть 2, щоб вивести всі місяці які мають таку ж саму пору року");
    System.out.println("Натисніть 3, щоб вивести всі місяці які мають таку саму кількість дні ");
    System.out.println("Натисніть 4, щоб вивести місяці які мають найменшу кількість днів");
    System.out.println("Натисніть 5, щоб вивести місяці які мають більшу кількість днів");
    System.out.println("Натисніть 6, щоб вивести наступну пору року");
    System.out.println("Натисніть 7, щоб вивести попередню пору року");
    System.out.println("Натисніть 8, щоб вивести місяці які мають парну кількість днів");
    System.out.println("Натисніть 9, щоб вивести місяці які мають не парну кількість днів");
    System.out.println("Натисніть 10, щоб перевірити ци місяць має парну кількість днів");
  }
  public static void main(String[] args) {

    Months [] mas_months = Months.values();
    Scanner scanner = new Scanner(System.in);

    while(true){
      menu();

      switch (scanner.next()){

        case "1": {
          System.out.println("Введіть місяць");
          scanner = new Scanner(System.in);
          String month = scanner.next();

          boolean ifExist = false;

          for (Months m : mas_months) {
            if (m.name().equalsIgnoreCase(month)) {
              System.out.println("Місяць: " + month + " існує");
              ifExist = true;
            }
          }

          if (!ifExist) {
            System.out.println("Місяць: " + month + " не існує");
          }
          break;
        }
        case "2": {
          System.out.println("Введіть пору року");
          scanner = new Scanner(System.in);
          String seasons = scanner.next().toUpperCase();

          boolean ifExist = false;

          for(Months m : mas_months){
            if(m.getSeasons().name().equals(seasons)){
              System.out.println(m);
              ifExist = true;
            }
          }
         /* if(ifExist){
            Seasons seas = Seasons.valueOf(seasons);

            for(Months mon: mas_months){
              if(mon.getSeasons().name().equalsIgnoreCase(seasons)){
                System.out.println(mon);
              }
            }
          }*/
          if(!ifExist){
            System.out.println("Пора року не існує");
          }
          break;
        }

        case "3": {
          System.out.println("Введіть кількість днів");
          scanner = new Scanner(System.in);
          int day = scanner.nextInt();

          boolean ifExist = false;

          for(Months m : mas_months){
            if(m.getDays() == day){
              System.out.println("Місяці з "+ day + " днів: " + m);
              ifExist = true;
            }
          }

          if(!ifExist){
            System.out.println("Такий місяць не існує");
          }
          break;
        }

        case "4": {
          int min = Integer.MAX_VALUE;

          for(Months m: mas_months){
            if(m.getDays() < min){
              min = m.getDays();
            }
          }

          for(Months m : mas_months){
            if(m.getDays() == min){
              System.out.println(m);
            }
          }

          break;
        }

        case "5":{
          int max = 0;

          for(Months m: mas_months){
            if(m.getDays() > max){
              max = m.getDays();
            }
          }

          for(Months m : mas_months){
            if(m.getDays() == max){
              System.out.println(m);
            }
          }
          break;
        }

        case "6":{
          Seasons [] seasons_mas = Seasons.values();
          System.out.println("Введіть пору року");
          scanner = new Scanner(System.in);
          String seasons = scanner.next().toUpperCase();

          boolean ifExist = false;

          for(Seasons s: seasons_mas){
            if(s.name().equalsIgnoreCase(seasons)){
              ifExist = true;
            }
          }
          if(ifExist){
            Seasons seasons1 = Seasons.valueOf(seasons);
            int ordinal = seasons1.ordinal();

            if(ordinal == (seasons_mas.length -1)){
              ordinal = 0;
              System.out.println("Наступна пора року: "+ seasons_mas[ordinal]);
            }else{
              System.out.println("Наступна пора року: "+ seasons_mas[ordinal + 1]);
            }
          }
          if(!ifExist){
            System.out.println("Пора року не існує");
          }
          break;
        }

        case "7" :{
          Seasons [] seasons_mas = Seasons.values();
          System.out.println("Введіть пору року");
          scanner = new Scanner(System.in);
          String seasons = scanner.next().toUpperCase();

          boolean ifExist = false;

          for(Seasons s: seasons_mas){
            if(s.name().equalsIgnoreCase(seasons)){
              ifExist = true;
            }
          }
          if(ifExist){
            Seasons seasons1 = Seasons.valueOf(seasons);
            int ordinal = seasons1.ordinal();

            if(ordinal == 0){
              ordinal = seasons_mas.length - 1;
              System.out.println("Попередня пора року: "+ seasons_mas[ordinal]);
            }else{
              System.out.println("Попередня пора року: "+ seasons_mas[ordinal - 1]);
            }
          }
          if(!ifExist){
            System.out.println("Пора року не існує");
          }
          break;
        }

        case "8":{

          for(Months m: mas_months){
            if(m.getDays() % 2 == 0){
              System.out.println("Місяць який має парну кількість днів "+m);
            }
          }

          break;
        }

        case "9":{

          for (Months m: mas_months){
            if(m.getDays() % 2 != 0){
              System.out.println("Місяць який має не парну кількість днів :"+m);
            }
          }

          break;
        }

        case "10":{
          System.out.println("Введіть місяць");
          scanner = new Scanner(System.in);
          String month = scanner.next();

          boolean ifExist = false;

          for (Months m : mas_months) {
            if (m.name().equalsIgnoreCase(month)) {
              ifExist = true;
              if(m.getDays() % 2 == 0){
                System.out.println(m+" має парну кількість днів: " + m.getDays());
              }else{
                System.out.println(m+" не має парну кількість днів: " + m.getDays());
              }
            }
          }
          if (!ifExist) {
            System.out.println("Місяць: " + month + " не існує");
          }


          break;
        }
      }

    }

  }
}