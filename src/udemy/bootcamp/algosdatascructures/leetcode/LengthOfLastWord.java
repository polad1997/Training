package udemy.bootcamp.algosdatascructures.leetcode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("sd "));
    }

    public static int lengthOfLastWord(String s) {
        char[] array = s.toCharArray();
        String e = " ";
        if (e.equals(s)) return 0;


        int count = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == ' ') {
                count = array.length - i - 1;
                if (array[i] == ' ' && i == array.length - 1) {
                    return array.length - 1;
                }
                break;
            } else if (array[i] != ' ') {
                if (i == 0) {
                    return array.length;
                }
            }

        }

        return count;
    }

}
