package leetcode.goupalgo;

/**
 * @author PoladA
 * @Date&Time 2/25/2020 16:47
 */
public class CountNegativeNumbersinaSortedMatrix {

    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        CountNegativeNumbersinaSortedMatrix o = new CountNegativeNumbersinaSortedMatrix();
        o.countNegatives(grid);
    }

    public int countNegatives(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] < 0) count++;
            }
        }
        return count;
    }
}
