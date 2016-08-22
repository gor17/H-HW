package homework03.task07;

/*
7) - Найти сумму всех четных и сумму всех нечетных элементов массива
 */
public class Solution {

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 2, 2, 2};
        int even = 0;
        int odd = 0;

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0) {
                even += array[i];
            } else odd += array[i];
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
