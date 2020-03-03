package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 2/24/2020 14:41
 */
public class JewelsandStones {

    public static void main(String[] args) {

        JewelsandStones o = new JewelsandStones();
        o.numJewelsInStones("aA", "aAAbbbb");

    }

    public int numJewelsInStones2(String J, String S) {
        int count = 0;
        char[] jArray = J.toCharArray();
        char[] sArray = S.toCharArray();
        for (int i = 0; i <= jArray.length - 1; i++) {
            for (int j = 0; j <= sArray.length - 1; j++) {
                if (jArray[i] == sArray[j]) count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public int numJewelsInStones(String J, String S) {
        int count = 0;

        for (int i = 0; i < S.length(); i++) {
            if (J.contains(S.charAt(i) + "")) {
                count++;
            }
        }
        return count;
    }

}
