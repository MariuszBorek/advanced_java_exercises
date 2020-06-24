package org.oop.polimorfizm_polymorphizm.examplevodplayer;

public class AndroidTV {
    public static void main(String[] args) {
        final String player = args[0];
        VodPlayer vodPlayer;

        if(player.equals("Netflix")) {
            vodPlayer = new NetflixPlayer();
        } else if(player.equals("HBO")) {
            vodPlayer = new HBOGoPlayer();
        } else {
            vodPlayer = new DefaultPlayer();
        }
        playEpisode(vodPlayer, "GOT_S1E1"); // metoda przyjmuje zmienna typu VodPlayer, która może mieć rózne implementacje
    }

    static void playEpisode(VodPlayer vodPlayer, String title) {
        // nie wiemy z jaką implementacją mamy do czynienia
        vodPlayer.play(title);
    }
}
