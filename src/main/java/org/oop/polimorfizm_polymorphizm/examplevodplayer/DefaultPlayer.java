package org.oop.polimorfizm_polymorphizm.examplevodplayer;

public class DefaultPlayer extends VodPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing " + title + " on Default");
    }
}
