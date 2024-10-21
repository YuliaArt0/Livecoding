package Coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class Test_1 {

  public static void main(String[] args) {
    // Реализовать метод, который будет возвращать количество передаваемого символа в слове.
// Пример: countCharAtWord('a', "Aligator") = 2 через Character
//    String str = "Aligator";
//    System.out.println(countChars('a', str));
//  }
//  public static int countChars(char chars, String str) {
//    int counter = 0;
//    for (int i = 0; i < str.length(); i++) {
//      if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(chars)) {
//        counter++;
//      }
//    }
//    return counter;
//  }

//Напиши функцию проверки валидности открытия/закрытия скобок - с помощью Стека. Пример: System.out.println(validate("([{}])"); Результат: true
//    String str = "([{}])";
//    System.out.println(validate(str));
//  }
//  public static boolean validate(String str) {
//    Stack<Character> stack = new Stack<>();
//    Map<Character, Character> map = new HashMap<>();
//    map.put(')', '(');
//    map.put('}', '{');
//    map.put(']', '[');
//    for (Character temp : str.toCharArray()) {
//      if (map.containsValue(temp)) {
//        stack.push(temp);
//      } else if (stack.isEmpty() || stack.pop() != map.get(temp)) {
//        return false;
//      }
//    }
//    return stack.isEmpty();
//  }

//  (3) //Удалить дубликаты из сортированного списка с помощью коллекций. int[] sorted List = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10}
//    List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10);
//    List<Integer> list2 = list.stream()
//        .distinct()
//        .toList();
//    System.out.println(list2);
//  }
//  (4) //Удалить дубликаты из сортированного списка с помощью stream. int[] sorted List = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10}
//   int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    Set<Integer> set = new HashSet<>();
//    for (int element : sortedList) {
//    set.add(element);
//    }
//    System.out.println(set);
//  }

//  (5) // Посчитать сумму ключей и значений в HashMap: Map<Integer>, List<Integer>
// Тут надо сложить все ключи и сложить все инты во всех списках, а затем сложить сумму ключей и значений
//    Map<Integer, List<Integer>> map = new HashMap<>();
////    map.put(1, List.of(1, 2, 3));
////    map.put(2, List.of(4, 5));
////    map.put(3, List.of(6, 7, 8, 9));
////  }
//
//  (6) //напиши программу является ли аннаграммой одно другому стол , стул - false
    String str1 = "канонада";
    String str2 = "анаконда";
    System.out.println(isAnagram(str1, str2));
  }

  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    var str1Chars = str1.toCharArray();
    Arrays.sort(str1Chars);
    var str2Chars = str2.toCharArray();
    Arrays.sort(str2Chars);
    for (int i = 0; i < str2.length(); i++) {
      if (str1Chars[i] != str2Chars[i]) {
        return false;
      }
    }
    return true;
  }
}
