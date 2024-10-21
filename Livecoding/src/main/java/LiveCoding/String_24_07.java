package LiveCoding;

public class String_24_07 {

  public static void main(String[] args) {
// Придумай любую строку, чтобы было три слова,
// и нужно развернуть готовым методом reverse
//    String str = "I love Java";
//    System.out.println(revers(str));
//  }
//  public static String revers(String str) {
//    return new StringBuilder(str).reverse().toString();
//  }
////
//    String str = "I love pizza";
//    int length = str.length();
//    char[] chars = new char[length];
//    int counter = 0;
//    for(int i = length-1; i >= 0; i--) {
////      chars[i] = str.charAt(counter);
////      counter++;
//      char temp = str.charAt(i); // temp это переменная
//      chars[counter++]=temp;
//    }
//    System.out.println(chars);
//  }
//    String str = "I love pizza";
//    char[] chars = str.toCharArray();
//
//    int countFirst = 0;
//    int countSecond = chars.length - 1;
//
////пока счетчики не сравняются, менять через темповую переменную
//    while (countFirst < countSecond) {
//      char temp = chars[countFirst];
//      chars[countFirst] = chars[countSecond];
//      chars[countSecond] = temp;
//      countFirst++;
//      countSecond--;
//    }
//    System.out.println(chars);
//  }

// Выбери любое слово, где заглавная буква верхнего регистра и нижний регистр будет совпадать
// т.е. чтобы было две буквы, но одна в верхнем регистре, одна в нижнем
// Напиши программу, которая посчитает количество букв А в этом слове, внезависимости от регистра
// String str = "Alligator";
    System.out.println(countChars('A', "Alligator"));
  }
  public static int countChars(char chars, String str) {
    int counter = 0;
    for (int i = 0; i < str.length(); i++) {
      if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(chars)) {
        counter++;
      }
    }
    return counter;
  }
}