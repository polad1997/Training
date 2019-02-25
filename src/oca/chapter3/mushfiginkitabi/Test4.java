package oca.chapter3.mushfiginkitabi;

public class Test4 {
    public static void main(String[] args) {
        Boolean aBoolean = new Boolean(null);
        System.out.println(aBoolean);
        Boolean aBoolean1 = new Boolean("  True");
        System.out.println(aBoolean1);

        Float f = null;
        try {
            f = Float.valueOf("11");
            String s = f.toString();
            double d = Double.valueOf(s);
            System.out.println(d);
            int i = Integer.valueOf(s);
            System.out.println("d -> " + d + "    i ->" + i + "        f -> " + f + "         s->" + s);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.length());

        int[] array = new int[2];
       int XX = array.length;

    }
}
