package LiveCoding;

import static java.util.Collections.max;
import static java.util.Collections.min;

import java.util.HashMap;
import java.util.Map;

public class Stream_Collection_16_08 {

  public static void main(String[] args) {
    // Вывести минимальное число 45, 15, 24, 12, 95
//    Stream<Integer> nums = Stream.of(45, 15, 24, 12, 95);
//    int min = nums.min(Integer::compare).get();
//    System.out.println("Минимальное число: " + min);
//  }

    // Вывести максимальное число 45, 15, 24, 12, 95
//    Stream<Integer> nums1 = Stream.of(45, 15, 24, 12, 95);
//    int max = nums1.max(Integer::compare).get();
//    System.out.println("Максимальное число: " + max);
//  }
    // Вывести одновременно и минимальное и максимальное число
    // 45, 15, 24, 12, 95 с помощью функционального интерфейса
    //   ????? не решили

    // Отсортируй от маленького к большому 45, 15, 24, 12, 95
//    Stream<Integer> nums2 = Stream.of(45, 15, 24, 12, 95);
//    nums2.sorted()
//        .map(x -> x + " ")  //нужно преобразовать данные из одного типа в другой
//// добавили пробел между условиями
//        .forEach(System.out::print);
//  }
//  Посчитай количество, пусть в консоль выведется 5
//    Stream<Integer> nums3 = Stream.of(45, 15, 24, 12, 95);
//    System.out.println(nums3.count());
//  }
//  Найти сумму четных и сумму нечетных чисел 5, 7, 3, 6, 2
//    int sum = Stream.of(5, 7, 3, 6, 2)
//        .filter(x -> x % 2 != 0) //отфильтровать чтобы знала программа где четные где нечетные
//        .reduce(Integer::sum)
//        .get();
//    System.out.println("Сумма нечетных чисел = " + sum);
//  }
    //  (2) Найти сумму четных и сумму нечетных чисел 5, 7, 3, 6, 2
//    int sum = Stream.of(5, 7, 3, 6, 2)
//        .filter(x -> x % 2 != 0) //отфильтровать чтобы знала программа где четные где нечетные
//        .mapToInt(x -> x)
//        .sum();
//    System.out.println("Сумма нечетных чисел = " + sum);
//  }

//  Collection
//  На вход поступает HashMap<Integer, String>
//  вернуть HashMap<String, Integer>
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "One");
    map.put(2, "Two");
    map.put(3, "Three");
    map.put(4, "Four");
    System.out.println(map);
    HashMap<String, Integer> map2 = new HashMap<>();
    map2 = map2;
// entrySet в мапу кладешь комбинацию ключа и значения из entrySet можешь вызвать get Kie и get Value
    for (Map.Entry<Integer, String> changeMap : map.entrySet()) {
      map2.put(changeMap.getValue(), changeMap.getKey());
    }
    System.out.println(map2);
  }
}
