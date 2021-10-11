package com.company;

import javax.swing.*;
import java.awt.*;

public class Methods {

    static void pictureHandler(JLabelCell input,JLabel img){
        ImageIcon []icon=new ImageIcon[40];

        for (int i = 0; i < 40; i++) {
            icon[i]=new ImageIcon("icons/"+i+".png");
        }
        img.setIcon(icon[input.relativePos]);
    }
    static boolean isEqualToAny(int num, int[]array){
        boolean result=false;
        for (int element : array) {
            if (num==element){
                result=true;
                break;
            }
        }
        return result;
    }

    public static void priceHandler(JLabelCell actualCell, JLabel price) {
        //1,3,5,6,8,9,11,12,13,14,15,16,18,19,21,23,24,25,26,27,28,29,31,32,34,35,37,39
        switch (actualCell.relativePos){
            case 1: price.setText(String.valueOf(60)); break;
            case 3: price.setText(String.valueOf(60)); break;
            case 5: price.setText(String.valueOf(200)); break;
            case 6: price.setText(String.valueOf(100)); break;
            case 8: price.setText(String.valueOf(100)); break;
            case 9: price.setText(String.valueOf(120)); break;
            case 11: price.setText(String.valueOf(140)); break;
            case 12: price.setText(String.valueOf(150)); break;
            case 13: price.setText(String.valueOf(140)); break;
            case 14: price.setText(String.valueOf(160)); break;
            case 15: price.setText(String.valueOf(200)); break;
            case 16: price.setText(String.valueOf(180)); break;
            case 18: price.setText(String.valueOf(180)); break;
            case 19: price.setText(String.valueOf(200)); break;
            case 21: price.setText(String.valueOf(220)); break;
            case 23: price.setText(String.valueOf(220)); break;
            case 24: price.setText(String.valueOf(240)); break;
            case 25: price.setText(String.valueOf(200)); break;
            case 26: price.setText(String.valueOf(260)); break;
            case 27: price.setText(String.valueOf(260)); break;
            case 28: price.setText(String.valueOf(150)); break;
            case 29: price.setText(String.valueOf(280)); break;
            case 31: price.setText(String.valueOf(300)); break;
            case 32: price.setText(String.valueOf(300)); break;
            case 34: price.setText(String.valueOf(320)); break;
            case 35: price.setText(String.valueOf(200)); break;
            case 37: price.setText(String.valueOf(350)); break;
            case 39: price.setText(String.valueOf(400)); break;
        }
    }
}