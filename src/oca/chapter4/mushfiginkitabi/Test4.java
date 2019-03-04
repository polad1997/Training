package oca.chapter4.mushfiginkitabi;

public class Test4 {
    public static void main(String[] args) {

    }

    static {
        new Test4();
    }

    static {
        add(4);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    Test4() {
        add(3);
    }

    static {
        add(5);
    }

    {
        add(1);
    }

    {
        add(2);
    }
}
