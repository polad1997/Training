package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 2/24/2020 15:00
 */
public class SubtracttheProductandSumofDigitsofanInteger {

    public static void main(String[] args) {
        SubtracttheProductandSumofDigitsofanInteger o = new SubtracttheProductandSumofDigitsofanInteger();
        o.subtractProductAndSum(234);
    }

    public int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;
        while (n >= 1) {
            product = product * (n % 10);
            sum = sum + (n % 10);
            n = n / 10;
        }
        return product - sum;
    }

}
