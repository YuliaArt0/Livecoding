package LiveCoding;

import static Training.Progon1.isAnagram;

import java.util.Arrays;

public class Test_Anagram {

  public static void main(String[] args) {
//    String word1 = "listen";
//    String word2 = "silent";
//    System.out.println(isAnagram(word1, word2)); // Выведет true
//  }
//
//  public static boolean isAnagram(String word1, String word2) {
//    // Проверяем длину слов
//    if (word1.length() != word2.length()) {
//      return false;
//    }
//
//    // Преобразуем оба слова в массивы символов
//    char[] word1Chars = word1.toCharArray();
//    char[] word2Chars = word2.toCharArray();
//
//    // Сортируем массивы
//    Arrays.sort(word1Chars);
//    Arrays.sort(word2Chars);
//
//    // Сравниваем отсортированные массивы
//    return Arrays.equals(word1Chars, word2Chars);
//  }
////  30. Анаграмма (через chars)
    System.out.println(isAnagram("Стул", "Стол")); // Выведет false
//    System.out.println(isAnagram("ляляля", "ляляля")); // Выведет true
  }

  public static boolean isAnagram(String word1, String word2) {
    if (word1.length() != word2.length()) {
      return false;
    }

    char[] word1Chars = word1.toCharArray();
    char[] word2Chars = word2.toCharArray();
    boolean[] m = new boolean[word2Chars.length];

    for (char symbol : word1Chars) {
      for (int i = 0; i < word2Chars.length; i++) {
        if (symbol == word2Chars[i]) {
          if (!m[i]) {
            m[i] = true;
            break;
          }
          if (i == word2Chars.length - 1) {
            return false;
          }
        }
      }
      return true;
    }
    return false;
  }
}
