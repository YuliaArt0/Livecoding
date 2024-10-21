package LiveCoding;

public class String_14_08 {

  // Развернуть любую произвольную строку тремя способами
  public static void main(String[] args) {
    // Раз два три четыре пять
//    String str = "Я люблю Aston";
//    int strLength = str.length();
//    char[] chars = str.toCharArray();
//    int i = 0;
//    int k = chars.length - 1; // последний элемент массива
//    for (; i <= k; i++, k--){
//      char temp = chars[i];
//      chars[i] = chars[k];
//      chars[k] = temp;
//    }
//    System.out.println(chars);
//  }
//    String str = "I love Aston";
//    char[] chars = str.toCharArray();
//    int firstChar = 0;
//    int secondChar = chars.length-1;
//    while (firstChar<secondChar){
//      char temp = chars[firstChar];
//      chars[firstChar] = chars[secondChar];
//      chars[secondChar] = temp;
//      firstChar++;
//      secondChar--;
//    }
//    System.out.println(chars);
//  }
//  Ещё есть способ с помощью StringBuilder, рекурсия и с помощью scanner,
//  с помощью метода АП
//    System.out.println("Введите произвольную строку: ");
//    Scanner scanner = new Scanner(System.in);
//    String str = scanner.nextLine();
//    scanner.close();
//    StringBuilder stringBuilder = new StringBuilder();
//    for (int i = str.length() - 1; i >= 0; i--){
////int i = str.length()-1 это счетчик
//// i >= 0 условие выполнения цикла
//// i-- дикремент на уменьшение
//      stringBuilder.append(str.charAt(i));
//    }
//    System.out.println(stringBuilder);
//  }
//    Реализовать метод, который будет возвращать количество передаваемого символа в слове.
//    Пример: countCharAtWord('s', "Aligator") = 2
//    String str = "Aligator";
//    char a = 'a';
//    System.out.println(method(str, a));
//  }
//    public static int method(String str, char a) {
//
//      int counter = 0;
//      for (int i = 0; i < str.length(); i++) {
//        if (Character.toLowerCase(str.charAt(i))== Character.toLowerCase(a)){
//          counter++;
//        }
//      }
//      return counter;
//    }
//    Тоже самое, но без использования класса Character
// Нужно массив символов сделать, завести счетчик интовый, сделать char массива

    String str = "Aligator";
    char a = 'a';
    System.out.println(method(str, a));
  }
  public static int method(String str, char a) {
        char[] chars = str.toLowerCase().toCharArray();
        int counter = 0;
        for (int i = 0; i < chars.length; i++) {
        if (chars[i] == a){
          counter++;
        }
      }
      return counter;
          }
        }
