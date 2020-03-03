package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 3/3/2020 16:21
 */
public class ToLowerCase {

    public static void main(String[] args) {
        ToLowerCase o = new ToLowerCase();
        o.toLowerCase("ASDASDA");
    }

    public String toLowerCase(String str) {

        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 'A' && array[i] <= 'Z') {
                char c = array[i];
                array[i] = (char) (c + 32);
            }
        }
        return new String(array);

    }

}
