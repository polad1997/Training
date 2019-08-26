package udemy.bootcamp.algosdatascructures.leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
        System.out.println(Integer.bitCount(1534236469));
    }

    public static int reverse(int x) {

        int sum = 0;
        int lastElement = 0;
        while (x / 10 != 0) {

            int reminder = x % 10;
            if (x % 10 == 0 && lastElement == 0) {
                x = x / 10;
                continue;
            }
            lastElement = x % 10;
            x = x / 10;
            sum = (sum * 10) + reminder;

        }
        sum = (sum * 10) + x;
        return sum;
    }
}
