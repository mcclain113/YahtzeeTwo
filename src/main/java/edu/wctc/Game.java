package edu.wctc;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private String result;

    public String getResult() {
        return result;
    }

    private List<Die> ones = new ArrayList<>();
    private List<Die> twos = new ArrayList<>();
    private List<Die> threes = new ArrayList<>();
    private List<Die> fours = new ArrayList<>();
    private List<Die> fives = new ArrayList<>();
    private List<Die> sixes = new ArrayList<>();

    private Die dieOne = new Die(6);
    private Die dieTwo = new Die(6);
    private Die dieThree = new Die(6);

    public Die getDieOne() {
        return dieOne;
    }

    public Die getDieTwo() {
        return dieTwo;
    }

    public Die getDieThree() {
        return dieThree;
    }

    public Die getDieFour() {
        return dieFour;
    }

    public Die getDieFive() {
        return dieFive;
    }

    private Die dieFour = new Die(6);
    private Die dieFive = new Die(6);
public void clearLists(){
    ones.clear();
    twos.clear();
    threes.clear();
    fours.clear();
    fives.clear();
    sixes.clear();
}
    public void newRoll() {
        dieOne.rollDie();
        dieTwo.rollDie();
        dieThree.rollDie();
        dieFour.rollDie();
        dieFive.rollDie();
    }
    public void play(){
    clearLists();
    newRoll();
    addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        if (yahtzee()){
            result = "Yahtzee";
        }
        else if (fourOFAKind()){
            result = "Four of a Kind";
        }
        else if (fullHouse()){
            result = "Full House";
        }
        else if (threeOFAKind()){
            result = "Three of a Kind";
        }
        else if (twoPair()){
            result = "Two Pair";
        }
        else if (onePair()){
            result = "One Pair";
        }
        else{
            result = "One of a Kind";
        }

    }

    public boolean yahtzee(){
        if (ones.size() == 5 || twos.size() == 5 || threes.size() == 5 || fours.size() == 5 || fives.size() ==5 || sixes.size() ==5)
            return true;
        else
            return false;
    }

    public boolean fourOFAKind(){
        if (ones.size() == 4 || twos.size() == 4 || threes.size() == 4 || fours.size() == 4 || fives.size() ==4 || sixes.size() ==4)
            return true;
        else
            return false;
    }

    public boolean fullHouse(){
        if ((ones.size() == 3 || twos.size() == 3 || threes.size() == 3 || fours.size() == 3 || fives.size() == 3 || sixes.size() ==3) && (ones.size() == 2 || twos.size() == 2 || threes.size() == 2 || fours.size() == 2 || fives.size() == 2 || sixes.size() ==2))
            return true;
        else
            return false;
    }
    public boolean threeOFAKind(){
        if ((ones.size() == 3 || twos.size() == 3 || threes.size() == 3 || fours.size() == 3 || fives.size() == 3 || sixes.size() ==3) && !(ones.size() == 2 || twos.size() == 2 || threes.size() == 2 || fours.size() == 2 || fives.size() == 2 || sixes.size() ==2))
            return true;
        else
            return false;
    }
    public boolean twoPair(){
        if ((ones.size() == 2 && twos.size() == 2) || (ones.size() == 2 && threes.size() == 2) || (ones.size() == 2 && fours.size() == 2) || (ones.size() == 2 && fives.size() == 2) || (ones.size() == 2 && sixes.size() == 2) ||
                (twos.size() == 2 && threes.size() == 2) || (twos.size() == 2 && fours.size() == 2) || (twos.size() == 2 && fives.size() == 2) || (twos.size() == 2 && sixes.size() == 2) ||
                (threes.size() == 2 && fours.size() == 2) || (threes.size() == 2 && fives.size() == 2) || (threes.size() == 2 && sixes.size() == 2) ||
                (fours.size() == 2 && fives.size() == 2) || (fours.size() == 2 && sixes.size() == 2) ||
                (fives.size() == 2 && sixes.size() == 2)
        )
            return true;
        else
            return false;
    }
    public boolean onePair(){
        if ((ones.size() == 2 || twos.size() == 2 || threes.size() == 2 || fours.size() == 2 || fives.size() == 2 || sixes.size() == 2)
                && !(twoPair())
        )
            return true;
        else
            return false;

    }


    public void addToDieListCount(Die dieOne, Die dieTwo, Die dieThree, Die dieFour, Die dieFive){
        if (dieOne.getFaceValue() == 1){
            ones.add(dieOne);

        }
        else if (dieOne.getFaceValue() == 2) {
            twos.add(dieOne);
        }
        else if (dieOne.getFaceValue() == 3) {
            threes.add(dieOne);
        }
        else if (dieOne.getFaceValue() == 4) {
            fours.add(dieOne);
        }
        else if (dieOne.getFaceValue() == 5) {
            fives.add(dieOne);
        }
        else if (dieOne.getFaceValue() == 6) {
            sixes.add(dieOne);
        }
        else{}

        if (dieTwo.getFaceValue() == 1){
            ones.add(dieTwo);
        }
        else if (dieTwo.getFaceValue() == 2) {
            twos.add(dieTwo);
        }
        else if (dieTwo.getFaceValue() == 3) {
            threes.add(dieTwo);
        }
        else if (dieTwo.getFaceValue() == 4) {
            fours.add(dieTwo);
        }
        else if (dieTwo.getFaceValue() == 5) {
            fives.add(dieTwo);
        }
        else if (dieTwo.getFaceValue() == 6) {
            sixes.add(dieTwo);
        }
        else{}

        if (dieThree.getFaceValue() == 1){
            ones.add(dieThree);

        }
        else if (dieThree.getFaceValue() == 2) {
            twos.add(dieThree);
        }
        else if (dieThree.getFaceValue() == 3) {
            threes.add(dieThree);
        }
        else if (dieThree.getFaceValue() == 4) {
            fours.add(dieThree);
        }
        else if (dieThree.getFaceValue() == 5) {
            fives.add(dieThree);
        }
        else if (dieThree.getFaceValue() == 6) {
            sixes.add(dieThree);
        }
        else{}

        if (dieFour.getFaceValue() == 1){
            ones.add(dieFour);

        }
        else if (dieFour.getFaceValue() == 2) {
            twos.add(dieFour);
        }
        else if (dieFour.getFaceValue() == 3) {
            threes.add(dieFour);
        }
        else if (dieFour.getFaceValue() == 4) {
            fours.add(dieFour);
        }
        else if (dieFour.getFaceValue() == 5) {
            fives.add(dieFour);
        }
        else if (dieFour.getFaceValue() == 6) {
            sixes.add(dieFour);
        }
        else{}

        if (dieFive.getFaceValue() == 1){
            ones.add(dieFive);
        }
        else if (dieFive.getFaceValue() == 2) {
            twos.add(dieFive);
        }
        else if (dieFive.getFaceValue() == 3) {
            threes.add(dieFive);
        }
        else if (dieFive.getFaceValue() == 4) {
            fours.add(dieFive);
        }
        else if (dieFive.getFaceValue() == 5) {
            fives.add(dieFive);
        }
        else if (dieFive.getFaceValue() == 6) {
            sixes.add(dieFive);
        }
        else{}
    }
}
