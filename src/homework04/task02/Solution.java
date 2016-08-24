package homework04.task02;

import java.util.Arrays;

/* 2. Заполните 2-мерный массив по спирали:
 1   2  3  4
 12 13 14 5
 11 16 15 6
 10  9  8  7
 */
public class Solution {

    private static int[][] makeArray(int[][] array) {

        int n = array.length;
        int m = array[0].length;

        int c = 1; // итератор
        int i = 0;
        int j = 0;

        int bot = n - 1;    // ограничение снизу
        int right = m - 1; // ограничение справа
        int left = 0;   // ограничение слева

        while (c != n * m) {
            while (j < right) {
                array[i][j] = c++;
                j++;
            }
            while (i < bot) {
                array[i][j] = c++;
                i++;
            }
            while (j > left) {
                array[i][j] = c++;
                j--;
            }

            //Уменьшаем количество шагов в каждом цикле по строкам, столбцам и по кол-ву проходимых клеток
            bot--;
            right--;
            left++;
            while (i > left) {
                array[i][j] = c++;
                i--;
            }
        }
        //Добавляем  последний элемент
        if (c == n * m) {
            array[i][j] = c;
        }
        return array;
    }

    private static void printArray(int[][] array) {     //метод распечатывает массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] array = new int[4][4];
        makeArray(array);
        printArray(array);
    }
}
