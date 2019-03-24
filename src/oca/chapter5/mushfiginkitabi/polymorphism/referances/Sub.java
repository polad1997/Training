package oca.chapter5.mushfiginkitabi.polymorphism.referances;

public class Sub extends Super implements MyInterface {
    public int var = 10;

    @Override
    public boolean interfaceMethod() {
        return false;
    }

    public static void main(String[] args) {
        Sub sub = new Sub();  //burada objecti oz referancesi uzerinden cagirir
        System.out.println(sub.var);

        MyInterface myInterface = sub;  // burada objecti impl edilen interface uzerinden cagirir
        System.out.println(myInterface.interfaceMethod());

        Super aSuper = sub;
        System.out.println(aSuper.superMethod()); //burada ise oz superclassi uzerinden cagirir
        Sub sub1 = (Sub) aSuper; //bu zaman downcasting gedir cunki boyuk objni kiciye castingsiz menimsede bilmerik
    }
}
