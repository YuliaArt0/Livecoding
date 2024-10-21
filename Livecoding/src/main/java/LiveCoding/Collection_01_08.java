package LiveCoding;

import java.util.Scanner;

public class Collection_01_08 {

  public static void main(String[] args) {
//    На вход поступает HashMap<Integer, String>, вернуть HashMap<String, Integer>
//    HashMap<Integer, String> map = new HashMap<>();
//    map.put(1, "Moscow");
//    map.put(2, "Saint Petersburg");
//    map.put(3, "Vladivostok");
//    System.out.println(map);
//    HashMap<String, Integer> map2 = new HashMap<>();
//    for (Map.Entry<Integer, String> e : map.entrySet()){
//      map2.put(e.getValue(), e.getKey());
//    }
//    System.out.println(map2);
//  }
//  Так же стримом
//    Map<Integer, String> map = new HashMap<>();
//    map.put(1, "Moscow");
//    map.put(2, "Saint Petersburg");
//    map.put(3, "Vladivostok");
//    map.forEach((k, v) -> System.out.println(k + ": " + v));
//    Map<String, Integer> map2 = map.entrySet().stream()
//        .collect(Collectors.toMap(
//            Map.Entry::getValue,
//            Map.Entry::getKey,
//            (v1, v2) -> v1));
//    map2.forEach((k, v) -> System.out.println(k + ": " + v));
////    Этот способ чтобы избежать коллизию
//  }

//  Реализуй метод, который на вход примет ArrayList строк
//  и удаляет из него все дубликаты, не используя метод contains ()
//    ArrayList<String> list = new ArrayList<>();
//    list.add("Russia");
//    list.add("Spain");
//    list.add("Italia");
//    list.add("Spain");
//    list.add("Rome");
//    System.out.println("Первый список: " + list);
//
//    Set<String> list2 = new HashSet<>();
//      for (String s : list){
//        list2.add(s);
//      }
//    System.out.println("Второй список: " + list2);
//  }
//  Ещё вариант с set только другой метод вызываем .addAll()
//    ArrayList<String> list = new ArrayList<>();
//    list.add("Russia");
//    list.add("Italia");
//    list.add("Italia");
//    list.add("Roma");
//    list.add("Spain");
//    Set<String> list2 = new HashSet<>();
//    list2.addAll(list);
//    System.out.println(list2);
//  }
//  Нужно посчитать сумму ключей и значений в hashmap
//    Map<Integer, Integer> map = new HashMap<>();
//    map.put(1, 1);
//    map.put(2, 4);
//    map.put(3, 2);
//    map.put(4, 3);
//    map.put(5, 6);
//    int sum = 0;
//    for (Map.Entry<Integer, Integer> entry : map.entrySet()){
//      sum += entry.getKey() + entry.getValue();
//    }
//    System.out.println(sum);
//  }

//  Нужно посчитать сумму ключей и значений в hashmap с var вариантом
//    var map = Map.of(
//        1, List.of(1, 2, 3, 4, 5),
//        2, List.of(1, 2, 3, 4, 5)
//    );
//    var sum = map.entrySet().stream()
//        .mapToInt(entry -> entry.getKey() + entry.getValue().stream()
//            .mapToInt(Integer::intValue).sum())
//        .sum();
//    System.out.println(sum);
//  }
//  Создать int массив выведи уникальные значения с помощью коллекций и с помощью стримов
// С помощью коллекций
//    int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    Set<Integer> set = new HashSet<>();
//    for (int element : sortedList){
//      set.add(element);
//    }
////    Ещё есть вариант вывести числа до сортировки
////    System.out.println(Arrays.toString(sortedList));
//    System.out.println(set);
//  }
//  Создать int массив выведи уникальные значения с помощью стримов
//    List<Integer> list = List.of(1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10);
//    List<Integer> list2 = list.stream()
//        .distinct()
//        .toList();
//    System.out.println(list2);
//  }

//  Факториал 5 с помощью сканнера с исключениями, если вводим -5, не принимать
//  выводить что нет факториала, если вводим 0, то выводить факториал 1,
//  потому что для 0 факториал 1
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int number = scanner.nextInt();
    scanner.close();
    long result;
    if (number < 0) {
      System.out.println("Неверное число");
    } else {
      result = getFactorial(number);
      System.out.println(String.format("Факториал для %d равен %d", number, result));
    }
  }

  public static long getFactorial(int number) {
    long result = 1;
    for (int i = 1; i <= number; i++) {
      result += i;
    }
    return result;
  }
}
