package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 3/3/2020 10:59
 */
public class Maximum69Number {

    public static void main(String[] args) {
        Maximum69Number o = new Maximum69Number();
        o.maximum69Number(6699);
    }

    public int maximum69Number(int num) {
        String numStr = String.valueOf(num);
        char[] numArray = numStr.toCharArray();
        int lengthOfNum = numStr.length();

        for (int i = 0; i < lengthOfNum; i++) {
            if (numArray[i] == '6') {
                numArray[i] = '9';
                break;
            }
        }
        String newNumStr = new String(numArray);
        return Integer.parseInt(newNumStr);
    }

}
