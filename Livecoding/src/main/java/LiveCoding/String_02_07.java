package LiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class String_02_07 {

  public static void main(String[] args) {
    // Разворот строки
    // чтобы был только один массив
//    String str = "I am a tester";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for (int i = length - 1; i >= 0; i--) {
//      char temp = str.charAt(i);
//      chars[counter++] = temp;
//    }
//    System.out.println(chars);
//  }
//    String str = "I am a tester";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for (int i = length - 1; i >= 0; i--) {
//      char temp = str.charAt(i);
//      chars[counter++] = temp;
//    }
//    System.out.println(chars);
//  }
    // Разворот строки с помощью stringbuilder
//    String str = "I am a tester";
//    System.out.println(revers(str));
//  }
//    public static String revers(String str) {
//    return new StringBuilder(str).reverse().toString();
//  }
//    String str = "I am a tester";
//    System.out.println(reverse(str));
//  }
//  public static String reverse(String str) {
//    return new StringBuilder(str).reverse().toString();
//  }
//  Рекурсивный разворот строки
//    String a = "I am a tester";
//    System.out.println(recursia(a, a.length() - 1));
//  }
//  public static String recursia(String str, int index) {
//    if (index == 0) {
//      return str.charAt(0) + "";
//    }
////  в которую ты будешь ложить индекс, каждый символ сразу к char приводишь
//    char a = str.charAt(index);
//    return a + recursia(str, index - 1);
//  }

// Дели майнер - разделитель
//  Напиши любую строку, нужно вывести три раза эту строку с разделителем
//    String str = "I am a tester";
//    StringBuilder stringBuilder = new StringBuilder();
//    String del = "\n";
//    int n = 3;
//    for (int i = 0; i < n; i++) {
//      stringBuilder.append(str);
//        //    Проверяем последняя у нас строчка или нет
//        if (i < n - 1) {
//          stringBuilder.append(del);
//        }
//    }
//    System.out.println(stringBuilder);
//  }
//  Hash map - на вход поступает HashMap<Integer, String>
//  вернуть HashMap<String, Integer>
//    HashMap<Integer, String> map = new HashMap<>();
//    map.put(1, "One");
//    map.put(2, "Two");
//    map.put(3, "Tree");
//    System.out.println(map);
//    HashMap<String, Integer> map2 = new HashMap<>();
//    for (Map.Entry<Integer, String> e : map.entrySet()) {
//      map2.put(e.getValue(), e.getKey());
//    }
//    System.out.println(map2);
//  }
    //  Hash map - на вход поступает HashMap<Integer, String>
//  вернуть HashMap<String, Integer> с помощью stream
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "String");
    map.put(2, "Collection");
    map.put(3, "Stream");
    System.out.println();
    Map<String, Integer> map2 = map.entrySet().stream()
        .collect(Collectors.toMap(
            Map.Entry::getValue,
            Map.Entry::getKey,
            (v1, v2) -> v1));
    map2.forEach((k, v) -> System.out.println(k + ": " + v));
  }
}
