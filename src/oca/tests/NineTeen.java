package oca.tests;

public class NineTeen {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";
        String s3 = s2;
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("equals");
        }else{
            System.out.println("not equals");
        }
    }
}
