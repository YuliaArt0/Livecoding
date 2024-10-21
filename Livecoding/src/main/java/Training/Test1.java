package Training;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Test1 {

  //  5, 6, 10, 67, 8, 4, 3 Вывести максимальное значение
  public static void main(String[] args) {
//  Stream<Integer> nums = Stream.of(5, 6, 10, 67, 8, 4, 3);
//  int max = nums.max(Integer::compare).get();
//  System.out.println("Максимальное значение: " + max);
//}
//  Посчитай количество, пусть в консоль выведется 7
//  Stream<Integer> nums = Stream.of(5, 6, 10, 67, 8, 4, 3);
//  System.out.println(nums.count());
//}
//  Найди сумму нечетных чисел в этой коллекции 5, 6, 10, 67, 8, 4, 3
//  int sum = Stream.of(5, 6, 10, 67, 8, 4, 3)
//      .filter(x -> x % 2 != 0)
//      .reduce(Integer::sum)
//      .get();
//  System.out.println("Сумма нечетных чисел: " + sum);
//}
//  Напиши программу, которая четные числа * 100, а от нечетных - 100
//  List<Integer> list = List.of(1, 2, 3, 4, 5);
//  List<Integer> list2 = list.stream()
//      .map(x -> x % 2 == 0 ? x * 100 : x - 100)
//      .toList();
//  System.out.println(list);
//  System.out.println(list2);
//}
// Сделай коллекцию с одним отрицательным числом и пусть все в конце будут положительные
// Чтобы преобразовала программа все отрицательные и в положительные
//    List<Integer> list = List.of(1, 2, 3, -4, 5);
//    List<Integer> list2 = list.stream()
//        .map(Math::abs)
//        .toList();
//    System.out.println(list2);
//  }
// Создай лист стринговых имен и выведи все, которые начинаются на Б например
//  Пять имен и три из них на Б начинаться
//    List<String> list = List.of("Boris", "Anrey", "Bogdan", "Yuriy");
//    List<String> list2 = list.stream()
//        .filter(x -> x.startsWith("B"))
//        .toList();
//    System.out.println(list2);
//  }

//  Удалить дубликаты из сортированного списка с помощью коллекций
//  int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10);
//    List<Integer> list2 = list.stream()
//        .distinct()
//        .toList();
//    System.out.println(list2);
//  }

// Напиши программу, которая на вход примет ArrayList строк и
// удаляет из него все дубликаты, не используя метод contains()
//    ArrayList<String> list = new ArrayList<>();
//    list.add("Russia");
//    list.add("Italia");
//    list.add("Russia");
//    list.add("Spain");
//    System.out.println("Первый список: " + list);
//
//    Set<String> list2 = new HashSet<>();
//    for (String s : list) {
//    list2.add(s);
//    }
//    System.out.println("Второй список: " + list2);
//  }
//      Посчитать сумму ключей и значений в hashmap, в произвольном hashmap
//    Map<Integer, Integer> map = new HashMap<>();
//    Map<Integer, Integer> map = new HashMap<>();
//    map.put(1, 1);
//    map.put(2, 3);
//    map.put(3, 2);
//    map.put(4, 4);
//    int sum = 0;
//    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//    sum += entry.getKey() + entry.getValue();
//    }
//    System.out.println(sum);
//  }

// Придумай любую строку, чтобы было три слова,
// и нужно развернуть готовым методом reverse 2 способами
//  С помощью стринг билдер
//    String str = "I love java";
//    System.out.println(revers(str));
//  }
//  public static String revers(String str) {
//    return new StringBuilder(str).reverse().toString();
//  }
// С помощью цикла
//    String str = "I love java";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for (int i = length-1; i > 0; i--) {
//    char temp = str.charAt(i);
//    chars[counter++] = temp;
//    }
//    System.out.println(chars);
//  }

// Выбери любое слово, где заглавная буква верхнего регистра и нижний регистр будет совпадать
// т.е. чтобы было две буквы, но одна в верхнем регистре, одна в нижнем
// Напиши программу, которая посчитает количество букв А в этом слове, внезависимости от регистра
// String str = "Alligator";
//    String str = "Artemkina";
//    System.out.println(countChars('A', "Artemkina"));
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
//  Посчитать сколько раз повторяется слово, с помощью hash map
// "Упади семь раз и восемь раз поднимись";
   String str = "Упади семь раз и восемь раз поднимись";
    String[] arr = str.split(" ");
    HashMap<String, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (hashMap.containsKey(arr[i])) {
        int counter = hashMap.get(arr[i]);
        hashMap.put(arr[i], counter + 1);
      } else {
        hashMap.put(arr[i], 1);
      }
    }
    System.out.println(hashMap);
  }
}