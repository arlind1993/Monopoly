package com.company;

import javax.swing.*;

public class Field extends JFrame {
    public Field(){
        this.setResizable(false);
        this.setTitle("Monopoly");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(new Game());
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
}
}
