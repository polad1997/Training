package oca.chapter2.mushfiginkitabi;


/**
 * str null dur  ,  case leri str ile muqayise zamani runtime vaxti
 * equals metodu cagrilir ve referans uzerinden equals cagrilanda
 * NullPointer verir
 *
 */
public class Test3 {
    public static void main(String[] args) {
        String str = null;
        switch (str) {
            case "null":
                System.out.println("1");
                break;
            case "":
                System.out.println("2");
                break;
            default:
                System.out.println("3");
        }
    }
}