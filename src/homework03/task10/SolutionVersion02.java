package homework03.task10;

/*
- Вывести первые 5 минимальных элементов массива // Сортируем пузырьком и выводим первые 5 элементов
*/
public class SolutionVersion02 {

    public static void main(String[] args) {

        int[] array = {1, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        boolean oneMoreTime = true;

        while (oneMoreTime) {
            oneMoreTime = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    oneMoreTime = true;
                }
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
