package Coding;

import java.util.Scanner;

public class Test2 {

  public static void main(String[] args) {
    // Задача на факториал рекурсивно, сначала создала класс Factorial, в нем метод factorial
    // и теперь нужно вызвать в этом методе

    // Факториал без рекурсии
//    Scanner scanner = new Scanner(System.in);
//    System.out.println(factorial());
//  }
//  public static int factorial() {
//    Scanner scanner = new Scanner(System.in);
//    int result = 1;
//    System.out.println("Введите число: ");
//    int temp = scanner.nextInt();
//
//    for (int i = 1; i <= temp; i++) {
//      result +=i;
//    }
//    return result;
//  }

    //  public int factorial(int i) {
//    Scanner scanner = new Scanner(System.in);
//    if (i <= 1) return i;
//     else {
//      return i * factorial(i - 1);
//    }
//  }

  int number = 5;
  long result = factorial(number);

  System.out.println("Факториал числа " + number + " равен " + result);
  }
    public static long factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }  else {
      return n * factorial(n - 1);
    }
  }
}
