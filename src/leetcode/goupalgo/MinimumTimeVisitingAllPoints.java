package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 3/3/2020 10:49
 */
public class MinimumTimeVisitingAllPoints {

    public static void main(String[] args) {

    }

    public int minTimeToVisitAllPoints(int[][] points) {

        int[] beginElements = points[0];
        int beginX = beginElements[0];
        int beginY = beginElements[1];

        int[] lastElements = points[points.length - 1];
        int lastX = lastElements[0];
        int lastY = lastElements[1];

        for (int i = 0; beginX != lastX && beginY != lastY; i++) {

//            if ()

        }
        return 0;

    }

}
