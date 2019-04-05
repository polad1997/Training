package oca.chapter5.mushfiginkitabi.interfaces.test;

public interface Test2 extends Test1 {

    /**
     * default metodu olan bir interfaceni
     * extends eden diger interdace
     * hemen metodu override etmelidir
     * ve bu zaman onu default yox abstract da ede biler
     */

    @Override
    abstract int count();
}
