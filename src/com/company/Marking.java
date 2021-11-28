package com.company;

import javax.swing.*;
import java.awt.*;

public class Marking extends JPanel {
    static final int SIZE = 20;
    private int posX;
    private int posY;
    int id;
    Grid grid;

    int placeId;

    Marking(int id, Grid grid){
        this.grid=grid;
        this.id=id;
        placeId=0;
        this.setLayout(null);
        this.setOpaque(false);
        this.setSize(SIZE,SIZE);
        place();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        DrawingMethods.markingHandler(this,g);

    }

    void place(){
        for (int i = 0; i < 40; i++) {
            if(i==placeId) {
                posX = grid.cells[i].posX + (id % 2) * SIZE;
                posY = grid.cells[i].posY + (id / 2) * SIZE;
                this.setLocation(posX,posY);
            }
        }
        repaint();
    }



}
