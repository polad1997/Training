package oca.chapter4.mushfiginkitabi.accesmodifiers.child;

import oca.chapter4.mushfiginkitabi.accesmodifiers.father.Father;

public class Child extends Father {
    String nameChild = "child";

    public static void main(String[] args) {
        Child child = new Child();
        child.nameFather = "asd";  // -> protected -> sub class
        Father father = new Father();
//        father.methodFather  Compile error cunki subclass da esas classin objectini
//            yaratdiqdan sonra o reference ile cagira bilmezsen
    }

}
