package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Collections {

  public static void main(String[] args) {

//    int[] sortedList = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 8, 8, 9, 9, 10};
//    System.out.println(Arrays.toString(getArrWithNoRepeat(sortedList)));
    String[] emailsList = { "test@mail.ru", "123-kkdf@gmail.com", "123@343.com", "qwerty@.com", "123123@yandex.com", "test.test@gmail.com", "sdfsdfs@gmail."};
    for(String email : emailsList){
      System.out.println(isEmailCorrect(email));
    }
//    getCountCharAtWord();
  }

  /*Удалить дубликаты из сортированного списка с помощью коллекций.*/
//  private static int[] getArrWithNoRepeat(int[] arr) {
//    HashSet<Integer> set = new HashSet<>();
//    for(int i : arr){
//      set.add(i);
//    }
//    return set.stream().mapToInt(Integer::intValue).toArray();
//  }

  /*Проверить соответствуют ли элементы массива шаблону email-а с помощью регулярных выражений*/
  private static boolean isEmailCorrect(String email) {
    Pattern pattern = Pattern.compile("^[a-zA-Z0-9._+-]+[@][a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    return pattern.matcher(email).matches();
  }

  /*Реализовать метод, который будет возвращать количество передаваемого символа в слове. Пример:countCharAtWord('a', \"Aligator\") = 2*/
//  private static void getCountCharAtWord() {
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите слово: ");
//    String word = scanner.nextLine().toLowerCase();
//    System.out.println("Введите символ: ");
//    char symbol = scanner.nextLine().charAt(0);
//    scanner.close();
//    char [] arr = word.toCharArray();
//    int count = 0;
//    for(char a : arr){
//      if(a == symbol){
//        count++;
//      }
//    }
//    System.out.println(count);
//  }
}
