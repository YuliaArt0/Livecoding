package org.example;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

public class Work_10_03 {

  public static void main(String[] args) {
    HashMap<String, String> map = new HashMap<>();
    map.put("Потапыч","Медведь");
  }
}
/*Отчет о сотрудниках*/
//    Employee [] employees = new Employee[5];
//    employees[0] = new Employee("Petrov", 15000);
//    employees[1] = new Employee("Ivanov", 18000);
//    employees[2] = new Employee("Lenin", 100000);
//    employees[3] = new Employee("Suvorov", 8000);
//    employees[4] = new Employee("Stalin", 150000);
//    generateReport(employees);
//  }
//
//  public static void generateReport(Employee[] emp) {
//
//    for(int i = 0; i < emp.length; i++) {
//      Formatter formatter = new Formatter();
//      formatter.format("Работник %10s получает %10.2f%n", emp[i].getFullName(), emp[i].getSalary());
//      System.out.println(formatter);
//    }
//  }
//    /*Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].*/
//    getPatternString("Петров", 5, "Физика");
//    getPatternString("Гельсингфорский", 1000, "Программирование");
//  }
//
//  private static void getPatternString (String lastName, int grade, String subject) {
//    Formatter formatter = new Formatter();
//    formatter.format("Студент %-15s получил %-3s по %-10s.", lastName, grade, subject);
//    System.out.println(formatter);
//  }
/*Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака. Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",  для "Practice" результат "ct".*/
//    String str = "string";
//    String code = "code";
//    String practice = "Practice";
//    System.out.println(getMiddleOfString(str));
//    System.out.println(getMiddleOfString(code));
//    System.out.println(getMiddleOfString(practice));
//  }
//
//  private static String getMiddleOfString (String str) {
//    int lenght = str.length();
//    return str.substring(lenght/2-1, lenght/2+1);
//  }
//    Deque<String> deque = new ArrayDeque<>();
//    deque.offer("Ivan");
//    deque.offer("Oleg");
//    deque.offer("Nastya");
//    deque.offer("Masha");
//    deque.offer("Semen");
//    while (!deque.isEmpty()) {
//      System.out.print(deque.poll() + " ");
//    }
