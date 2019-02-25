package oca.chapter3.mushfiginkitabi;

public class Test5 {
    public static void main(String[] args) {
        int[] times[] = new int[3][3];
        for (int i = 0; i < times.length; i++) {
            for (int j = 0; j < times.length; j++) {
                times[i][j] = i*j;
            }
        }
        System.out.println(times[2][2]);
    }
}
