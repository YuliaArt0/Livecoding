package org.example;

import java.util.Stack;

public class Homework {
//  c помощью коллекции Stack
  public static void main(String[] args) {
    String str = "({[}])";
    System.out.println(isStringCorrect(str));
  }

  public static boolean isStringCorrect (String str) {
    char[] arr = str.toCharArray();
    Stack<Character> stack = new Stack<>();
    if(arr.length % 2 != 0) {
      return false;
    } else {
      for (char c : arr) {
        if (c == '(' || c == '{' || c == '[') {
          stack.push(c);
        } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
          stack.pop();
        } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
          stack.pop();
        } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
          stack.pop();
        } else {
          return false;
        }
      }
      return stack.isEmpty();
    }
  }
}
