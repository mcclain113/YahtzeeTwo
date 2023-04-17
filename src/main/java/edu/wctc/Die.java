package edu.wctc;

import java.util.Random;

public class Die {

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    private int faceValue;
    private int sides;
    private Random randomNumGen = new Random();

    public Die(int sides) {
        this.sides = sides;

    }

    public void rollDie(){
        faceValue = randomNumGen.nextInt(1, sides + 1);
    }
}
