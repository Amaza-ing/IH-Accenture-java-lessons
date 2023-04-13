package com.ironhack.w1.d4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new WebPlayer(0.5, 1);
        WebPlayer webPlayer = new WebPlayer(0.3, 2);

        System.out.println(player.getCurrentTrack());
        System.out.println(webPlayer.getCurrentTrack());
        player.close();

        AndroidPlayer androidPlayer = new AndroidPlayer(0.8, 3);
        IPlayable androidPlayer2 = new AndroidPlayer(0.5, 4);
        androidPlayer.close();
        androidPlayer.play();
        androidPlayer2.play();
//        androidPlayer2.close(); // esto no se puede hacer porque es de tipo IPlayable
    }
}
