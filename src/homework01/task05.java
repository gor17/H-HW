package homework01;

/**
 * @autor V. Gordeev on 12.08.2016.
 */

/*
*  5. Даны 2 числа, определить делится ли первое число на второе без остатка
*/
public class task05 {
    public static void main(String[] args) {

        int a = 20;
        int b = 4;

        System.out.println("Исходные числа равны: " + a + " " + b);

        if (a%b == 0) {
            System.out.println("Первое число делиться на второе без остатка");
        } else System.out.println("Первое число не делиться на втрое без остатка");
    }
}
