package homework01.task04;

/*
 * 4. Написать программу, которая проверит, является ли число четным или нечетным
 */
public class Solution04 {
    public static void main(String[] args) {

        int a = 12;
        System.out.println("Исходное число равно: " + a);

        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else System.out.println("Число нечётное");
    }
}
