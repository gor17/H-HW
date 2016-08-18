package homework02.task01;

/*
1. Создайте калькулятор, который выполняет, базовые арифметические операции:
- умножение;
- деление;
- сложение;
- вычитание;
- остаток от деления (%);
- нахождение модуля числа (можно использовать Math.abs)
входные данные здесь можно представить как:
String operation = "addition";
int firstOperand = 15;
int secondOperand = 12;
 */
public class Solution {

    static double calc(char operation, double a, double b) {

        if (operation == '+') {
            return a + b;
        } else if (operation == '-') {
            return a - b;
        } else if (operation == '*') {
            return a * b;
        } else if (operation == '/') {
            return a / b;
        } else if (operation == '%') {
            return a % b;
        } else if (operation == '|') { // "|" - возвращает модуль первого аргумента
            return (a >= 0) ? a : -a;
        } else return 0;
    }

    public static void main(String[] args) {

        System.out.println("Результат ваших вычислений равен:");
        System.out.println(calc('+', 13, 2));
    }
}
