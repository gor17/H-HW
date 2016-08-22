package homework03.task04;

/*
4) - Создайте программу, выводящую на экран первые 20 элементов последовательности 2 4 8 16 32 64 128 ….
 */
public class Solution {

    public static void main(String[] args) {

        int i = 0;
        int t = 2;

        while (i < 20) {
            System.out.println(t);
            t *= 2;
            i++;
        }
    }
}
