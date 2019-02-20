package oca.chapter3continue.mushfiginkitabi;

public class Equality {

    public static void main(String[] args) {
        String s1 = new String("Polad");
        String s2 = new String("Polad");

        System.out.println(s1 == s2);
        // -> False cunki ayri yaddaslara refer edirler

        System.out.println(s1.equals(s2));
        //  -> true cunki String in equals metodu
        //override olunmus metoddur ve objectlerin deyerlerini yoxlayir

        StringBuilder sb1 = new StringBuilder("Polad");
        StringBuilder sb2 = new StringBuilder("Polad");
        System.out.println(sb1.equals(sb2));  //String den ferqli olaraq StringBuilder
        // equals metodunu override etmir , Object classini extend edir deye
        // o metodu varis goturur bu zaman ise deyerler de eyni olsa bele
        //false qaytarir

        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        Integer integer3 = 1;
        int integer = 1;
        System.out.print(integer1 == integer2);
        System.out.println(integer1.equals(integer2));
        System.out.print(integer1 == integer3);
        System.out.println(integer1.equals(integer3));
        System.out.print(integer2 == integer);
        System.out.println(integer2.equals(integer));

    }

}
