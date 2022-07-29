import java.util.Scanner;
public class char2 {
    public static void main(String[] args) {
        int x = 10;           // примитивный тип данных           [10]
        char g = 'a';           // примитивный тип данных
        String k = "Hi";          // ссылочный тип данных
        int[] mass = {2,4,5,6,7,8,34,234,6432};
        int[] m1 = new int[5];      // ссылочный тип данных  [0 1 2 3 4]      // m1 -> [массив]
        for (int i = 0; i < m1.length; i++) {    // инициализация массива с помощью цикла for
            m1[i] = i * 10;
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.println("Vashe chislo iz massiva pod indeksom " + i + ":" + mass[i]);
        }
    }
}
