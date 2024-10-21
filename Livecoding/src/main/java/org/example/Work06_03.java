package org.example;

import java.util.Scanner;

public class Work06_03 {

  public static void main(String[] args) {
/*Напишите проверку, является ли заданное число простым.*/
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    int a = scanner.nextInt();
    scanner.close();
    if (a <= 1){
      System.out.println("Число " + a + " не является простым");
    } else {
      for (int i = 2; i < a; i++) {
        if (a % i == 0) {
          System.out.println("Число " + a + " не является простым");
          break;
        }
        System.out.println("Число " + a + " является простым");
      }
    }
  }
}
//  String str = "I like Java!";
//    getReverseString(str);
//  }
//
//  private static void getReverseString (String str) {
//    char [] arr = str.toCharArray();
//    int size = arr.length;
//    for(int i = 0; i < size/2; i++) {
//      char temp = arr[i];
//      arr[i] = arr[size-1-i];
//      arr[size-1-i] = temp;
//    }
//    System.out.println(new String(arr));
/*Напишите программу, которая выводит на экран числа от 1 до 10.*/
//    for(int i = 1; i < 10; i++) {
//    System.out.print(i + " ");
//    }
/*Напишите программу, которая находит сумму всех чисел от 1 до 100.*/
//    int sum = 0;
//    for (int i = 1; i <= 100; i++) {
//      sum += i;
//    }
//    System.out.println(sum);
/*Найдите факториал заданного числа.*/
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите число: ");
//    int a = scanner.nextInt();
//    long result = 1;
//    scanner.close();
//    for(int i = 2; i <= a; i++) {
//      result *= i;
//    }
//    System.out.println(result);