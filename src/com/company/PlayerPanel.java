package com.company;

import javax.swing.*;
import java.awt.*;

public class PlayerPanel extends JPanel{
    static int WIDTH=200;
    static int HEIGHT=80;

    int player;

    JLabel name;
    JLabel money;

    private int moneyValue=1500;

    int dice;

    public PlayerPanel(int x, int player){
        this.getParent();
        this.player=player;
        this.setLayout(null);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.setBounds(x,Game.HEIGHT-HEIGHT,WIDTH,HEIGHT);
        this.setBackground(Color.WHITE);
        initialise();
    }

    private void initialise() {
        name=new JLabel("Player "+player);
        name.setBounds(0,0,WIDTH,HEIGHT/2);
        //name.setOpaque(true);
        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setVerticalAlignment(SwingConstants.CENTER);
        name.setBorder(null);
        this.add(name);

        money=new JLabel("Money "+moneyValue);
        money.setBounds(0,HEIGHT/2,WIDTH,HEIGHT/2);
        //money.setOpaque(true);
        money.setHorizontalAlignment(SwingConstants.CENTER);
        money.setVerticalAlignment(SwingConstants.CENTER);
        money.setBorder(null);
        this.add(money);
    }

    public void setMoneyValue(int moneyValue) {
        this.moneyValue = moneyValue;
        money.setText("Money "+moneyValue);
    }

    public void setDice(int dice) {
        this.dice = dice;
    }

    public int getDice() {
        return dice;
    }

    public int getMoneyValue() {
        return moneyValue;
    }
}
