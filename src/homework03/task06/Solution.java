package homework03.task06;

/*
6) - Найти минимальный и максимальный элемент массива
 */
public class Solution {

    public static void main(String[] args) {

        int[] myArray = new int[]{10, 8, 150, 5, 48484};

        int min = myArray[0];
        int max = myArray[0];

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            }
            if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }
}
