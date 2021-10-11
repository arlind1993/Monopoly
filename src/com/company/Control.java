package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Control extends JPanel {
    static int HEIGHT=MyScreenPanel.HEIGHT-WatchScreen.HEIGHT;
    static int WIDTH=WatchScreen.WIDTH;

    JButton rollDices;

    public Control(){
        this.setLayout(null);

        this.setBounds(MyScreenPanel.WIDTH,WatchScreen.HEIGHT,WIDTH,HEIGHT);
        this.setBackground(Color.YELLOW);

        initialise();

    }

    private void initialise() {
        rollDices=new JButton("Roll 2 Dices");
        rollDices.setBounds(10,5,100,20);
        rollDices.addActionListener(e -> {
            int d1res= (int) (Math.random()*6)+1;
            int d2res= (int) (Math.random()*6)+1;
            System.out.println(d1res+";"+d2res);
        });
        this.add(rollDices);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

    }
}
