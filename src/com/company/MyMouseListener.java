package com.company;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyMouseListener implements MouseListener {
    Grid grid;
    WatchScreen ws;
    Cell actCell;
    public MyMouseListener(Grid grid, WatchScreen ws, Cell actCell) {
        this.grid=grid;
        this.ws=ws;
        this.actCell=actCell;
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

        if (Methods.isEqualToAny(actCell.id,
                new int[]{1,3,5,6,8,9,11,12,13,14,15,16,18,19,21,23,24,25,26,27,28,29,31,32,34,35,37,39})){
            Methods.pictureHandler(actCell,ws.getImg());
            ws.getImg().setVisible(true);
            Methods.priceHandler(actCell,ws.getPrice());
            ws.getPrice().setVisible(true);
        }else if(Methods.isEqualToAny(actCell.id,
                new int[]{2,4,7,17,22,33,36,38})){
            Methods.pictureHandler(actCell,ws.getImg());
            ws.getImg().setVisible(true);
        }else if (Methods.isEqualToAny(actCell.id,
                new int[]{0,10,20,30})){
            Methods.pictureHandler(actCell,ws.getFull());
            ws.getFull().setVisible(true);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (Methods.isEqualToAny(actCell.id,
                new int[]{1,3,6,8,9,11,13,14,18,19,21,23,24,26,27,29,31,32,34,37,39,2,4,5,7,12,15,17,22,25,28,33,35,36,38})){
            ws.getImg().setVisible(false);
            ws.getPrice().setVisible(false);
        }else if (Methods.isEqualToAny(actCell.id,
                new int[]{0,10,20,30})){
            ws.getFull().setVisible(false);
        }
    }
}
