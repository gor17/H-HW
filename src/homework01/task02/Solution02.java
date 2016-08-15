package homework01.task02;

/*
* 2. Найти среди 3-х чисел максимальное и минимальное
*/
public class Solution02 {

    public static void main(String[] args) {

        int[] myArray = new int[]{100, 8, 1500};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < 3; i++) {
            if (myArray[i] < min) {
                min = myArray[i];
            } else if (myArray[i] > max) {
                max = myArray[i];
            }
        }
        System.out.println("Минимальное значение " + min);
        System.out.println("Максимальное значение " + max);
    }
}
