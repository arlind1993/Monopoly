package com.company;

import javax.swing.*;
import java.awt.*;

public class Grid extends JLayeredPane {
    public Cell[] cells;
    int players;
    public Marking[] playerMarkings;
    static int WIDTH;
    static int HEIGHT;
    WatchScreen ws;
    MiddleScreen ms;
    public Grid(int players, WatchScreen ws) {
        this.ws=ws;
        this.setLayout(null);
        this.setBackground(new Color(20, 200, 200));
        WIDTH=11*Cell.SIZE;
        HEIGHT=11*Cell.SIZE;
        this.setSize(WIDTH,HEIGHT);
        this.setLocation(((Game.WIDTH-WatchScreen.WIDTH)/2-WIDTH/2),((Game.HEIGHT-PlayerPanel.HEIGHT)/2-HEIGHT/2));
        this.players=players;
        playerMarkings=new Marking[players];
        cells=new Cell[40];
        ms=new MiddleScreen();
        initialise();
    }

    private void initialise() {

        for (int i = 0; i < 40; i++) {
            int tx;
            int ty;
            if (i<10){
                tx=WIDTH-(i+1)*Cell.SIZE;
                ty=HEIGHT-Cell.SIZE;
            }else if (i<20){
                tx=0;
                ty=WIDTH-(i-9)*Cell.SIZE;
            }else if (i<30){
                tx=(i-20)*Cell.SIZE;
                ty=0;
            }else{
                tx=WIDTH-Cell.SIZE;
                ty=(i-30)*Cell.SIZE;
            }

            cells[i]=new Cell(tx,ty,i);
            cells[i].addMouseListener(new MyMouseListener(this,ws,cells[i]));
            this.add(cells[i],new Integer(1));
            switch (i){
                case 0: cells[i].price=
                        new Price(
                                200
                        ); break;
                case 1: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 2: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 3: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 4: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 5: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 6: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 7: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 8: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 9: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 10: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 11: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 12: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 13: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 14: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 15: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 16: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 17: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 18: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 19: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 21: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 22: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 23: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 24: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 25: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 26: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 27: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 28: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 29: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 30: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 31: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 32: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 33: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 34: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 35: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 36: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 37: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 38: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;
                case 39: cells[i].price=
                        new Price(
                                new int[]{60,50},
                                new int[]{}
                        ); break;

            }
        }

        for (int i = 0; i < 40; i++) {
            if (i==39){
                cells[i].setNext(cells[0]);
                break;
            }
            cells[i].setNext(cells[i+1]);
        }
        for (int i = 0; i < players; i++) {
            playerMarkings[i]=new Marking(i,this);
            this.add(playerMarkings[i],new Integer(2));
        }

        this.add(ms);

    }


}
