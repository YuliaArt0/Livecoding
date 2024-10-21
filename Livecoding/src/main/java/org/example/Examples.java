package org.example;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Examples {

  public static void main(String[] args) {
    String str = "I love books";
    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb.reverse());

//    List<Integer> list = List.of(-10, 85, -6, -3, 8);
//    int max = list.stream().filter(x -> x%2 != 0).reduce(Integer::sum).get();
//    System.out.println(max);
//    List<Integer> list = List.of(-10, 85, -6, -3, 8);
//    int max = list.stream().max(Integer::compare).get();
//    System.out.println(max);
//    List<String> list = List.of("Apple", "Banana", "Avocado", "Grape");
//    list.stream().filter(x -> x.startsWith("A")).collect(Collectors.toList());
  }

//  public static int[] reverseString(int[] arr){
//    int[] arr1 = arr;
//    for(int i = 0; i < arr.length/2; i++){
//      arr1[i] = arr[arr.length-1-i];
//      arr1[arr1.length-1-i] = arr[i];
//    }
//    return arr1;
//  }
//    List<Integer> list = List.of(-10, 85, -6, -3, 8);
//    System.out.println(list.stream().map(Math::abs).collect(Collectors.toList())); - поменять знак с - на +
//    + числа *100 -числа -100
//    System.out.println(list.stream().filter(x -> x%2 == 0).map(x -> x*100).collect(Collectors.toList()));
//    System.out.println(list.stream().filter(x -> x%2 != 0).map(x -> x-100).collect(Collectors.toList()));
//    int [] a = {5, 41, 69, 4, 3};
//    int [] b = a;
//    for(int i = 0; i < a.length/2; i++){
//      b[i] = a[a.length -1 -i];
//      b[b.length -1 -i] = a[i];
//    }
//    System.out.println(Arrays.toString(b)); - перевернуть массив
//    Scanner scanner = new Scanner(System.in);
//    long result = 1;
//    System.out.println("Введите число:");
//    int a = scanner.nextInt();
//    scanner.close();
//    for(int i = 1; i <= a; i++){
//      if (a == 1){
//        break;
//      }
//      else {
//        result = result * i;
//      }
//    }
//    System.out.println(result);
//  }
//
//  public int fib (int i){
//    Scanner scanner = new Scanner(System.in);
//    scanner.close();
//    if (i <= 1){
//      return i;
//    }
//    else {
//      return i*fib(i-1);
//    }  факториал рекурсия и обычный
}
