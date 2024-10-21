package Training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Progon {

  public static void main(String[] args) {
    //  (1) //Реализовать метод, который будет возвращать количество передаваемого символа в слове.
    //  Пример: countCharWord('s', "Sports") = 2
//    String str = "Sports";
//    System.out.println(countChars('s', str));
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
//}
//  (2) //Напиши функцию проверки валидности открытия/закрытия скобок - с помощью Стека. Пример: System.out.println(validate("([{}])"); Результат: true

    String scobs = "([{}])";
    System.out.println(isValid(scobs));
  }

  public static boolean isValid(String str) {
    if (str == null) {
      return false;
    }
    int skobsOne = 0;
    int skobsTwo = 0;
    int skobsThri = 0;
    for (char temp : str.toCharArray()) {
      switch (temp) {
        case '(':
          skobsOne++;
          break;
        case ')':
          skobsOne--;
          break;
        case '[':
          skobsTwo++;
          break;
        case ']':
          skobsTwo--;
          break;
        case '{':
          skobsThri++;
          break;
        case '}':
          skobsThri--;
          break;
      }
//      if (skobsOne < 0 || skobsTwo < 0 || skobsThri < 0) {
//        return false;
//      }
    }
    return skobsOne == 0 && skobsTwo == 0 && skobsThri == 0;
  }
//  (3) //Удалить дубликаты из сортированного списка с помощью коллекций. int[] sorted List = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10}
//  (4) //Удалить дубликаты из сортированного списка с помощью stream. int[] sorted List = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10}
//  (5) // Посчитать сумму ключей и значений в HashMap: Map<Integer>, List<Integer>
// Тут надо сложить все ключи и сложить все инты во всех списках, а затем сложить сумму ключей и значений

  // Пример использования
//    Map<Integer, List<Integer>> map = new HashMap<>();
//    map.put(1, List.of(1, 2, 3));
//    map.put(2, List.of(4, 5));
//    map.put(3, List.of(6, 7, 8, 9));
//
//    int result = sumKeysAndValues(map);
//    System.out.println("Сумма ключей и значений: " + result);  // Вывод: 55
//  }
//  public static int sumKeysAndValues(Map<Integer, List<Integer>> map) {
//    int sumKeys = 0;
//    int sumValues = 0;
//    // Суммируем ключи
//    for (int key : map.keySet()) {
//      sumKeys += key;
//    }
//    // Суммируем значения (все целые числа во всех списках)
//    for (List<Integer> values : map.values()) {
//      for (int value : values) {
//        sumValues += value;
//      }
//    }
//    // Возвращаем сумму ключей и значений
//    return sumKeys + sumValues;
//  }
//  (6) //напиши программу является ли аннаграммой одно другому стол , стул - false

//    String str1 = "стол";
//    String str2 = "стул";
//
//    boolean result = isAnagram(str1, str2);
//    System.out.println(result);  // Вывод: false
//  }
//
//  public static boolean isAnagram(String str1, String str2) {
//    // Удаляем пробелы и приводим строки к нижнему регистру
//    str1 = str1.replaceAll("\\s", "").toLowerCase();
//    str2 = str2.replaceAll("\\s", "").toLowerCase();
//
//    // Проверяем, имеют ли строки одинаковую длину
//    if (str1.length() != str2.length()) {
//      return false;
//    }
//
//    /
}