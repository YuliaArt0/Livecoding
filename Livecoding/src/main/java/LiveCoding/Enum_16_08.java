package LiveCoding;

import static LiveCoding.Enum_16_08.Season.SUMMER;

public class Enum_16_08 {

  enum Season {
    SPRING, SUMMER, AUTUMN, WINTER
  }

  //  Enum
  public static void main(String[] args) {
    Enum_16_08.Season season = SUMMER;
    switch (season){
      case SPRING:
        System.out.println("Весна");
        break;
      case SUMMER:
        System.out.println("Лето");
        break;
      case AUTUMN:
        System.out.println("Осень");
        break;
      case WINTER:
        System.out.println("Зима");
        break;
    }
  }
}
