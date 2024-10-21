package LiveCoding;

import java.util.List;
import java.util.stream.Stream;

public class Stream_07_08 {

  public static void main(String[] args) {
//    10, 15, 22, 5, 13
//   найти минимальное число
//    Stream<Integer> nums = Stream.of(10, 15, 22, 5, 13);
//    int min = nums.min(Integer::compare).get();
//    System.out.println("Минимальное число: " + min);
//   найти максимальное число
//  Stream<Integer> nums2 = Stream.of(10, 15, 22, 5, 13);
//  int max = nums2.max(Integer::compare).get();
//    System.out.println("Максимальное число: " + max);
//    Отсортируй в порядке возрастания 10, 15, 22, 5, 13
//    Stream<Integer> nums = Stream.of(10, 15, 22, 5, 13);
//    nums.sorted()
//        .map(x -> x + " ")
//        .forEach(System.out::print);
//  }
//      Stream<Integer> nums3 = Stream.of(10, 15, 22, 5, 13);
//      nums3.sorted()
//          .map(x -> x + " ")
//          .forEach(System.out::print);
//    Написать программу, есть стринговый лист фамилий, нужно пройтись по списку,
//    вытащить фамилии, которые начинаются на А и поместить их
//    в другой список для дальнейшей работы с ними
//    List<String> list = List.of("Алексеев", "Колесников", "Артемкина", "Бедняков", "Андреев");
//    List<String> list2 = list.stream()
//        .filter(x -> x.startsWith("А"))
//        .collect(Collectors.toList());
//    System.out.println(list2);
//  }
//    List<String> list = List.of("Алексеев", "Колесников", "Артемкина", "Бедняков", "Андреев");
//    List<String> list1 = list.stream()
//        .filter(x -> x.startsWith("А"))
//        .toList();
//    System.out.println(list1);
//  }
//  Большой лист создать с теме же данными
//    List<String> list = new ArrayList<>();
//    list.add("Алексеев");
//    list.add("Колесников");
//    list.add("Артемкина");
//    list.add("Бедняков");
//    list.add("Андреев");
//    List<String> result = list.stream()
//        .filter(x -> x.startsWith("А"))
//        .collect(Collectors.toList());
//    System.out.println(result);
//  }
// 1, 2, 3, 4, 5, 11 Collection, найди сумму нечетных чисел в этой коллекции
//  int sum = Stream.of(1, 2, 3, 4, 5, 11)
//      .filter(x -> x%2 !=0)
//      .reduce(Integer::sum)
//      .get();
//    System.out.println("Сумма нечетных чисел: " + sum);
//  }

//  int sum = Stream.of(1, 2, 3, 4, 5, 11)
//      .filter(x -> x%2 !=0)
//      .mapToInt(x -> x)
//      .sum();
//    System.out.println("Сумма нечетных чисел: " + sum);
//  }
// Чтобы четные посчитать делаем так
//    int sum = Stream.of(1, 2, 3, 4, 5, 11)
//        .filter(x -> x%2 ==0)
//        .reduce(Integer::sum)
//        .get();
//    System.out.println("Сумма четных чисел: " + sum);
//  }
//  Напиши коллекцию из 7 чисел, любых
//  4, 10, 6, 18, 3, 1, 8 нужно вывести в консоль число 7
//    Stream<Integer> nums = Stream.of(4, 10, 6, 18, 3, 1, 8);
//    System.out.println(nums.count());
//    }
//    Четные умножить на 100 нечетные вычесть 100
    List<Integer> list = List.of(1, 2, 3, 4, 5);
    List<Integer> list2 = list.stream()
        .map(x -> x % 2 == 0 ? x * 100 : x - 100)
        .toList();
    System.out.println(list);
    System.out.println(list2);
  }
}
