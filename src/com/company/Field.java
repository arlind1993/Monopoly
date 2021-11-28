package com.company;

import javax.swing.*;

public class Field extends JFrame {
    Game g=new Game(this);
    public Field(){
        this.setResizable(false);
        this.setTitle("Monopoly");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(g);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
