package org.oop.polimorfizm_polymorphizm.examplevodplayer;

public class HBOGoPlayer extends VodPlayer {
    @Override
    public void play(String title) {
        System.out.println("Playing " + title + " on HBO");
    }
}
