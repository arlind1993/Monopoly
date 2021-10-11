package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyScreenPanel extends JPanel implements ActionListener {
    static int WIDTH=800;
    static int HEIGHT=600;

    public MyScreenPanel(JLabel img, JLabel price, JLabel full) {

        this.setLayout(null);

        this.setBounds(0,0,WIDTH,HEIGHT);
        this.setBackground(new Color(200,225,250));
        this.add(new GamePanel(img,price,full));
        for (int i = 0; i < 4; i++) {
            this.add(new PlayerPanel(i*PlayerPanel.WIDTH,i+1));
        }
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
