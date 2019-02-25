package oca.chapter4.protectedsamples.swan;

import oca.chapter4.protectedsamples.bird.Bird;

class Swan extends Bird {
    public static void main(String[] args) {

    }

    protected void methodSwan() {
        birdMethod();

        Bird bird = new Bird();

        /**
         * protected methodlar da  inheritance varsa methdda birbasa catmaq olar
         * object yaradib hemen metodu cagirmaq olmur Compile error verir
         */
    }

}
