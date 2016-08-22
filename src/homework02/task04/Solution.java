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

    private static final float TERRIBLE_TIPS = 1.0f;
    private static final float POOR_TIPS = 1.05f;
    private static final float GOOD_TIPS = 1.10f;
    private static final float GREAT_TIPS = 1.15f;
    private static final float EXCELLENT_TIPS = 1.20f;

    static double howMuchToPay(String portrait, double bill) {

        if ("terrible".equals(portrait)) {
            return bill * TERRIBLE_TIPS;
        } else if ("poor".equals(portrait)) {
            return bill * POOR_TIPS;
        } else if ("good".equals(portrait)) {
            return bill * GOOD_TIPS;
        } else if ("great".equals(portrait)) {
            return bill * GREAT_TIPS;
        } else if ("excellent".equals(portrait)) {
            return bill * EXCELLENT_TIPS;
        } else return bill;
    }

    public static void main(String[] args) {

        double yourBill = howMuchToPay("excellent", 100);

        System.out.printf("Итого к оплате (счёт + чаевые): %.2f", yourBill);
        System.out.println();
    }
}
