package com.company;

import javax.swing.*;
import java.awt.*;

public class WatchScreen extends JPanel {

    static int HEIGHT=300;
    static int WIDTH=300;

    JLabel img;
    JLabel price;
    JLabel full;

    public WatchScreen(){
        this.setLayout(null);

        this.setBounds(Game.WIDTH-WIDTH,0,WIDTH,HEIGHT);
        this.setOpaque(false);
        initialise();
    }

    private void initialise() {
        img=new JLabel();
        img.setSize(180,260);
        img.setLocation(WIDTH/2-img.getWidth()/2,0);
        img.setOpaque(true);
        img.setVisible(false);
        this.add(img);

        price=new JLabel();
        price.setBounds(img.getX(),img.getHeight(),img.getWidth(),HEIGHT-img.getHeight());
        price.setOpaque(true);
        price.setVisible(false);
        price.setHorizontalAlignment(SwingConstants.CENTER);
        price.setBackground(Color.WHITE);
        this.add(price);

        full=new JLabel();
        full.setSize(260,260);
        full.setLocation(WIDTH/2-full.getWidth()/2,HEIGHT/2-full.getHeight()/2);
        full.setOpaque(true);
        full.setVisible(false);
        full.setBackground(Color.RED);
        this.add(full);
    }

    public JLabel getFull() {
        return full;
    }

    public JLabel getImg() {
        return img;
    }

    public JLabel getPrice() {
        return price;
    }
}
