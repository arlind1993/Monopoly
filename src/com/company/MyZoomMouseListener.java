package com.company;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyZoomMouseListener implements MouseListener {
    JLabelCell actualCell;
    JLabel img;
    JLabel price;
    JLabel full;


    public MyZoomMouseListener(JLabel img, JLabel price, JLabel full, JLabelCell actualCell) {
        this.img=img;
        this.price=price;
        this.full=full;

        this.actualCell=actualCell;
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

        if (Methods.isEqualToAny(actualCell.relativePos,
                new int[]{1,3,5,6,8,9,11,12,13,14,15,16,18,19,21,23,24,25,26,27,28,29,31,32,34,35,37,39})){
            Methods.pictureHandler(actualCell,img);
            img.setVisible(true);
            Methods.priceHandler(actualCell,price);
            price.setVisible(true);
        }else if(Methods.isEqualToAny(actualCell.relativePos,
                new int[]{2,4,7,17,22,33,36,38})){
            Methods.pictureHandler(actualCell,img);
            img.setVisible(true);
        }else if (Methods.isEqualToAny(actualCell.relativePos,
                new int[]{0,10,20,30})){
            Methods.pictureHandler(actualCell,full);
            full.setVisible(true);
        }

    }

    @Override
    public void mouseExited(MouseEvent e) {
        if (Methods.isEqualToAny(actualCell.relativePos,
                new int[]{1,3,6,8,9,11,13,14,18,19,21,23,24,26,27,29,31,32,34,37,39})){
            img.setVisible(false);
            price.setVisible(false);
        }else if(Methods.isEqualToAny(actualCell.relativePos,
                new int[]{2,4,5,7,12,15,17,22,25,28,33,35,36,38})){
            img.setVisible(false);
        }else if (Methods.isEqualToAny(actualCell.relativePos,
                new int[]{0,10,20,30})){
            full.setVisible(false);
        }
    }
}
