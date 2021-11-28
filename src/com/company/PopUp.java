package com.company;

import javax.swing.*;

public class PopUp extends JFrame {
    Game game;

    static final int WIDTH=300;
    static final int HEIGHT=200;

    PopUp(Game game){
        this.game=game;
        this.setSize(WIDTH,HEIGHT);
        this.setLocation(game.field.getX()+Game.WIDTH/2-WIDTH/2,game.field.getY()+Game.HEIGHT);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(true);


    }



}
