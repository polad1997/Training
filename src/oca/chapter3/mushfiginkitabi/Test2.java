package oca.chapter3.mushfiginkitabi;

public class Test2 {

    public static void main(String[] args) {

        String str1 = "Polad";
        String str2 = "Polad";
        String str3 = "Polad";
        String str4 = "Polad";
        System.out.println(str1 == str2); //String poolda literal yaranan objectdir ve hamisi beraberdir

        String newStr1 = str1.replace('o', 'o');
        System.out.println(newStr1 == str1);   //Bu zaman deyisilen char eynidir true qaytaracaq

        String newStr2 = str2.replace('P', 'p');
        String newStr3 = str3.replace('P', 'p');
        System.out.println(newStr2 == newStr3);  //deyisen char ferqlidir , object de ferqli olacaq false qaytarir

        StringBuilder stringBuilder = new StringBuilder("Polad");
        System.out.println(stringBuilder.insert(2, true)); //Potruelad
        System.out.println(stringBuilder.insert(2, "xxxxx", 2, 3)); //Poxtruelad


    }
}
