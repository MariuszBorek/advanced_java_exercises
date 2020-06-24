package org.oop.polimorfizm_polymorphizm.examplevodplayer;

public class NetflixPlayer extends VodPlayer {
    @Override
    public void play(final String title) {
        System.out.println("Playing " + title + " on Netflix");
    }
}
