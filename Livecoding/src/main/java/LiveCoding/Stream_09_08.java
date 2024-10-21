package LiveCoding;

import java.util.HashMap;
import java.util.Map;

public class Stream_09_08 {

  public static void main(String[] args) {
//  5, 6, 10, 67, 8, 4, 3 Вывести максимальное значение
//    Stream<Integer> minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
//    int biggest = minValue
//        .max(Integer::compare)
//        .get();
//    System.out.println("Максимальное число = " + biggest );
//  }
//    //  Посчитай количество, пусть в консоль выведется 7
//    Stream<Integer> minValue = Stream.of(5, 6, 10, 67, 8, 4, 3);
//    System.out.println(minValue.count());
//  }
//  Найди сумму нечетных чисел в этой коллекции 5, 6, 10, 67, 8, 4, 3
//    int sum = Stream.of(5, 6, 10, 67, 8, 4, 3)
//        .filter(x -> x % 2 !=0)
//        .reduce(Integer::sum)
//        .get();
//    System.out.println(sum);
//  }
//  Через mapToInt тоже самое
//    int sum = Stream.of(5, 6, 10, 67, 8, 4, 3)
//        .filter(x -> x % 2 != 0)
//        .mapToInt(n -> n)
//        .sum();
//    System.out.println(sum);
//  }
//  Напиши программу, которая четные числа * 100, а от нечетных - 100
//    List<Integer> list = List.of(1, 2, 3, 4, 5);
//    List<Integer> list2 = list.stream().map(x -> x % 2 == 0 ? x * 100 : x - 100).toList();
//    System.out.println(list);
//    System.out.println(list2);
//  }

// Сделай коллекцию с одним отрицательным числом и пусть все в конце будут положительные
// Чтобы преобразовала программа все отрицательные и в положительные
//    List<Integer> list = List.of(1, 2, 3, -4, 5);
//    List<Integer> list2 = list.stream().map(Math::abs).toList();
//    System.out.println(list2);
// }
// Создай лист стринговых имен и выведи все, которые начинаются на Б например
//  Пять имен и три из них на Б начинаться
//    List<String> list = List.of("Борис", "Алексей", "Богдан", "Юрий", "Борислав");
//    List<String> list2 = list.stream()
//        .filter(x -> x.startsWith("Б"))
//        .toList();
//    System.out.println(list2);
//  }
//  Удалить дубликаты из сортированного списка с помощью коллекций
//  int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    Set<Integer> set = new HashSet<>();
//    for (int element : sortedList){
//      set.add(element);
//    }
//    System.out.println(set);
//  }
// Удалить дубликаты из сортированного списка с помощью Stream
// int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10);
//    List<Integer> list2 = list.stream().distinct().toList();
//    System.out.println(list2);
//  }
// Напиши программу, которая на вход примет ArrayList строк и
// удаляет из него все дубликаты, не используя метод contains()
//    ArrayList<String> list = new ArrayList<>();
//      list.add("Russia");
//      list.add("Spain");
//      list.add("Russia");
//      list.add("Italy");
//      list.add("Germany");
//      Set<String> list2 = new HashSet<>(list);
//      list2.addAll(list);
//      System.out.println(list2);
//      }
//      Посчитать сумму ключей и значений в hashmap, в произвольном hashmap
//    Map<Integer, Integer> map = new HashMap<>();
//    map.put(1, 1);
//    map.put(2, 3);
//    map.put(3, 5);
//    map.put(4, 7);
//    map.put(5, 9);
//    int sum = 0;
//    for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//      sum += entry.getKey() + entry.getValue();
//    }
//    System.out.println(sum);
//  }
//  Посчитать сумму ключей и значений в hashmap, c помощью стримов
    Map<Integer, Integer> map = new HashMap<>();
    map.put(1, 1);
    map.put(2, 3);
    map.put(3, 5);
    map.put(4, 7);
    map.put(5, 9);
    int sum = map.entrySet().stream().mapToInt(x -> x.getKey() + x.getValue()).sum();
    System.out.println(sum);
  }
}
