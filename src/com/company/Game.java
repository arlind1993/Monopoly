package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  Game extends JPanel implements ActionListener {
    Field field;

    Grid myGrid;
    WatchScreen ws;
    PlayerPanel[] playerPanels;
    ControllerScreen cs;
    ActionHappening action;

    static final int WIDTH=800;
    static final int HEIGHT=600;

    public Game(Field field){
        this.field=field;

        playerPanels=new PlayerPanel[4];
        ws=new WatchScreen();
        myGrid=new Grid(4,ws);
        cs=new ControllerScreen(this);
        action=new ActionHappening(this);
        this.setLayout(null);
        this.setPreferredSize(new Dimension(WIDTH,HEIGHT));
        this.setBackground(new Color(200,225,250));
        this.add(myGrid);
        for (int i = 0; i < playerPanels.length; i++) {
            playerPanels[i]=new PlayerPanel(i*PlayerPanel.WIDTH,i+1);
            this.add(playerPanels[i]);
        }
        this.add(ws);
        this.add(cs);
        Timer timer=new Timer(1000,this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        draw(g);
    }

    private void draw(Graphics g) {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
