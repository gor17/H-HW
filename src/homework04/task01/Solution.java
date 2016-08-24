package homework04.task01;

/*1. Создайте функцию, которая заполняет 2-мерный массив треугольником Паскаля
(элемент, который на строчке ниже, равен сумме 2х верхних элементов, которые стоят рядом; по бокам стоят единицы)
 */
public class Solution {

    private static int[][] makePaskal(int[][] array) { //заполняем массив элементами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == 0) {
                    array[i][j] = 1;
                }
                if (i == j) {
                    array[i][j] = 1;
                } else if ((i > 1) && (j > 0)) {
                    array[i][j] = array[i - 1][j - 1] + array[i - 1][j];
                }
            }
        }
        return array;
    }

    private static void printArray(int[][] array) { //метод распечатывает массив
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] array = new int[10][10];
        makePaskal(array);
        printArray(array);
    }
}
