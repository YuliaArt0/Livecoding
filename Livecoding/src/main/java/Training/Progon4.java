package Training;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Progon4 {

  public static void main(String[] args) {
// Посчитать сумму ключей и значений в HashMap:
// Map<Integer, List<Integer>>
// Тут надо сложить все ключи и сложить все инты во всех списках,
// а затем сложить сумму ключей и значений
  Map<Integer, List<Integer>> map = new HashMap<>();
  map.put(1, List.of(1, 2, 3));
  map.put(2, List.of(4, 5));
  map.put(3, List.of(6, 7, 8));
  int result = sumKeysAndValue(map);
    System.out.println("Сумма ключей и значений: " + result);
  }
  public static int sumKeysAndValue(Map<Integer, List<Integer>> map) {
    int sumKeys = 0;
    int sumValues = 0;
    for (int key : map.keySet()) {
      sumKeys += key;
    }
    for (List<Integer> values : map.values()) {
      for (int value : values) {
        sumValues += value;
      }
    }
    return sumKeys + sumValues;
  }
}

