package homework05.taskMain;

import static homework05.task01.Solution.arrMerge;
import static homework05.task01.Solution.printArray;
import static homework05.task02.Solution.ifSumOkey;

/*

main -метод, точка входа
 */
public class Sol {


    public static void main(String[] args) {

        //первое задание
        int[] firstArr = new int[]{1, 3, 5, 7, 9, 11, 13, 15};
        int[] secondArr = new int[]{2, 4, 6, 8};

        int[] с = arrMerge(firstArr, secondArr);

        System.out.println("Решение первой задачи(объединениние и сортировка двух массивов)");
        printArray(с);

        // второе задание
        int[] arr = {1, 3, 5, 9, 10, 15};
        int sum = 10;

        System.out.println("Решение второй задачи (есть ли в массиве два числа, сумма которых равна sum):");
        System.out.println(ifSumOkey(sum, arr));
    }
}
