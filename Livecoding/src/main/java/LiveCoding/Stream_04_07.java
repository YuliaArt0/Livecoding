package LiveCoding;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Stream_04_07 {

  public static void main(String[] args) {
//// Провалидировать скобочную комбинацию
//    String str = "([{}])";
//    System.out.println(task(str));
//  }
//  public static boolean task(String str) {
//    int a = 0;
//    int b = 0;
//    int c = 0;
//    char[] arr = str.toCharArray();
//    if (arr.length % 2 != 0) {
//      return false;
//    }
//    for (int i = 0; i < arr.length; i++) {
//      if (arr[i] == '(') {
//        a++;
//      } else if (arr[i] == ')') {
//        a--;
//      } else if (arr[i] == '[') {
//        b++;
//      } else if (arr[i] == ']') {
//        b--;
//      } else if (arr[i] == '{') {
//        c++;
//      } else if (arr[i] == '}') {
//        c--;
//      }
//    }
//    return a == 0 && b == 0 && c == 0;
//  }
//    String str = "([{}])";
//    System.out.println(task(str));
//  }
// // Провалидировать скобочную комбинацию 2
////  String str = "([{}])";
//    public static boolean task(String str) {
//    String open = "({[";
//    String close = ")}]";
//    Stack<Character> stack = new Stack<>();
//    for (char c : str.toCharArray()) {
//      if (open.indexOf(c) != -1) {
//        stack.push(c);
//      } else if (close.indexOf(c) != - 1) {
//        if (stack.isEmpty() || open.indexOf(stack.pop()) != close.indexOf(c)) {
//          return false;
//        }
//
//      }
//    }
//    return stack.isEmpty();
//  }
// Провалидировать скобочную комбинацию switch case
//    String str = "([{}])";
//    String str = "([{}])";
//    System.out.println(isValid(str));
//  }
//
//  public static boolean isValid(String str) {
//    int a = 0;
//    int b = 0;
//    int c = 0;
//    for (int i = 0; i < str.length(); i++) {
//      switch (str.charAt(i)) {
//        case ('('):
//          a++;
//          break;
//        case (')'):
//          a--;
//          break;
//        case ('['):
//          b++;
//          break;
//        case (']'):
//          b--;
//          break;
//        case ('{'):
//          c++;
//          break;
//        case ('}'):
//          c--;
//          break;
//        default:
//          System.out.println("Не скобка");
//      }
//      if (a < 0 || b < 0 || c < 0) {
//        return false;
//      }
//    }
//    return a == 0 && b == 0 && c == 0;
//  }
//  На вход получаем некий JSON в котором есть
//  4 поля: name, is, eg, balance, нужно написать программу,
//  чтобы проверить только одно поле, что оно например false
//  нужно написать программу, которая считает JSON,
//  что мы физически создадим у себя на компе в директории рядом
//  с классом, который ты будешь реализовывать и надо сделать так,
//  чтобы с помощью регулярных выражений, оно нашло этот файл,
//  чтобы оно провалидировала всё и вывело только одну строку, вторую
//    не решили

// Написать метод, который принимает на вход строку
// и ищет в ней самую длинную подстроку, состоящую из одинаковых символов.
// Если таких подстрок несколько, то искомая подстрока - самая левая.
// Метод возвращает найденную подстроку.
// input: 11225553377755544411
// output: 555
//    String str = "11225553377755544411";
//    System.out.println(task(str));
//  }
//
//  public static String task(String str) {
//    if (str != null || str.isEmpty()) {
//      throw new IllegalArgumentException("Стринг не может быть null");
//    }
//    if (str.length() == 1) {
//      return str;
//    }
//    var chars = str.toCharArray();
//    var map = new LinkedHashMap<Character, Integer>();
//
//    for (var temp : chars) {
//      map.compute(temp, (x, oldValue) -> oldValue == null ? 1 : oldValue + 1);
//    }
//    return map.entrySet().stream()
//        .max(Comparator.comparingInt(Map.Entry::getValue))
//        .map(entry -> {
//          var stringBuilder = new StringBuilder();
//          var tempSecond = entry.getKey();
//          stringBuilder.append(
//              String.valueOf(tempSecond).repeat(Math.max(0, entry.getValue()))
//          );
//          return stringBuilder.toString();
//        }).orElseThrow(IllegalArgumentException::new);
//  } это сомнительное решение
// А теперь рабочий вариант
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
      if (temp.length() > max.length()) max = temp;
    }
    System.out.println(max);
  }
}
