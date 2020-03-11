package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 3/11/2020 10:50
 */
public class DecryptStringfromAlphabettoIntegerMapping {

    public static void main(String[] args) {
        DecryptStringfromAlphabettoIntegerMapping o = new DecryptStringfromAlphabettoIntegerMapping();
        o.freqAlphabets("10#11#12");
    }


    public String freqAlphabets(String s) {

        StringBuilder result = new StringBuilder();
        int number;
        for (int i = 0; i < s.length(); i++) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                number = Integer.parseInt(s.substring(i, i + 2));

                result.append((char) (number + 96));
                i = i + 2;
            } else {
                number = Integer.parseInt(s.substring(i, i + 1));
                result.append((char) (number + 96));
            }
        }
        return result.toString();
    }
}
