package oca.chapter3continue.mushfiginkitabi;

public class Test {
    public static void main(String[] args) {

        String s = "1";
        String s1 = "2";
        s.concat(s1);  //assign olmadiqca 12 cap etmeyecekdir
        System.out.println(s1);

        String string = "Polad";
//        String aa = string.charAt(2) ;  GERIYE char qaytarir String yox...

        System.out.println(string.indexOf("xx")); // string de xx olmadigindan -1 qaytarir
    }


}
