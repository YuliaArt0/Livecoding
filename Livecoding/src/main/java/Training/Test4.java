package Training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Stream;

public class Test4 {

  public static void main(String[] args) {
//(1)//Напиши функцию проверки валидности открытия/закрытия скобок - с помощью Стека.
// Пример: System.out.println(validate("([{}])"); Результат: true
    String str = "([{}])";
    System.out.println(isString(str));
  }
  public static boolean isString(String str) {
    char[] arr = str.toCharArray();
    Stack<Character> stack = new Stack<>();
    if (arr.length % 2 != 0) {
      return false;
    } else {
      for (char c : arr) {
        if (c == '(' || c == '{' || c == '[') {
          stack.push(c);
        } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
          stack.pop();
        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
          stack.pop();
        } else {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
//    String str = "([{}])";
//    System.out.println(isString(str));
//  }
//  public static boolean isString(String str) {
//    char[] arr = str.toCharArray();
//    Stack<Character> stack = new Stack<>();
//    if (arr.length % 2 != 0) {
//      return false;
//    } else {
//      for (char c : arr) {
//        if (c == '(' || c == '{' || c == '[') {
//          stack.push(c);
//        } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
//          stack.pop();
//        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
//          stack.pop();
//        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
//          stack.pop();
//        } else {
//          return false;
//        }
//      }
//      return stack.isEmpty();
//    }
//  }

// (2) Написать функцию, которая проверяет, является ли одно слово аннаграммой другого
// На вход падается 2 строки. На выходе true или false:
//   "жуткая", "утяжка" - true
//   "канонада", "анаконда" - true
//   "стол", "стул" - false
//    System.out.println(isAnagram("жуткая", "утяжка"));
//    System.out.println(isAnagram("канонада", "анаконда"));
//    System.out.println(isAnagram("стол", "стул"));
//  }
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
//(3) Написать метод, который принимает на вход строку
// и ищет в ней самую длинную подстроку, состоящую из одинаковых символов.
// Если таких подстрок несколько, то искомая подстрока - самая левая.
// Метод возвращает найденную подстроку.
// input: 11225553377755544411
// output: 555
//    String str = "11225553377755544411";
//    StringBuilder max = new StringBuilder();
//    StringBuilder temp = new StringBuilder();
//    char[] chars = str.toCharArray();
//    char symbol = chars[0];
//    for (int i = 0; i < str.length(); i++) {
//    if (symbol == chars[i])  {
//      temp.append(symbol);
//    } else {
//      symbol = chars[i];
//      temp = new StringBuilder();
//      temp.append(symbol);
//    }
//    if (temp.length() > max.length()) max = temp;
//    }
//    System.out.println(max);
//  }

// (4) Вывести первых 11 чисел Фиббоначи включая сумму
//     int fib = 11;
//     int[] nums = new int[fib];
//     nums[1] = 1;
//     for (int i = 2; i < fib; i++) {
//     nums[i] = nums[i-1] + nums[i-2];
//     }
//     int sum = Stream.iterate(new int[] {0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
//         .limit(fib)
//         .map(x -> x[0])
//         .mapToInt(Integer::intValue)
//         .sum();
//    System.out.println("11 первых чисел Фиббоначи: " + Arrays.toString(nums));
//    System.out.println("Сумма чисел Фиббоначи: " + sum);
//  }

// (5) Реализуй программу, который поменяет ключи и значения в HashMap местами с помощью Stream
//  На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
//    Map<Integer, String> map = new HashMap<>();
//    map.put(1, "One");
//    map.put(2, "Two");
//    map.put(3, "Three");
//    System.out.println(map);
//    Map<String, Integer> map2 = new HashMap<>();
//
//    for (Map.Entry<Integer, String> changeMap : map.entrySet()) {
//    map2.put(changeMap.getValue(), changeMap.getKey());
//    }
//    System.out.println(map2);
//  }
}
