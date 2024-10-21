package LiveCoding;

import java.util.HashMap;

public class String_Collection_28_06 {

  public static void main(String[] args) {
    //  Посчитать количество конкретных слов в строке
//  "Упади семь раз и восемь раз поднимись", используя HashMap
    String str = "Упади семь раз и восемь раз поднимись";
    String[] arr = str.split(" ");
    HashMap<String, Integer> hashMap = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      if (hashMap.containsKey(arr[i])) {
        int counter = hashMap.get(arr[i]);
        hashMap.put(arr[i], counter + 1);
      } else {
        hashMap.put(arr[i], 1);
      }
    }
    System.out.println(hashMap);
  }
  //
}
