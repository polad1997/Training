package oca.chapter1.initializationofvariables;


/**
 * LOCAL variablenin by default qiymeti olmadigindan mutleq sekilde initialize olunmalidir
 * lakin GLOBAL variablenin by default qiymetleri vardir , initialize etmesende olar
 */
public class Test {

    int onlyAnswer; // GLOBAL oldugundan by default 0 dir

    public static void main(String[] args) {
        Test test = new Test();
        test.findAnswer(false);
    }

    public void findAnswer(boolean bool) {
        int answer;
        if (bool) {
            answer = 1;
            onlyAnswer = 2;
        } else {
            answer = 3;
        }
        System.out.println(answer);

        /**
         * bool dan asili olmayaraq asaqidaki variableni initialize etmeliyem
         */
        System.out.println(onlyAnswer);    //COMPILE ERROR -> LOCAL
                                          //SUCCESSFUL -> GLOBAL
        System.out.println(bool);

    }

}
