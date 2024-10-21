package LiveCoding;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Scobki_Stream_30_08 {

  public static void main(String[] args) {
    String str = "({[]})";
    System.out.println(isValid(str));
  }
  public static boolean isValid(String str) {
    Stack<Character> stack = new Stack<>();
    Map<Character, Character> map = new HashMap<>();
    map.put(')', '(');
    map.put('}', '{');
    map.put(']', '[');
    for (Character temp : str.toCharArray()) {
      if (map.containsValue(temp)) {
        stack.push(temp);
      } else if (stack.isEmpty() || stack.pop() != map.get(temp)) {
          return false;
        }
      }
    return stack.isEmpty();
  }
}
