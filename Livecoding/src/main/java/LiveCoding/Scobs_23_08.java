package LiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Scobs_23_08 {

  public static void main(String[] args) {
// Раз, два, три развернуть строку двумя способами, первый с 1 массивом, а второй любой,
// только без стринг билдера
//    String str = "Раз, два, три";
//    char[] chars = str.toCharArray();
//    System.out.println(chars);
//    int start = 0;
//    int end = chars.length - 1;
//// инициализируем 2 переменных, одна будет обозначать первый индекс массива
//// вторая второй индекс массива или 2 счетчика
//    for (; start <= end; start++, end--) {
//      char temp = chars[start];
//      chars[start] = chars[end];
//      chars[end] = temp;
//    }
//    System.out.println(chars);
//  }

// Второй способ, через 2 массива, не нравится Диме
//    String str = "Раз, два, три";
//    char[] chars = str.toCharArray();
//    System.out.println(chars);
//    int length = chars.length;
//    int count = 0;
//    char[] newChars = new char[length];
//    for (int i = length - 1; i >= 0; i--) {
//      newChars[count] = chars[i];
//      count++;
//    }
//    System.out.println(newChars);
//  }
//// Третий апендовское решение
//    String str = "Раз, два, три";
//    System.out.println(str);
//    StringBuilder newStr = new StringBuilder();
//    for (int i = str.length() - 1; i >= 0; i--) {
//      newStr.append(str.charAt(i));
//    }
//    System.out.println(newStr);
//  }
//вариант Димы
//    String str = "Раз, два, три";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for (int i = length - 1; i >= 0; i--) {
//      char temp = str.charAt(i);
//      chars[counter++] = temp;
//    }
//    System.out.println(chars);
//  }

//  //    Реализовать метод, который будет возвращать количество передаваемого символа в слове.
////    Пример: countCharAtWord('a', "Aligator") = 2

//    String str = "Aligator";
//    char a = 'a';
//    System.out.println(method(str, a));
//  }
//    public static int method(String str, char a) {
//
//      int counter = 0;
//      for (int i = 0; i < str.length(); i++) {
//        if (Character.toLowerCase(str.charAt(i))== Character.toLowerCase(a)){
//          counter++;
//        }
//      }
//      return counter;
//    }
//    Тоже самое, но без использования класса Character
// Нужно массив символов сделать, завести счетчик интовый, сделать char массива
//    String str = "Aligator";
//    char a = 'a';
//    System.out.println(method(str, a));
//  }
//  public static int method(String str, char a) {
//    char[] chars = str.toLowerCase().toCharArray();
//    int counter = 0;
//    for (int i = 0; i < chars.length; i++) {
//      if (chars[i] == a){
//        counter++;
//      }
//    }
//    return counter;
//  }

// Реализовать метод, который будет возвращать количество передаваемого символа в слове.
// Пример: countCharAtWord('a', "Aligator") = 2 через Character
//    String str = "Aligator";
//    char a = 'a';
//    System.out.println(countChars(str, a));
//  }
//  public static int countChars(String str, char a) {
//    int counter = 0;
//    for (int i = 0; i < str.length(); i++) {
//      if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(a)) {
//        counter++;
//      }
//    }
//    return counter;
//  }
//    Тоже самое, но без использования класса Character
// Нужно массив символов сделать, завести счетчик интовый, сделать char массива
//    String str = "Aligator";
//    char a = 'a';
//    System.out.println(countChar(str, a));
//  }
//  public static int countChar(String str, char a) {
//    char[] chars = str.toLowerCase().toCharArray();
//    int counter = 0;
//    for (int i = 0; i < chars.length; i++) {
//      if (chars[i] == a) {
//        counter++;
//      }
//    }
//    return counter;
//  }
//   String str = "Aligator";
//   char a = 'a';
//    System.out.println(countChars(str, a));
//  }
//  public static int countChars(String str, char a) {
//    int counter = 0;
//    for (int i = 0; i < str.length(); i++) {
//      if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(a)) {
//        counter++;
//      }
//    }
//    return counter;
//  }

//  Скобочная последовательность Пример: System.out.println(validate("([{}])"
//  Способ 1 c помощью стека
//    String str = "([{}])";
//    System.out.println(isValid(str));
//  }
//
//  public static boolean isValid(String str) {
//    Map<Character, Character> valid = Map.of(')', '(', ']', '[', '}', '{');
//    Stack<Character> newStack = new Stack<>();
//
//    for (Character s : str.toCharArray()) {
//      if (valid.containsValue(s)) {
//        newStack.add(s);
//      } else if (valid.containsKey(s)) {
//        if (newStack.isEmpty() || newStack.pop() != valid.get(s)) {
//          return false;
//        }
//      }
//    }
//    return newStack.isEmpty();
//  }

//  Скобочная последовательность через switch case
    String str = "([{}])";
    System.out.println(isValid(str));
  }

  public static boolean isValid(String str) {
    if (str == null) {
      return false;
    }
    int a = 0;
    int b = 0;
    int c = 0;
    for (char temp : str.toCharArray()) {
      switch (temp) {
        case '(':
          a++;
          break;
        case ')':
          a--;
          break;
        case '[':
          b++;
          break;
        case ']':
          b--;
          break;
        case '{':
          c++;
          break;
        case '}':
          c--;
          break;
      }
    }
    return a == 0 && b == 0 && c == 0;
  }

  //  Перевернутая строка вариант 4
//  String str = "I love Java";
//  char[] chars = str.toCharArray();
//  int countFirst = 0;
//  int countSecond = chars.length - 1;
//  // пока счетчики не сравняются, менять через темповую переменную
//  while(countFirst < countSecond) {
//    char temp = chars[countFirst];
//    chars[countFirst] = chars[countSecond];
//    chars[countSecond] = temp;
//    countFirst++;
//    countSecond--;
//  }
//    System.o
}