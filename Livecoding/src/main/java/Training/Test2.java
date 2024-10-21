package Training;

import java.util.Stack;

public class Test2 {

  //  c помощью коллекции Stack скобочная последовательность ([{}])
  public static void main(String[] args) {
//
//  public static boolean isStringCorrect (String str) {
//    char[] arr = str.toCharArray();
//    Stack<Character> stack = new Stack<>();
//    if(arr.length % 2 != 0) {
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
// Написать метод, который принимает на вход строку
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
//      if (symbol == chars[i]) {
//        temp.append(symbol);
//      } else {
//        symbol = chars[i];
//        temp = new StringBuilder();
//        temp.append(symbol);
//      }
//      if (temp.length() > max.length())
//        max = temp;
//    }
//    System.out.println(max);
//  }

//  (2) Написать функцию, которая проверяет, является ли одно слово аннаграммой другого
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
  // Нужно убрать все пробелы Нужно убрать все пробелы «Мы готовимся к интервью»
  String str = "Мы готовимся к интервью";
  String str2 = str.replaceAll("\\s", "");
    System.out.println(str2);
  }
}

