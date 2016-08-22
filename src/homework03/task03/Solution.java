package homework03.task03;

/*
3) - Создайте программу, выводящую на экран все неотрицательные элементы последовательности 90 85 80 75 70 65 60 ….
 */
public class Solution {

    public static void main(String[] args) {

        int i = 90;

        while (i >= 0) {
            System.out.println(i);
            i -= 5;
        }
    }
}
