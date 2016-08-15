package homework01.task06;

/*
* 6. Найти ближайшее к 10 из 2х заданных чисел. Например, среди чисел 8 и 11 ближайшее к десяти 11
 */
public class Solution06 {

    static int nearestToTen(Integer a, Integer b) {

           return ((Math.abs(a - 10) < Math.abs(b - 10)) ? a : b);
    }

    public static void main(String[] args) {

        int a = 100;
        int b = -10;

        System.out.println("Исходные числа равны: " + a + " " + b);
        System.out.println("Ближайшее число к 10-ке равно: " + nearestToTen(a, b));
    }
}
