package homework03.task05;

/*
5)- Найти сумму первых n элементов массива
 */
public class Solution {

    public static void main(String[] args) {

        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int n = 5;
        int summ = 0;

        for (int i = 0; i < n; i++) {
            summ += array[i];
        }
        System.out.println(summ);

    }
}
