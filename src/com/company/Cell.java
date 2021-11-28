package com.company;

import javax.swing.*;
import java.awt.*;

public class Cell extends JPanel {
    static int SIZE=40;
    Cell next;

    int id;
    int posX;
    int posY;

    ImageIcon icon;

    Price price;

    Cell(int posX,int posY,int id){
        this.id=id;
        this.posX=posX;
        this.posY=posY;
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        this.setSize(SIZE,SIZE);
        this.setLocation(posX,posY);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        icon=new ImageIcon("icons/"+id+".png");

        //JLabel label=new JLabel(id+"");
        //label.setBounds(0,0,SIZE,SIZE);
        //label.setOpaque(true);
        //this.add(label);
    }


    public void setNext(Cell next) {
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        DrawingMethods.spaceHandler(this,g);

    }
}
