package com.company;

import javax.swing.*;
import java.awt.*;

public class Pop extends JPanel{
    static int WIDTH=GamePanel.WIDTH;
    static int HEIGHT=GamePanel.WIDTH;

    Pop(){
        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBounds(0,0,WIDTH,HEIGHT);
        this.setOpaque(false);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.drawOval(0,0,20,20);
    }
}
