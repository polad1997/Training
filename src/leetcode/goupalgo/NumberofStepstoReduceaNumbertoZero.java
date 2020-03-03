package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 2/24/2020 11:43
 */
public class NumberofStepstoReduceaNumbertoZero {

    public static void main(String[] args) {
        NumberofStepstoReduceaNumbertoZero o = new NumberofStepstoReduceaNumbertoZero();
        o.numberOfSteps(14);
    }

    public int numberOfSteps(int num) {
        int count = 0;
        while (num > 0) {

            if (num % 2 != 0) {
                num = num - 1;
                count++;
                if (num == 0) break;
            }

            num = num / 2;
            count++;
        }
        return count;
    }

}
