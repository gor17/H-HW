package homework01;

import java.util.ArrayList;

/**
 * @autor V. Gordeev on 12.08.2016.
 */

/*
3. Найти минимальное из 3х чисел, причем, если минимальных несколько вывести все такие числа
 */
public class task03 {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;
        System.out.println("Исходные значения: " + a + " " + b + " " + c);

        // один минимум:
        if ((a < b) && (a < c)) {
            System.out.println("Минимальное значение " + a);

        } else if ((b < c) && (b < a)) {
            System.out.println("Минимальное значение " + b);

        } else if ((c < a) && (c < b)) {
            System.out.println("Минимальное значение " + c);
        }

        // два минимума:
        else if ((a < b) && (a == c)) {
            System.out.println("Минимальные значения: " + a + " " + c);

        } else if ((b < c) && (b == a)) {
            System.out.println("Минимальные значения: " + b + " " + a);

        } else if ((c < a) && (c == b)) {
            System.out.println("Минимальные значения: " + c + " " + b);
        }
        else  System.out.println("Все три значения равны: " + a + " " + b + " " + c);
    }
}
