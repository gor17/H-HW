package homework04.task03;

/*3. Написать программу, которая получает 2 числа из командной строки как параметры,
и выводит результат суммы этих чисел. Программу   нужно запаковать в jar и запустить из командной строки.
 */
public class Solution {

    public static void main(String[] args) {

        System.out.println("Сумма двух чисел равна: " + (args[0] + args[1]));
    }
}
