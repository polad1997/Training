package udemy.bootcamp.algosdatascructures.fibonacci;

public class Fibonacci {

    public static void main(String[] args) {

        System.out.println(getFibonacciNumber(8));
        System.out.println(getFibonacciNumberRec(6));
    }

    public static int getFibonacciNumber(int n) {
        int previous1 = 1, previous2 = 0;
        int current = 1;

        for (int i = 0; i < n; i++) {

            current = previous1 + previous2;
            previous2 = previous1;
            previous1 = current;

        }

        return current;
    }

    public static int getFibonacciNumberRec(int n) {
        if (n < 2) {
            return 1;
        }
        return getFibonacciNumberRec(n - 1) + getFibonacciNumberRec(n - 2);
    }

}
