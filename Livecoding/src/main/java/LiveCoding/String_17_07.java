package LiveCoding;

public class String_17_07 {

  public static void main(String[] args) {
// Выбери любое слово, где заглавная буква верхнего регистра и нижний регистр будет совпадать
// т.е. чтобы было две буквы, но одна в верхнем регистре, одна в нижнем
// Напиши программу, которая посчитает количество букв А в этом слове, внезависимости от регистра
//    String str = "Ideix";
//    System.out.println(countChars('i', "Ideix"));
//  }
// public static int countChars(char chars, String str){
//    int counter = 0;
//    for (int i = 0; i < str.length(); i++) {
//      if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(chars)) {
//        counter++;
//      }
//    }
//    return counter;
// }

// Посчитать сколько раз повторяется слово, посчитать с помощью hashmap
//    String str = "Упади семь раз и восемь раз поднимись";
//    String[] arr = str.split(" ");
//    HashMap<String, Integer> hashMap = new HashMap<>();
//    for (int i = 0; i < arr.length; i++) {
//    if (hashMap.containsKey(arr[i])) {
//      int counter = hashMap.get(arr[i]);
//      hashMap.put(arr[i], counter + 1);
//    } else {
//      hashMap.put(arr[i], 1);
//    }
//    }
//    System.out.println(hashMap);
//  }

//  String string = "Упади семь раз и восемь раз поднимись";
//  String [] arr = string.split(" ");
//  HashMap<String, Integer> hashMap = new HashMap<>();
//      for(int i = 0; i< arr.length; i++) {
//    if (hashMap.containsKey(arr[i])) {
//      int counter = hashMap.get(arr[i]);
//      hashMap.put(arr[i], counter+1);
//    } else {
//      hashMap.put(arr[i], 1);
//    }
//  }
//    System.out.println(hashMap);
//}
// Факториал
//    Scanner scanner = new Scanner(System.in);
//    System.out.println("Введите число: ");
//    int a = scanner.nextInt();
//    long result = 1;
//    scanner.close();
//    for (int i = 2; i <= a; i++){
//      result *=i;
//    }
//  }
// Посчитаем сумму ключей и значений в hashmap
//    HashMap<Integer, String> map = new HashMap<>();
//    map.put(1, "One");
//    map.put(2, "Two");
//    map.put(3, "Tree");
//    System.out.println(getFactorial(map));
//    System.out.println(map);
//  }
//  public static HashMap<String, Integer> getFactorial(HashMap<Integer, String> map) {
//    HashMap<String, Integer> newMap = new HashMap<>();
//    map.forEach((k, v) -> newMap.put(v, k));
//    return newMap;
//  }

//  Напиши программу, которая четные умножает на 100, а от нечетных отнимает 100
//    List<Integer> list = List.of(1, 2, 3, 4, 5);
//    List<Integer> list2 = list.stream()
//        .map(x -> x % 2 == 0 ? x * 100 : x - 100)
//        .toList();
//    System.out.println(list);
//    System.out.println(list2);
//  }
//    Многопоточка напоследок
    MyThread myThread = new MyThread();
    myThread.start();

    MyThread myThread2 = new MyThread();
    myThread2.start();
  }
}

class MyThread extends Thread {

  @Override
  public void run() {
    for (int i = 0; i < 100; i++) {
      try {
        Thread.sleep(1);
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
      System.out.println("Hello from myThread " + i);
    }
  }
}
