package homework01;

/**
 * @autor V. Gordeev on 12.08.2016.
 */
/*
* 6. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
 */
public class task06 {

    static int nearestToTen(Integer a, Integer b) {

        if (a < b) {
            if (b < 10) {
                return b;
            } else return ((Math.abs(a - 10) < Math.abs(b - 10)) ? a : b);
        } else if (b < a) {
            if (a < 10) {
                return a;
            } else return ((Math.abs(a - 10) < Math.abs(b - 10)) ? a : b);
        } else return a;
    }

    public static void main(String[] args) {

        int a = -2;
        int b = -1;

        System.out.println("Исходные числа равны: " + a + " " + b);
        System.out.println("Ближайшее число к 10-ке равно: " + nearestToTen(a, b));
    }
}
