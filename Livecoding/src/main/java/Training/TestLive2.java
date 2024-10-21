package Training;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestLive2 {

  public static void main(String[] args) {
    /**
     * Написать метод, который принимает на вход строку и ищет в ней самую длинную подстроку,
     * состоящую из одинаковых символов.
     * Если таких подстрок несколько, то искомая подстрока - самая левая.
     * Метод возвращает найденную подстроку.
     * input: 11225553377755544411
     * output: 555
     * input: 155559999977441111330000000000009
     * output: 000000000000
     */
    var str = "11223377755544411";
    System.out.println(longSubstring(str));
  }
  public static String longSubstring(String str) {
    if (str == null || str.isEmpty()) {
      throw new IllegalArgumentException("strNull");
    }
    if (str.length() == 1) {
      return str;
    }
    var chars = str.toCharArray();
    var map = new LinkedHashMap<Character, Integer>();

    for (var temp : chars) {
      map.compute(temp, ($, old) -> old == null ? 1 : old + 1);
    }
    return map.entrySet().stream()
        .max(Comparator.comparingInt(Map.Entry::getValue))
        .map(entry -> {
          var stringBuilder = new StringBuilder();
          var current = entry.getKey();
          stringBuilder.append(String.valueOf(current).repeat(Math.max(0, entry.getValue()))
          );
          return stringBuilder.toString();
        }).orElseThrow(IllegalArgumentException::new);
    }
  }
