package io.suryap.models;

public class Dice {
    int maxNumber;

    public Dice(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int rollDice(){
        double diceValue = 1 + Math.random() * this.maxNumber;
        return (int)diceValue;
    }
}
