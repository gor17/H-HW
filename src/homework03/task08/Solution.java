package homework03.task08;

import java.util.ArrayList;
import java.util.List;

/*
8) - Найти все счастливые билеты от 100000 до 999999 :
билет счастливый если сумма первых трех цифр равна сумме трех последних
например,  123312: 1+2+3==3+1+2
 */
public class Solution {

    static boolean isLucky(Integer number) {

        int firstPart = 0;
        int secondPart = 0;
        for (int i = 1; i < 4; i++) {
            secondPart = secondPart + number % 10;
            number /= 10;
        }
        for (int i = 4; i <= 6; i++) {
            firstPart = firstPart + number % 10;
            number /= 10;
        }
        return (firstPart == secondPart) ? true : false;
    }

    public static void main(String[] args) {

        final int MIN = 100_000;
        final int MAX = 999_999;
        List lucky = new ArrayList();

        for (int i = MIN; i <= MAX; i++) {

            if (isLucky(i)) {
                lucky.add(i);
            }
        }

        for (int i = 0; i < lucky.size(); i++) {
            System.out.println(lucky.get(i));
        }
    }
}
