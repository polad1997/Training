package udemy.bootcamp.algosdatascructures;

public class Test {


    public static void main(String[] args) {
        int n1 = 15;
        int n2 = 3;
        String operation = "/";  //burada ki operation'u dynamic olaraq Scanner ile deise bilersen
        int result;

        if (operation.equals("*")) {
            result = n1 * n2;
        } else if (operation.equals("+")) {
            result = n1 + n2;
        }

    }

}
