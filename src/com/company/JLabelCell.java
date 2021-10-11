package com.company;

import javax.swing.*;
import java.awt.*;

public class JLabelCell extends JPanel {
    int x;
    int y;
    int sizeX;
    int sizeY;
    int pos;
    int relativePos;
    boolean[] marks;
    int claimedBPlayer;

    public JLabelCell(int x, int y, int sizeX, int sizeY, int pos){
        this.y=y;
        this.x=x;
        this.sizeX=sizeX;
        this.sizeY=sizeY;
        this.pos=pos;
        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBounds(x,y,sizeX,sizeY);
        this.setBackground(new Color(200,225,250));
        initialise();
    }
    void  initialise(){
        claimedBPlayer=0;
        marks=new boolean[4];
        for (int i = 0; i < marks.length; i++) {
            marks[i]=false;
        }
    }


    public void setMarks(boolean[] marks) {
        this.marks = marks;
    }

    public boolean[] getMarks() {
        return marks;
    }

    public void setClaimedBPlayer(int claimedBPlayer) {
        this.claimedBPlayer = claimedBPlayer;
    }

    public int getClaimedBPlayer() {
        return claimedBPlayer;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        DrawingMethods.spaceHandler(this,g);

    }


}
