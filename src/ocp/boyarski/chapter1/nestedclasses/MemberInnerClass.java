package ocp.boyarski.chapter1.nestedclasses;

/**
 * @author PoladA
 * @Date&Time 11/20/2019 17:37
 */
public class MemberInnerClass {

    /**
     * private , public , protected ola biler
     * can extend and implement
     * abstract or final
     * can access the outer class + private members
     */

    public static void main(String[] args) {

    }

    public void callInter() {

        MemberInnerClass o = new MemberInnerClass();
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();

    }

    public class A {

        private class B {

            public class C {

            }

        }

    }


}
