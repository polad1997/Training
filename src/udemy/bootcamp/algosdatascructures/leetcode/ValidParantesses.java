package udemy.bootcamp.algosdatascructures.leetcode;

public class ValidParantesses {


    public static void main(String[] args) {
        String s = "((()";
        System.out.println(check(s));
    }


    public static boolean isValid() {


        return true;
    }


    public static boolean check(String s) {

        char[] arrayElements = s.toCharArray();

        char openningElements[] = {'{', '[', '('};
        char closedElements[] = {'}', ']', ')'};

        if (s.length() % 2 == 1) {
            return false;
        }

        for (int i = 0; i < openningElements.length; i++) {
            //verilen elementin ilk elementinin check edir
            for (int k = 0; k < arrayElements.length; k++) {

                if (arrayElements[k] == openningElements[i]) {

                    System.out.println("opening element -> " + openningElements[i]);
                    char similarElement = 0;

                    System.out.println("closed element -> " + closedElements[i]);

                    for (int j = k; j < arrayElements.length; j++) {
                        if (closedElements[i] == arrayElements[j]) {
                            similarElement = arrayElements[j];
                            System.out.println("similarElement for first -> " + similarElement);
                            break;
                        }
                        if ((j - 0) % 2 == 1) {
                            System.out.println("tek eded");


                        }
                    }

                    return true;
                }
                System.out.println(i + "" + k);
            }
        }

        return false;
    }
}
