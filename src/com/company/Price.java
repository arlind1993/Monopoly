package com.company;

public class Price {

    boolean buyAble;
    int[] buyingPrices;
    int[] rentalPrices;

    boolean gainOrLosable;
    int gainOrLose;

    Price(){
        this.gainOrLosable=false;
        this.buyAble=false;
    }

    Price(int gainOrLose){
        this.gainOrLose=gainOrLose;
        this.gainOrLosable=true;
        this.buyAble=false;
    }

    Price(int[] buyingPrices, int[] rentalPrices){
        this.buyingPrices=buyingPrices;
        this.rentalPrices=rentalPrices;
        this.gainOrLosable=false;
        this.buyAble=true;
    }



}
