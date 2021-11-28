package com.company;

import javax.swing.*;
import java.awt.*;

public class ControllerScreen extends JPanel {
    static int HEIGHT=Game.HEIGHT-WatchScreen.HEIGHT-PlayerPanel.HEIGHT;
    static int WIDTH=WatchScreen.WIDTH;

    JButton rollDices;
    int dice1Value=0;
    int dice2Value=0;

    Game game;
    public ControllerScreen(Game game){
        this.game=game;

        this.setLayout(null);
        this.setBounds(Game.WIDTH-WIDTH,WatchScreen.HEIGHT,WIDTH,HEIGHT);
        this.setOpaque(false);

        initialise();

    }

    private void initialise() {
        rollDices=new JButton("Roll 2 Dices");
        rollDices.setBounds(10,5,100,20);
        rollDices.addActionListener(e -> {
            game.action.roll();
        });
        this.add(rollDices);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
