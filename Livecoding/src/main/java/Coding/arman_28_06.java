package Coding;

import java.util.regex.Pattern;

public class arman_28_06 {
  public static void main(String[] args) {
    //Проверить соответствует ли элементы массива шаблону email с помощью регулярных выражений
    //String[] emailsList = { "test@mail.ru", "123-kkdf@gmail.com", "123@343.com", "qwerty@.com", "123123@yandex.com", "test.test@gmail.com", "sdfsdfs@gmail."};
    String[] emailsList = {"test@mail.ru", "123-kkdf@gmail.com", "123@343.com", "qwerty@.com",
        "123123@yandex.com", "test.test@gmail.com", "sdfsdfs@gmail."};
    for (String email : emailsList) {
      System.out.println(isEmailCorrect(email));
    }
  }
    public static boolean isEmailCorrect (String email){
      Pattern pattern = Pattern.compile("^[a-zA-Z0-9._+-]+[@][a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
      return pattern.matcher(email).matches();
    }
  }
