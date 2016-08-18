package homework02.task02;
/*
2. Добавить к калькулятору возможность ввода операции и чисел из консоли.
В начале выводите сообщение "Введите операцию:", дальше пользователь вводит операцию,
далее "Введите первое число:" - вводит, "Введите второе число: " - пользователь вводит.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

    static void calc() throws IOException {

        double answer = 0;
        System.out.println("Введите операцию: (возможные операции: +, -, *, /, %):");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String oper = reader.readLine();
        char[] operArray = oper.toCharArray();
        System.out.println("Введите первое число:");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число:");
        double b = Double.parseDouble(reader.readLine());
        if (operArray[0] == '+') {
            answer = a + b;
        } else if (operArray[0] == '-') {
            answer = a - b;
        } else if (operArray[0] == '*') {
            answer = a * b;
        } else if (operArray[0] == '/') {
            answer = a / b;
        } else if (operArray[0] == '%') {
            answer = a % b;
        }
        System.out.println("Результат ваших вычислений равен: " + answer);
    }

    public static void main(String[] args) throws IOException {

        calc();
    }

}
