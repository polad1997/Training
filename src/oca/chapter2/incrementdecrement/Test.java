package oca.chapter2.incrementdecrement;

public class Test {

    public static void main(String[] args) {
        int count = 0;
        System.out.println(count++);  // post decrement -> bu zaman 0 i cap edir cunki
                                     // emeliyat count u cap  etdikden sora deyeri artirir
        System.out.println(count);
        System.out.println(++count);// pre increment -> bu zaman artirir cap edir deye 2 ni cap edir

        count = 0 ;
        System.out.println(count--);  //post decrement -> bu zaman 0 cap edur cunki
                                     // emeliyat count u cap  etdikden sora deyeri azaldir
        System.out.println(count);
        System.out.println(--count);// pre decrement -> azaldir sora deyeri cap edir

    }

}
