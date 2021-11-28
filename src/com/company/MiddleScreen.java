package com.company;

import javax.swing.*;
import java.awt.*;

public class MiddleScreen extends JPanel {
    static int WIDTH = Grid.WIDTH-Cell.SIZE*2;
    static int HEIGHT = Grid.HEIGHT-Cell.SIZE*2;

    JLabel die1;
    JLabel die2;

    final int dieSize=60;
    MiddleScreen(){
        this.setLayout(null);
        this.setBounds(Cell.SIZE,Cell.SIZE,WIDTH,HEIGHT);

        die1=new JLabel();
        die1.setBackground(Color.WHITE);
        die1.setBounds(WIDTH/2-dieSize-dieSize/2,HEIGHT/2-dieSize/2,dieSize,dieSize);
        die1.setOpaque(true);

        die2=new JLabel();
        die2.setBackground(Color.WHITE);
        die2.setBounds(WIDTH/2+dieSize-dieSize/2,HEIGHT/2-dieSize/2,dieSize,dieSize);
        die2.setOpaque(true);

        this.add(die1);
        this.add(die2);


    }

    void reroll(int value1,int value2){
        if (value1>=1&&value1<=6&&value2>=1&&value2<=6) {
            ImageIcon icon1;
            icon1 = new ImageIcon("icons/d" + value1 + ".png");
            die1.setIcon(icon1);
            ImageIcon icon2;
            icon2 = new ImageIcon("icons/d" + value2 + ".png");
            die2.setIcon(icon2);
        }
    }

}
