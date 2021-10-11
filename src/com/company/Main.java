package com.company;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Test");
        frame.setLayout(null);
        frame.setSize(MyScreenPanel.WIDTH+Control.WIDTH+15,MyScreenPanel.HEIGHT+40);
        WatchScreen wS=new WatchScreen();
        frame.getContentPane().add(wS);
        frame.getContentPane().add(new MyScreenPanel(wS.getImg(),wS.getPrice(),wS.getFull()));
        frame.getContentPane().add(new Control());

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
