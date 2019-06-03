package oca.enthuwaretests.test3;

public class Theerteen {
    public static void main(String[] args) throws Exception {
        Game g = new Soccer();
        // 1
        ((Soccer) g).play("asd");
        Soccer s = (Soccer) g;

    }

}

class Game {
    public void play() throws Exception {
        System.out.println("Playing...");
    }
}

class Soccer extends Game {
    public void play(String ball) {
        System.out.println("Playing Soccer with " + ball);
    }
}
