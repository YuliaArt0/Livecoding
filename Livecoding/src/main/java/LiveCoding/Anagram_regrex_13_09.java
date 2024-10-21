package LiveCoding;

import java.util.HashMap;
import java.util.Set;

public class Anagram_regrex_13_09 {

  public static void main(String[] args) {
    System.out.println(isAnagram("канонада", "анаконда"));
    System.out.println(isAnagram("стол", "стул"));
  }
    public static boolean isAnagram (String str1, String str2){
      if (str1.length() != str2.length()) {
        return false;
      }

      HashMap<Character, Integer> map = new HashMap<>();

      for (int i = 0; i < str1.length(); i++) {
        if (map.containsKey(str1.charAt(i))) {
          map.put(str1.charAt(i),
              map.get(str1.charAt(i)) + 1);
        } else {
          map.put(str1.charAt(i), 1);
        }
      }
      for (int i = 0; i < str2.length(); i++) {
        if (map.containsKey(str2.charAt(i))) {
          map.put(str2.charAt(i),
              map.get(str2.charAt(i)) - 1);
        }
      }

      Set<Character> set = map.keySet();
      for (Character key : set) {
        if (map.get(key)
            != 0) {
          return false;
        }
      }
      return true;
    }
  }
