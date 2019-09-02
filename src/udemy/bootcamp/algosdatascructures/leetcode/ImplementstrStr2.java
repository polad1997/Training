package udemy.bootcamp.algosdatascructures.leetcode;

public class ImplementstrStr2 {

    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack == null || needle == null)
            return 0;

        if (needle.length() == 0)
            return 0;


        OUTER:
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() > haystack.length())
                return -1;

            int m = i;

            INNER:
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(m)) {
                    if (j == needle.length() - 1) {
                        return i;
                    }
                    m++;
                } else {
                    break INNER;
                }

            }
        }

        return -1;
    }
}
