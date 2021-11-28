package com.company;

public class ActionHappening {
    Game game;
    int playerTurn=0;
    int same=0;
    PopUp actPopUp;

    ActionHappening(Game game){
        this.game=game;

    }

    void roll(){
        game.cs.dice1Value = (int) (Math.random() * 6) + 1;
        game.cs.dice2Value = (int) (Math.random() * 6) + 1;
        System.out.println(game.cs.dice1Value + ";" + game.cs.dice2Value);
        game.myGrid.ms.reroll(game.cs.dice1Value, game.cs.dice2Value);
        move();
        land();
        if (game.cs.dice1Value==game.cs.dice2Value){
            if (same == 2) {
                //goToJail();
                endTurn();
            }else {
                same++;
            }
        }else{
            endTurn();
        }
    }

    void land() {
        //actPopUp=new PopUp(game);

    }

    void move(){
        for (int i = 0; i < game.cs.dice1Value+game.cs.dice2Value; i++) {
            game.myGrid.playerMarkings[playerTurn].placeId=
                    game.myGrid.cells[game.myGrid.playerMarkings[playerTurn].placeId].next.id;
            for (Marking m : game.myGrid.playerMarkings) {
                m.place();
            }
        }
    }

    void endTurn(){
        same=0;
        if (playerTurn<3){
            playerTurn++;
        }else {
            playerTurn=0;
        }
    }
}
