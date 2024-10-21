package Coding;

import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Trening {

  public static void main(String[] args) {
    // Сделай мне лист int значений и добавь туда 5 отрицательных чисел
//    List<Integer> list = List.of(-5, -4, -3, -2, -1);
//    List<Integer> list2 = list.stream()
//        .map(Math::abs)
//        .toList();
//    System.out.println(list2);

    // Лист имен, вывести имена на определенную букву
//    List<String> list = List.of("Борис", "Владимир", "Богдан", "Алексей");
//    List<String> list2 = list.stream()
//        .filter(x -> x.startsWith("Б"))
//        .toList();
//    System.out.println(list2);

    // Перевернуть слово "Hello"
//    String str = "Hello";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for (int i = length - 1; i >= 0; i--) {
//      char temp = str.charAt(i);
//      chars[counter++] = temp;
//    }
//    System.out.println(chars);
    // удалить дубликаты из массива int[] sortedList = {1, 11, 1, 3, 3, 1};
    // с помощью коллекций
//     List<Integer> list = List.of(1, 11, 1, 3, 3, 1);
//     List<Integer> list2 = list.stream()
//         .distinct()
//         .toList();
//    System.out.println(list2);

    // с помощью мапы int[] sortedList = {1, 11, 1, 3, 3, 1};
//    int[] sortedList = {1, 11, 1, 3, 3, 1};
//    Set<Integer> set = new HashSet<>();
//    for (int element : sortedList) {
//      set.add(element);
//    }
//    System.out.println(set);
    // посчитать сколько в этой строке встречается символов "Hello world!"
//    String str = "Hello world!";
//    char[] chars = str.toCharArray();
//    Set<Character> set = new HashSet<>();
//    for (char temp : chars) {
//      set.add(temp);
//    }
//    System.out.println(set.size());
//  }

//  Задача на факториал
    // без рекурсии
//    System.out.println(fact());
//  }
//  public static int fact() {
//    Scanner scanner = new Scanner(System.in);
//    int result = 1;
//    System.out.println("Введите число: ");
//    int temp = scanner.nextInt();
//    for (int i = 1; i <= temp; i++) {
//      result += 1;
//    }
//    return result;
//  }
// Факториал с рекурсией
//    int number = 5;
//    int result = fact(number);
//    System.out.println("Факториал числа " + number + " равен " + result);
//  }
//  public static int fact(int n) {
//    if (n == 0 || n == 1) {
//      return 1;
//    } else  {
//      return n * fact(n - 1);
//    }
//  }

  }
}
