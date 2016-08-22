package homework03.task02;

/*
2) - Создайте программу, выводящую на экран первые 55 элементов последовательности 1 3 5 7 9 11 13 15 17 ….

 */
public class Solution {

    public static void main(String[] args) {

        int i = 1;
        int t = 1;
        while (i < 55) {
            System.out.println(t);
            t += 2;
            i++;
        }
    }
}
