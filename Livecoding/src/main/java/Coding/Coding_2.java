package Coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Coding_2 {

  public static void main(String[] args) {
    // Сделай мне лист int значений и добавь туда 5 отрицательных чисел
//    List<Integer> list = List.of(-1, -2, -3, -4);
//    List<Integer> list2 = list.stream()
//        .map(Math::abs)
//        .toList();
//    System.out.println(list2);
//  }
    // Лист имен, вывести имена на определенную букву
//    List<String> list = List.of("Никита", "Юрий", "Света", "Настя", "Юля");
//    List<String> list2 = list.stream()
//        .filter(x -> x.startsWith("Ю"))
//        .toList();
//    System.out.println(list2);

    // Перевернуть слово "Hello"
//   String str = "Hello!";
//   int length = str.length();
//   char[] chars = new char[length];
//   int counter = 0;
//   for (int i = length - 1; i >= 0; i--) {
//     char temp = str.charAt(i);
//     chars[counter++] = temp;
//   }
//    System.out.println(chars);
    // удалить дубликаты из массива int[] sortedList = {1, 11, 1, 3, 3, 1};
    // с помощью коллекций
//    List<Integer> list = List.of(1, 11, 1, 3, 3, 1);
//    List<Integer> list2 = list.stream()
//        .distinct()
//        .toList();
//    System.out.println(list2);

    // с помощью мапы int[] sortedList = {1, 11, 1, 3, 3, 1};
//    int[] sortedList = {1, 11, 1, 3, 3, 1};
//    Set<Integer> set = new HashSet<>();
//    for (int element : sortedList) {
//      set.add(element);
//    }
//    System.out.println(set);

    // посчитать сколько в этой строке встречается символов "Hello world!" (как с упади семь р
    String str = "Hello world!";
    char[] chars = str.toCharArray();
    Set<Character> set = new HashSet<>();
    for (char temp : chars) {
      set.add(temp);
    }
    System.out.println(set);
    System.out.println(set.size());

    // сделай переменную int a = 315 int b = 517; Поменять местами значения
    // в переменных, но есть важное условие
    // в эти переменные нельзя добавить новые переменные, стримы и прочее использоваться нельзя
    // только операции умножения и деления
//    int a = 315;
//    int b = 517;
//    a = a + b;
//    b = a - b;
//    a = a - b;
//    System.out.println(a);
//    System.out.println(b);
  }
}
