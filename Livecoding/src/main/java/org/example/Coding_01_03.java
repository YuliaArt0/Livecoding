package org.example;

import java.util.Arrays;
import java.util.List;

public class Coding_01_03 {

  public static void main(String[] args) {
    String str = "I like Java!";
    System.out.println(reverse(str));

  }

  private static String reverse (String string) {
    char [] arr = string.toCharArray();
    char temp;
    int leftPointer = 0;
    int rightPointer = arr.length - 1;
    while (leftPointer<rightPointer){
      temp = arr[leftPointer];
      arr[leftPointer] = arr[rightPointer];
      arr[rightPointer] = temp;
      leftPointer++;
      rightPointer--;
    }
    return Arrays.toString(arr);
  }
}
