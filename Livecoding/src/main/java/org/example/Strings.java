package org.example;


import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;
import static java.lang.Character.toUpperCase;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Strings {

  public static void main(String[] args) {
//    есть строка заменить все строчные буквы на заглавные и наоборот
    String str = "Something eLSE";
    char[] arr = str.toCharArray();
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.length; i++) {
      if (isUpperCase(arr[i])) {
        sb.append(toLowerCase(arr[i]));
      } else {
        sb.append(toUpperCase(arr[i]));
      }
      System.out.println(str);
      System.out.println(sb);
    }
  }
//    System.out.println(sb);
//      Pattern pattern = Pattern.compile(".");
//      Matcher matcher = pattern.matcher(str);
//      StringBuilder sb = new StringBuilder();
//      int count = 0;
//      while(matcher.find()){
//        count++;
//        if(isLowerCase(matcher.group().charAt(0))){
//          matcher.appendReplacement(sb, matcher.group().toUpperCase());
//        } else {
//          matcher.appendReplacement(sb, matcher.group().toLowerCase());
//        }
//      }
//    System.out.println(sb);
//  }
//   Заменить каждое второе вхождение строки без regex
//    String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
//    String target = "Object-oriented programming";
//    String replacement = "OOP";
//    String[] parts = str.split(target);
//    StringBuilder sb = new StringBuilder(parts[0]);
//    for(int i = 1; i< parts.length; i++){
//      if(i%2 == 0){
//        sb.append(replacement);
//      } else {
//        sb.append(target);
//      }
//      sb.append(parts[i]);
//    }
//    System.out.println(sb);
//  }
// Заменить каждое второе вхождение строки regex
//    String str = "Object-oriented programming is a programming language model organized around objects rather than \"actions\" and data rather than logic. Object-oriented programming blabla. Object-oriented programming bla.";
//    String target = "(?i)object-oriented programming";
//    String replacement = "OOP";
//
//    Pattern pattern = Pattern.compile(target);
//    Matcher matcher = pattern.matcher(str);
//    StringBuilder result = new StringBuilder();
//    int count = 0;
//    while (matcher.find()){
//      count++;
//      if(count%2 == 0){
//        matcher.appendReplacement(result, replacement);
//      } else{
//        matcher.appendReplacement(result, matcher.group());
//      }
//    }
//    matcher.appendTail(result);
//
//    System.out.println(result);
//  }
  //    есть 2 числа составить строки используя StringBuilder
//    int a = 3;
//    int b = 56;
////    3 + 56 = 59
//    StringBuilder sb = new StringBuilder();
//    String str = sb.append(a).append(" + ").append(b).append(" = ").append(a+b).toString();
//    System.out.println(str);
////    3 – 56 = -53
//    StringBuilder sb1 = new StringBuilder();
//    String str1 = sb1.append(a).append(" - ").append(b).append(" = ").append(a-b).toString();
//    System.out.println(str1);
////    3 * 56 = 168.
//    StringBuilder sb2 = new StringBuilder();
//    String str2 = sb2.append(a).append(" * ").append(b).append(" = ").append(a*b).toString();
//    System.out.println(str2);
//    String str = "I love Java!!!";
//    System.out.println("Last symbol is " + getLastSymbol(str));
//    System.out.println(str.endsWith("!!!"));
//    System.out.println(str.startsWith("I love"));
//    System.out.println(str.contains("Java"));
//    System.out.println(str.indexOf("Java"));
//    System.out.println(str.replace("a", "o"));
//    System.out.println(str.toUpperCase());
//    System.out.println(str.toLowerCase());
//  }
//
//  public static char getLastSymbol (String str){
//    int lenght = str.length();
//    return str.charAt(lenght-1);
//  }

//    Scanner sc = new Scanner(System.in);
//    System.out.println("Введите строку: ");
//    String str = sc.nextLine();
//    sc.close();
//    System.out.println(reverseString(str));
//  }
//
//  public static String reverseString(String str){
//    char[] arr = new char[str.length()];
//    for(int i = str.length()-1; i>=0; i--){
//      arr[str.length()-i-1] = str.charAt(i);
//    }
//    return new String(arr);
//  }
}
