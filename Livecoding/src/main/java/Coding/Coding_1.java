package Coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Coding_1 {

  public static void main(String[] args) {
    //  Сделай коллекцию Set условно, 1, -5, 7, 8
    //  Перевести все отрицательные в положительные
//    List<Integer> list = List.of(1, -5, 7, 8);
//    List<Integer> list2 = list.stream()
//        .map(Math::abs)
//        .toList();
//    System.out.println(list2);
//  }

    // Напиши программу, четные числа * на 100 от нечетных отнять 100
//    List<Integer> list = List.of(1, 2, 3, 4, 5);
//    List<Integer> list2 = list.stream()
//        .map(x -> x % 2 == 0 ? x * 100 : x - 100)
//        .toList();
//    System.out.println(list);
//    System.out.println(list2);
//  }

//  Только четные умножить на 100
//    List<Integer> list = List.of(1, 2, 3, 4, 5);
//    List<Integer> list2 = list.stream()
//        .filter(x -> x % 2 == 0)
//        .map(x -> x * 100)
//        .toList();
//    System.out.println(list2);
//  }

    // Коллекцию имен создать и вывести на букву

//    List<String> list = List.of("Глеб", "Артем", "Владимир", "Андрей");
//    List<String> list2 = list.stream()
//        .filter(x -> x.startsWith("А"))
//        .toList();
//    System.out.println(list2);
//  }

// Есть строка, нужно изменить расположение символов в строке, без функции реверс
//    String str = "I am a tester";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for (int i = length-1; i>= 0; i--) {
//      char temp = str.charAt(i);
//      chars[counter++] = temp;
//    }
//    System.out.println(chars);
//  }
//  String str = "I am a tester";
//
//  List<Character> list = new ArrayList<>();
//  for (char c : str.toCharArray()) {
//    list.add(c);
//    }
//    Collections.reverse(list);
//    System.out.println(list);
//
//    StringBuilder builder = new StringBuilder(list.size());
//    for (Character c : list) {
//      builder.append(c);
//    }
//    System.out.println(builder); // собрали вместе
//  }

  }
}
