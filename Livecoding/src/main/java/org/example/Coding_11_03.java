package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Coding_11_03 {

  public static void main(String[] args) {
      String string = "Упади семь раз и восемь раз поднимись";
      String [] arr = string.split(" ");
      HashMap<String, Integer> hashMap = new HashMap<>();
      for(int i = 0; i< arr.length; i++) {
        if (hashMap.containsKey(arr[i])) {
          int counter = hashMap.get(arr[i]);
          hashMap.put(arr[i], counter+1);
        } else {
          hashMap.put(arr[i], 1);
        }
      }
    System.out.println(hashMap);
   }
   //    System.out.println(getFactorial());
//   }
//
//   private static int getFactorial() {
//     Scanner scanner = new Scanner(System.in);
//     System.out.println("Введите число: ");
//     int a = scanner.nextInt();
//     scanner.close();
//     int result = 1;
//     for(int j = 1; j<=a; j++){
//       result *= j;
//     }
//     return result;
//  List<Integer> list = List.of(1, 2, 3, 4, 5 ,9);
//    System.out.println(list.stream().filter(x -> x%2 != 0).reduce(Integer::sum).get());
//  String string = "I like Java!";
//    System.out.println(deleteSymbol(string));
//    char [] arr = string.toCharArray();
//    int size = arr.length;
//    for (int i = 0; i < size/2; i++) {
//      char tmp = arr[i];
//      arr[i] = arr[size - 1 - i];
//      arr[size -1 - i] = tmp;
//    }
//    System.out.println(arr);
//    StringBuilder sb = new StringBuilder(string);
//    System.out.println(sb.reverse());


//  private static String deleteSymbol (String string) {
//    char[] arr = string.toCharArray();
//    StringBuilder sb = new StringBuilder();
//    for (int i = 0; i< arr.length; i++) {
//      if (arr[i] != '!') {
//        sb.append(arr[i]);
//      }
//    }
//    return new String(sb);
//  }
}
