package homework02.task04;

/*
4. Задача "Чаевые".
входные данные: сумма, которую вы должны заплатить и уровень сервиса
в зависимости от уровня сервиса посчитайте количество денег, которое вы должны оставить:
- terrible (0%)
- poor (5%)
- good (10%)
- great (15%)
- excellent (20%)
 */
public class Solution {

    static double howMuchToPay(String portrait, double bill) {

        if ("terrible".equals(portrait)) {
            return bill;
        } else if ("poor".equals(portrait)) {
            return bill * 1.05;
        } else if ("good".equals(portrait)) {
            return bill * 1.10;
        } else if ("great".equals(portrait)) {
            return bill * 1.15;
        } else if ("excellent".equals(portrait)) {
            return bill * 1.20;
        } else return bill;
    }

    public static void main(String[] args) {

        double yourBill = howMuchToPay("excellent", 100);

        System.out.printf("Итого к оплате (счёт + чаевые): %.2f", yourBill);
        System.out.println();
    }
}
