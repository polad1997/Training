package oca.enthuwaretests.test2;

import java.util.Arrays;

public class FiftyOne {
    public static void main(String[] args) {
        FiftyOne fiftyOne = new FiftyOne() ;
        fiftyOne.getObject();
    }
    public Object getObject() {
        Object obj = new String("aaaaa");   //1
        Object objArr[] = new Object[1]; //2
        System.out.println(Arrays.toString(objArr));
        objArr[0] = obj; //3
        obj = null;      //4
        objArr[0] = null;//5
        return obj;      //6
    }
}