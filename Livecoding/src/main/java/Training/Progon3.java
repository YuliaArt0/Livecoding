package Training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Progon3 {

  public static void main(String[] args) {

//(1)//Напиши функцию проверки валидности открытия/закрытия скобок - с помощью Стека. Пример: System.out.println(validate("([{}])"); Результат: true
//    String str = "([{}])";
//    System.out.println();
//  }
//  public static boolean isValid(String str) {
//
//  }
//// (2) Написать функцию, которая проверяет, является ли одно слово аннаграммой другого
//// На вход падается 2 строки. На выходе true или false:
////   "жуткая", "утяжка" - true
////   "канонада", "анаконда" - true
////   "стол", "стул" - false
//    System.out.println(isAnagram("обезьянство", "оветьянсзбо"));
//    System.out.println(isAnagram("место", "тесмоп"));
//    System.out.println(isAnagram("мечеть", "чеметь"));
//  }
//   public static boolean isAnagram(String strFirst, String strSecond) {
//    if (strFirst.length() != strSecond.length()) {
//      return false;
//    }
//    var strFirstChars = strFirst.toCharArray();
//    Arrays.sort(strFirstChars);
//    var strSecondChars = strSecond.toCharArray();
//    Arrays.sort(strSecondChars);
//    for (int i = 0; i < strSecond.length(); i++) {
//      if (strFirstChars[i] != strSecondChars[i]) {
//        return false;
//      }
//    }
//    return true;
//   }
//
//  public static boolean isAnagram(String firstAnagram, String secondAnagram) {
//    if (firstAnagram.length() != secondAnagram.length()) {
//      return false;
//    }
//    char[] firstChars = firstAnagram.toCharArray();
//    char[] secondChars = secondAnagram.toCharArray();
//    boolean[] marker = new boolean[secondChars.length];
//    for (char temp : firstChars) {
//      for (int i = 0; i < secondChars.length; i++) {
//        if (temp == secondChars[i]) {
//          if (!marker[i]) {
//            marker[i] = true;
//            break;
//          }
//        }
//        if (i == secondChars.length - 1) {
//          return false;
//        }
//      }
//    }
//    return true;
//  }

//(3)// Написать метод, который принимает на вход строку
// и ищет в ней самую длинную подстроку, состоящую из одинаковых символов.
// Если таких подстрок несколько, то искомая подстрока - самая левая.
// Метод возвращает найденную подстроку.
// input: 11225553377755544411
// output: 555
    String str = "11225553377755544411";
    StringBuilder max = new StringBuilder();
    StringBuilder temp = new StringBuilder();
    char[] chars = str.toCharArray();
    char symbol = chars[0];
    for (int i = 0; i < str.length(); i++) {
      if (symbol == chars[i]) {
        temp.append(symbol);
      } else {
        symbol = chars[i];
        temp = new StringBuilder();
        temp.append(symbol);
      }
      if (temp.length() > max.length())
        max = temp;
    }
    System.out.println(max);
  }

// (4) // Вывести первых 11 чисел Фиббоначи включая сумму
//  int fib = 11;
//  int[] nums = new int[fib];
//  nums[1] = 1;
//  for (int i = 2; i < fib; i++) {
//  nums[i] = nums[i-1] + nums[i-2];
//  }
//  int sum = Arrays.stream(nums).sum();
//    System.out.println("11 первых чисел Фиббоначи: " + Arrays.toString(nums));
//    System.out.println("Сумма чисел Фиббоначи: " + sum);
//
//  }
//   Если попросят убрать метод toString, что ты будешь делать
//   После верхнего решения, после int sum
//  int sum = Arrays.stream(nums).sum();
//  System.out.print("11 первых чисел Фиббоначи: ");
//        for (int i = 0; i < fib; i++) {
//    System.out.print(nums[i]);
//    if (i < fib - 1) {
//      System.out.print(", ");
//    }
//  }
//        System.out.println();
//        System.out.println("Сумма чисел Фиббоначи: " + sum);
//}
// c методом iterate
//    int fib = 11;
//    int[] nums = new int[fib];
//    nums[1] = 1;
//    for (int i = 2; i < fib; i++) {
//      nums[i] = nums[i-1] + nums[i-2];
//    }
//    int sum = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
//        .limit(fib)
//        .map(x -> x[0])
//        .mapToInt(Integer::intValue)
//        .sum();
//    System.out.println("11 первых чисел Фиббоначи: " + Arrays.toString(nums));
//    System.out.println("Сумма чисел Фиббоначи: " + sum);
//  }
  // (5)//Реализуй программу, который поменяет ключи и значения в HashMap местами с помощью Stream
//  На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
//    Map<Integer, String> map = new HashMap<>();
//    map.put(1, "One");
//    map.put(2, "Two");
//    map.put(3, "Three");
//    map.forEach((k, v) -> System.out.println(k + ": " + v));
//    Map<String, Integer> map2 = map.entrySet().stream()
//        .collect(Collectors.toMap(
//            Map.Entry::getValue,
//            Map.Entry::getKey,
//            (v1, v2) -> v1
//        ));
//    map2.forEach((k, v) -> System.out.println(k + ": " + v));
//  }
//  }
}
