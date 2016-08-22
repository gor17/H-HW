package homework03.task10;

import java.util.ArrayList;
import java.util.List;

/*
- Вывести первые 5 минимальных элементов массива
 */
public class Solution {

    public static void main(String[] args) {

        int[] mass = new int[]{22, 2, 4, 8, 6, 3, 5, 4,};
        List<Integer> min = new ArrayList<>();

        int iterator = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (iterator > mass[i]) {
                iterator = mass[i];
            }
        }
        min.add(iterator);

        for (int i = 0; i < mass.length; i++) {
            if (iterator == mass[i]) {
                mass[i]=Integer.MAX_VALUE;
            }
        }

        for (int j = 0; j < 4; j++) {
            iterator = mass[0];
            for (int i = 0; i < mass.length; i++) {
                if (iterator > mass[i]) {
                    iterator = mass[i];
                }
            }
            min.add(iterator);
            for (int i = 0; i < mass.length; i++) {
                if (iterator == mass[i]) {
                    mass[i] = Integer.MAX_VALUE;
                }
            }
        }

        System.out.println(min);
    }
}

