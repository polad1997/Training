package udemy.bootcamp.algosdatascructures.leetcode;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower","flow","floight"};
        System.out.println(longestCommonPrefix(arr));
    }
    public static String longestCommonPrefix(String[] array) {

        if (array.length == 0) {
            return "";
        }

        int min = array[0].length();
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() < min) {
                min = array[i].length();
            }
        }

        char[] charArray = new char[min];
        OUTER:
        for (int i = 0; i < min; i++) {
            char temp = array[0].charAt(i);
            for (int j = 0; j < array.length; j++) {
                if (array[j].charAt(i) != temp) {
                    break OUTER;
                }
            }
            charArray[i] = temp;

        }

        StringBuilder stringBuilder = new StringBuilder();
//        String s = Arrays.toString(charArray);
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != '\u0000') {
                stringBuilder.append(charArray[i]);
            }
        }
        return stringBuilder.toString();

    }
}
