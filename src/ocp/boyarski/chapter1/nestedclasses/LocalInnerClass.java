package ocp.boyarski.chapter1.nestedclasses;

/**
 * @author PoladA
 * @Date&Time 11/21/2019 11:22
 */
public class LocalInnerClass {

    /**
     * Local inner classlarin access modifiersi olmur
     * static olmurlar ve staticin daxilinde yer almirlar
     * classdaki butun memberlere accesi var
     * anonymous class da effective final yazilmis ve ya effective final deyiseni cagirmaq lazimdir
     */

    private int length = 5;

    public static void main(String[] args) {
        LocalInnerClass o = new LocalInnerClass();
        o.localMethod();
    }

    public void localMethod() {

        final int width = 30;

        class LocalInner {
            public void multiply() {
                System.out.println(length * width);
            }
        }

        LocalInner localInner = new LocalInner();
        localInner.multiply();

    }


}
