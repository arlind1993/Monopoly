package com.company;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    static int WIDTH=440;
    static int HEIGHT=440;
    static int XS=11;
    static int YS=11;
    static int sizeX=WIDTH/XS;
    static int sizeY=HEIGHT/YS;
    GamePanel(JLabel img, JLabel price, JLabel full){
        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setSize(WIDTH,HEIGHT);
        this.setLocation((MyScreenPanel.WIDTH/2-WIDTH/2),((MyScreenPanel.HEIGHT-PlayerPanel.HEIGHT)/2-HEIGHT/2));
        initialise(img,price,full);
    }

    private void initialise(JLabel img, JLabel price, JLabel full) {
        Pop pop=new Pop();
        this.add(pop);

        JLabel backgroundLabel=new JLabel();
        backgroundLabel.setBounds(sizeX,sizeY,WIDTH-2*sizeX,HEIGHT-2*sizeY);
        backgroundLabel.setBackground(new Color(200,225,250));
        backgroundLabel.setOpaque(true);
        this.add(backgroundLabel);


        JLabelCell []cells=new JLabelCell[(XS-1)*4];
        int pos=0;
        int link=0;
        for (int i = 0; i < YS; i++) {
            for (int j = 0; j < XS; j++) {
                if (((i==0)||(i==YS-1))||((j==0)||(j==XS-1))){
                    cells[pos]=new JLabelCell(j*sizeX,i*sizeY,sizeX,sizeY,pos);
                    if (i==YS-1){
                        cells[pos].relativePos=cells.length-pos-1;
                    }
                    else if (i==0){
                        cells[pos].relativePos=pos+20;
                    }else if (j==0){
                        cells[pos].relativePos=((pos+1)/-2)+25;
                    }else if (j==XS-1) {
                        cells[pos].relativePos=pos/2+25;
                    }
                    cells[pos].addMouseListener(new MyZoomMouseListener(img,price,full,cells[pos]));

                    this.add(cells[pos]);
                    pos++;
                }
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);


    }
}
