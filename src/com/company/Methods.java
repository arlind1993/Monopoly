package com.company;

import javax.swing.*;

public class Methods {
    static void pictureHandler(Cell input, JLabel img){
        ImageIcon []icon=new ImageIcon[40];

        for (int i = 0; i < 40; i++) {
            icon[i]=new ImageIcon("icons/"+i+".png");
        }
        img.setIcon(icon[input.id]);
    }

    static void dieHandler(JLabel img, int value){
        ImageIcon icon;
        icon=new ImageIcon("icons/d"+value+".png");
        img.setIcon(icon);
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

    public static void priceHandler(Cell actualCell, JLabel price) {
        //1,3,5,6,8,9,11,12,13,14,15,16,18,19,21,23,24,25,26,27,28,29,31,32,34,35,37,39
        switch (actualCell.id){
            case 1: price.setText("$"+(60)); break;
            case 3: price.setText("$"+(60)); break;
            case 5: price.setText("$"+(200)); break;
            case 6: price.setText("$"+(100)); break;
            case 8: price.setText("$"+(100)); break;
            case 9: price.setText("$"+(120)); break;
            case 11: price.setText("$"+(140)); break;
            case 12: price.setText("$"+(150)); break;
            case 13: price.setText("$"+(140)); break;
            case 14: price.setText("$"+(160)); break;
            case 15: price.setText("$"+(200)); break;
            case 16: price.setText("$"+(180)); break;
            case 18: price.setText("$"+(180)); break;
            case 19: price.setText("$"+(200)); break;
            case 21: price.setText("$"+(220)); break;
            case 23: price.setText("$"+(220)); break;
            case 24: price.setText("$"+(240)); break;
            case 25: price.setText("$"+(200)); break;
            case 26: price.setText("$"+(260)); break;
            case 27: price.setText("$"+(260)); break;
            case 28: price.setText("$"+(150)); break;
            case 29: price.setText("$"+(280)); break;
            case 31: price.setText("$"+(300)); break;
            case 32: price.setText("$"+(300)); break;
            case 34: price.setText("$"+(320)); break;
            case 35: price.setText("$"+(200)); break;
            case 37: price.setText("$"+(350)); break;
            case 39: price.setText("$"+(400)); break;
        }
    }
}
