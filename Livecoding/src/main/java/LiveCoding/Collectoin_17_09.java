package LiveCoding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Collectoin_17_09 {

  public static void main(String[] args) {
//    int[] array = {1, 1, 2, 2, 4, 3, 3, 6, 2, 5, 5, 9};
//
//    System.out.println(countsWithNotDublicates(array));
//  }
//  public static HashSet<Integer> countsWithNotDublicates(int[] array) {
//    HashSet<Integer> noDublicates = new HashSet<>();
//    for (int number : array) {
//      noDublicates.add(number);
//    }
//    return noDublicates;
//  }
//  Реализуй программу, который поменяет ключи и значения в HashMap местами
//  На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "ONE");
    map.put(2, "TWO");
    map.put(3, "TREE");
    map.forEach((k, v) -> System.out.println(k + ": " + v));
    Map<String, Integer> map2 = map.entrySet().stream()
        .collect(Collectors.toMap(
            Map.Entry::getValue,
            Map.Entry::getKey,
            (v1, v2) -> v1
        ));
    map2.forEach((k, v) -> System.out.println(k + ": " + v));
  }
}
