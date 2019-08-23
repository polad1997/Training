package udemy.bootcamp.algosdatascructures.leetcode;

public class ImplementstrStr {

    public static void main(String[] args) {
        System.out.println(strStr("a", "a"));
        ;
    }


    //        for (int i = 0; i < needle.length(); i++) {
//            for (int j = 0; j < haystack.length(); j++) {
//
//
//                if (needle.charAt(i) == haystack.charAt(j)) {
//
//
//                        int indexNeedle = j;
//                    int indexHaystack = i;
//
//
//
//                    continue;
//
//
//                }
//
//            }
//        }
    public static int strStr(String haystack, String needle) {

        if (needle.length() == 0) return 0;
        if (haystack.equalsIgnoreCase(needle)) return 0;
        for (int i = 0; i < haystack.length() - needle.length(); i++) {
            int j = 0;
            if (haystack.charAt(i) == needle.charAt(0)) {
                while (j < needle.length()) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) break;
                    j++;
                }
                return i;
            }
        }

        return -1;
    }
}
