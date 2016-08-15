package homework01.task07;

/*
7. Посчитайте, сколько будет стоить аренда квартиры за заданное число дней, если известно, что за 1 день ее
 стоимость 40 грн. Причем, если съемщик прожил в ней больше 5 дней, он получит скидку 20 грн,
 а если больше 7 дней, то скидка составит 50 грн.
 */
public class Solution07 {

    static int rentSumm(Integer daysCount) {

        int valueOfDay = 40;

        if (daysCount <= 5) {
            return (valueOfDay * daysCount);
        } else
            return (((daysCount > 5) && ((daysCount <= 7))) ? (valueOfDay * daysCount - 20) : (valueOfDay * daysCount - 50));
    }


    public static void main(String[] args) {

        int daysCount = 10; // кол-во дней, задаётся пользователем

        System.out.println("Стоимость оплаты жилья составит: " + rentSumm(daysCount));

    }
}
