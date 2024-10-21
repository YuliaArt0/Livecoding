package Training;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {

  public static void main(String[] args) {
//    String str = "11225553377755544411";
//    System.out.println(task2(str));
//  }
      String str = "111144444555622222";
      StringBuilder max = new StringBuilder();
      StringBuilder temp = new StringBuilder();
      char[] chars = str.toCharArray();
      char symbol = chars[0];
      for (int i = 0; i < str.length(); i++) {
        if (symbol == chars[i]) {
        temp.append(symbol);
        } else {
          symbol = chars[i];
          temp = new StringBuilder();
          temp.append(symbol);
        }
        if (temp.length() > max.length()) max = temp;
      }
      System.out.println(max);
    }

}
