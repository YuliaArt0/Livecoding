package LiveCoding;

public class vse_po_chut_21_08 {

  // развернуть с помощью стриг билдера
  public static void main(String[] args) {
//  String str = "I Love Java!";
//    System.out.println(reverse(str));
//  }
//  public static String reverse(String str) {
//    return new StringBuilder(str).reverse().toString();
//  }
//}

// Разверни строку любым способом кроме stringbulder
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

// 1, 2, 3, 4, 5, 15 Найдем сумму четных чисел этой коллекции,
// двумя способами
//    int sum = Stream.of(1, 2, 3, 4, 5, 15)
//        .filter(x -> x%2 ==0)
//        .reduce(Integer::sum)
//        .get();
//    System.out.println("Сумма четных чисел: " + sum);
//  }
//  четные числа умножает на 100, а нечетные отнимает от 100
//    List<Integer> list = List.of(1, 2, 3, 4, 5);
//    List<Integer> list2 = list.stream()
//        .map(x -> x % 2 == 0 ? x * 100 : x - 100)
//        .toList();
//    System.out.println(list);
//    System.out.println(list2);
//  }

//  Вывести число фиббоначи, первых 11 чисел
//  каждое число последовательности, равно двух предшедствующих в каждом элементе
// 0, 1, 1, 2, 3, 5
//    int a = 11;
//    int[] numbers = new int[a];
//    numbers[1] = 1;
//    numbers[2] = 2;
//    for (int i = 3; i < a; i++) {
//      numbers[i] = numbers[i - 2] + numbers[i - 1];
//    }
//
//    int result = Stream.iterate(new int[]{0, 1},
//            number -> new int[]{number[1], number[0] + number[1]})
//        .limit(a)
//        .map(x -> x[0])
//        .mapToInt(Integer::intValue)
//        .sum();
//
//    System.out.println(Arrays.toString(numbers));
//    System.out.println(result);
//  }

//    I love photo выведи, чтобы три строки было в консоли
    String str = "I love photo";
    String[] arr = str.split(" ");
    for (String array : arr) {
      System.out.println(array);
    }
  }
}
