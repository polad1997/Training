package ocp.boyarski.enums;

/**
 * @author PoladA
 * @Date&Time 11/20/2019 11:46
 */

enum Season {

    WINTER("winter") {
        public void test() {
            System.out.println("winter test");
        }
    },

    SPRING("spring"), SUMMER("summer"), FALL("fall");


    private String s;

    private Season(String s) {
        this.s = s;
    }

    public void nameEnums() {
        System.out.println(s);
    }

    public void test() {
        System.out.println("default test");
    }


}

public class TestEnums {

    public static void main(String[] args) {
        Season s = Season.FALL;

        Season s1 = Season.valueOf("FALL");
        System.out.println(s);
        s1.test();

        Season.SPRING.nameEnums();

    }

}