package ocp.boyarski.chapter1.nestedclasses;

/**
 * @author PoladA
 * @Date&Time 11/21/2019 14:38
 */
public class StaticNestedClass {

    /**
     * it is member level static class
     * member class dan ferqli olaraq , instantiate olanda outer classa ehtiyacc olmur
     * outer class olmadan instance var lara accessi yoxdur
     */

    static class Nested {
        private int price = 6;
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        System.out.println(nested.price);
    }

}
