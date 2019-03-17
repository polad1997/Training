package oca.chapter5.casting;

public class Lemur extends Pirmate implements HasTail {
    @Override
    public boolean isTailStripped() {
        return false;
    }

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        Object object = lemur;  // Object Lemurun subclassidir lemur objecte yerlesir
        Pirmate pirmate = lemur; // eynile object kimi cast a ehtiyac yoxdur
//        Lemur lemur1 = pirmate;  Bu zaman partdiyir cunku lemurun icine pirmate boyuk olacaq
        Lemur lemur1 = (Lemur) pirmate; // exp casting lazmdir


        Pirmate pirmate1 = new Pirmate();
        Lemur lemur2 = (Lemur) pirmate1;
        // ClassCasException tullayir cunnki Pirmate objectinin Lemur objectinnen
        //bir asililiqi yoxdur eksine ama mumkundur !
    }
}
