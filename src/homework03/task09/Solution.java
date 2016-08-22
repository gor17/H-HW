package homework03.task09;

/*
- Перевести число в двоичную систему счисления
 */
public class Solution {

    public static void toBinary1Byte(int n) {

        String s = "";
        for (int i = 128; i >= 1; i = i / 2) {
            if (n / i > 0) {
                s += 1;
                n -= i;
            } else s += 0;
        }
        System.out.println(s);
    }

    public static void main(String[] args) {
        toBinary1Byte(127); //переводит число до 1 байта включительно в двоичную систему исчисления
    }
}
