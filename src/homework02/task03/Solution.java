package homework02.task03;

/*
3. Тот же калькулятор, только операция и числа вводятся как параметры из
командной строки в "Edit Configuration". (попробуйте после того как
запустили в IDE запустить приложение из консоли с передачей параметров).
 */

public class Solution {

    static double calc(Character oper, double a, double b) {

        if (oper == '+') {
            return a + b;
        } else if (oper == '-') {
            return a - b;
        } else if (oper == 'm') {
            return a * b;
        } else if (oper == '/') {
            return a / b;
        } else if (oper == '%') {
            return a % b;
        } else return 0;
    }

    public static void main(String[] args) {

        // в моём калькуляторе операции умножения соответствует значок 'm'
        char operation = args[0].charAt(0);

        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);

        System.out.println("Вы выбрали операцию: " + operation);
        System.out.println("Первый аргумент равен: " + a);
        System.out.println("Второй аргумент равен: " + b);
        System.out.println();

        System.out.println("Результат ваших вычислений равен: " + calc(operation, a, b));
    }

}
