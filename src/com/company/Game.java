package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JPanel implements ActionListener {
    Grid myGrid;
    public Game(){
        myGrid=new Grid(4);

        this.setPreferredSize(new Dimension(800,600));
        this.setBackground(new Color(200,225,250));
        this.addMouseListener(new MyMouseListener(myGrid));

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
