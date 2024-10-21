package Training;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestLive {

  public static void main(String[] args) {

//// анаграмма * канонада, анаконда - true
    String str1 = "канонада";
    String str2 = "анаконда";
    System.out.println(isAnagram(str1, str2));
  }
  public static boolean isAnagram(String str1, String str2) {
    if (str1.length() != str2.length()) {
      return false;
    }
    var str1Chars = str1.toCharArray();
    Arrays.sort(str1Chars);
    var str2Chars = str2.toCharArray();
    Arrays.sort(str2Chars);
    for (int i = 0; i < str2.length(); i++) {
      if (str1Chars[i] != str2Chars[i]) {
        return false;
      }
    }
    return true;
  }

// усложненный вариант аннаграммы
//    ("обезьянство", "оветьянсзбо")
//    ("место", "тесмоп")
//    ("мечеть", "чеметь")
//    System.out.println(isAnagram("обезьянство", "оветьянсзбо"));
//    System.out.println(isAnagram("место", "тесмоп"));
//    System.out.println(isAnagram("мечеть", "чеметь"));
//  }
//
//  public static boolean isAnagram(String firstAnagram, String secondAnagram) {
//    if (firstAnagram.length() != secondAnagram.length()) {
//      return false;
//    }
//    char[] firstChars = firstAnagram.toCharArray();
//    char[] secondChars = secondAnagram.toCharArray();
//    boolean[] marker = new boolean[secondChars.length];
//    for (char temp : firstChars) {
//      for (int i = 0; i < secondChars.length; i++) {
//        if (temp == secondChars[i]) {
//          if (!marker[i]) {
//            marker[i] = true;
//            break;
//          }
//        }
//        if (i == secondChars.length - 1) {
//          return false;
//        }
//      }
//    }
//    return true;
//  }

//  вывести в консоль числа Фиббоначи первых 11 чисел
//    int s = 11;
//    int[] nums = new int[s];
//    nums[1] = 1;
//    for (int i = 2; i < s; i++) {
//      nums[i] = nums[i - 1] + nums[i - 2];
//    }
//    int sum = Arrays.stream(nums).sum();
//    System.out.println("11 первых чисел Фиббоначи: " + Arrays.toString(nums));
//    System.out.println("Сумма чисел Фиббоначи: " + sum);
//  }
//    // вывести в консоль числа Фиббоначи первых 11 чисел
//    int s = 11;
//    int[] nums = new int[s];
//    nums[1] = 1;
//    nums[2] = 1;
//    for (int i = 3; i < s; i++) {
//      nums[i] = nums[i - 1] + nums[i - 2];
//    }
//    int sum = Stream.iterate(new int[]{0, 1}, arr -> new int[]{arr[1], arr[0] + arr[1]})
//        .limit(s)
//        .map(x -> x[0])
//        .mapToInt(Integer::intValue)
//        .sum();
//
//    System.out.println("11 первых чисел Фиббоначи: " + Arrays.toString(nums));
//    System.out.println("Сумма чисел Фиббоначи: " + sum);
//  }
}
