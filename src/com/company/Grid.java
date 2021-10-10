package com.company;

public class Grid {
    public Cell[] cells;
    int players;
    public Cell[] playerMarkings;

    public Grid(int players) {
        this.players=players;
        cells=new Cell[4*10];
        playerMarkings=new Cell[players];
        initialise();
    }

    private void initialise() {
        for (int i = 0; i < 40; i++) {
            cells[i].setBounds();
        }
    }

}
