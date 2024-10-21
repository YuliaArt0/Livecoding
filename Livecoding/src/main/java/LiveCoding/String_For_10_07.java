package LiveCoding;

public class String_For_10_07 {

  public static void main(String[] args) {
//    String str = "I love Java";
//    System.out.println(revers(str));
//  }
//  public static String revers(String str) {
//    return new StringBuilder(str).reverse().toString();
//  }
// String str = "I love Java"; перевернуть с помощью цикла for
//    String str = "I love Java";
//    int lenght = str.length();
//    char[] chars = new char[lenght];
//    int counter = 0;
//    for (int i = lenght-1; i >= 0; i--) {
//      char temp = str.charAt(i);
//      chars[counter++] = temp;
//    }
//    System.out.println(chars);
//  }
//    String str = "I love Java"; перевернуть с помощью цикла while
//    String str = "I love Java";
//    char[] chars = str.toCharArray();
//    int countFirst = 0;
//    int countSecond = chars.length - 1;
//    while (countFirst < countSecond) {
//      char temp = chars[countFirst];
//      chars[countFirst] = chars[countSecond];
//      chars[countSecond] = temp;
//      countFirst++;
//      countSecond--;
//    }
//    System.out.println(chars);
//  }

//"Мы готовимся к интервью на вакансию AQA Java" нужно убрать все пробелы
//    String str = "Мы готовимся к интервью на вакансию AQA Java";
//    String str2 = str.replaceAll("\\s", "");
//    System.out.println(str2);
//  }
//    \\s - регулярка, значит пробел
//"Мы готовимся к интервью на вакансию AQA Java" нужно убрать все пробелы
// через StringBuffer
    String str = "Мы готовимся к интервью на вакансию AQA Java";
    char[] chars = str.toCharArray();
    StringBuffer stringBuffer = new StringBuffer();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] != ' ' && chars[i] != '\t') {
        stringBuffer.append(chars[i]);
      }
    }
    System.out.println(stringBuffer);
  }
}
