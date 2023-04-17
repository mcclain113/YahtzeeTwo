package edu.wctc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {
    private Game game;
    private List<Die> ones = new ArrayList<>();
    private List<Die> twos = new ArrayList<>();
    private List<Die> threes = new ArrayList<>();
    private List<Die> fours = new ArrayList<>();
    private List<Die> fives = new ArrayList<>();
    private List<Die> sixes = new ArrayList<>();

    private Die dieOne = new Die(6);
    private Die dieTwo = new Die(6);
    private Die dieThree = new Die(6);
    private Die dieFour = new Die(6);
    private Die dieFive = new Die(6);

    private String result;

    @BeforeEach
    public void setup() {
        game = new Game();
    }
    @Test
    public String testPlay() {
        game.clearLists();
        game.newRoll();
        game.addToDieListCount(dieOne, dieTwo, dieThree, dieFour, dieFive);
        game.yahtzee();
        game.fourOFAKind();
        game.threeOFAKind();
        game.fullHouse();
        game.twoPair();
        game.onePair();
        //game.oneOfAKind();
        return result;
    }

    @Test
    public void clearLists(){
        dieOne.setFaceValue(1);
        dieTwo.setFaceValue(1);
        dieThree.setFaceValue(1);
        dieFour.setFaceValue(1);
        dieFive.setFaceValue(1);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        game.clearLists();
        int sum = 0;
        sum =+ ones.size();
        sum =+ twos.size();
        sum =+ threes.size();
        sum =+ fours.size();
        sum =+ fives.size();
        assertEquals(0,sum);
    }
    @Test
    public void yahtzee(){
        dieOne.setFaceValue(1);
        dieTwo.setFaceValue(1);
        dieThree.setFaceValue(1);
        dieFour.setFaceValue(1);
        dieFive.setFaceValue(1);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.yahtzee());
        game.clearLists();
        dieOne.setFaceValue(2);
        dieTwo.setFaceValue(2);
        dieThree.setFaceValue(2);
        dieFour.setFaceValue(2);
        dieFive.setFaceValue(2);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.yahtzee());
        game.clearLists();
        dieOne.setFaceValue(3);
        dieTwo.setFaceValue(3);
        dieThree.setFaceValue(3);
        dieFour.setFaceValue(3);
        dieFive.setFaceValue(3);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.yahtzee());
        game.clearLists();
        dieOne.setFaceValue(4);
        dieTwo.setFaceValue(4);
        dieThree.setFaceValue(4);
        dieFour.setFaceValue(4);
        dieFive.setFaceValue(4);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.yahtzee());
        game.clearLists();
        dieOne.setFaceValue(5);
        dieTwo.setFaceValue(5);
        dieThree.setFaceValue(5);
        dieFour.setFaceValue(5);
        dieFive.setFaceValue(5);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.yahtzee());
        game.clearLists();
        dieOne.setFaceValue(6);
        dieTwo.setFaceValue(6);
        dieThree.setFaceValue(6);
        dieFour.setFaceValue(6);
        dieFive.setFaceValue(6);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.yahtzee());
        game.clearLists();
        dieOne.setFaceValue(1);
        dieTwo.setFaceValue(2);
        dieThree.setFaceValue(3);
        dieFour.setFaceValue(4);
        dieFive.setFaceValue(5);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(false,game.yahtzee());
    }

    @Test
    public void fourOFAKind(){
        dieOne.setFaceValue(1);
        dieTwo.setFaceValue(1);
        dieThree.setFaceValue(1);
        dieFour.setFaceValue(1);
        dieFive.setFaceValue(5);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.fourOFAKind());
        game.clearLists();
        dieOne.setFaceValue(4);
        dieTwo.setFaceValue(2);
        dieThree.setFaceValue(2);
        dieFour.setFaceValue(2);
        dieFive.setFaceValue(2);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.fourOFAKind());
        game.clearLists();
        dieOne.setFaceValue(3);
        dieTwo.setFaceValue(3);
        dieThree.setFaceValue(5);
        dieFour.setFaceValue(3);
        dieFive.setFaceValue(3);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.fourOFAKind());
        game.clearLists();
        dieOne.setFaceValue(4);
        dieTwo.setFaceValue(3);
        dieThree.setFaceValue(4);
        dieFour.setFaceValue(4);
        dieFive.setFaceValue(4);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.fourOFAKind());
        game.clearLists();
        dieOne.setFaceValue(1);
        dieTwo.setFaceValue(5);
        dieThree.setFaceValue(5);
        dieFour.setFaceValue(5);
        dieFive.setFaceValue(5);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.fourOFAKind());
        game.clearLists();
        dieOne.setFaceValue(6);
        dieTwo.setFaceValue(5);
        dieThree.setFaceValue(6);
        dieFour.setFaceValue(6);
        dieFive.setFaceValue(6);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(true,game.fourOFAKind());
        game.clearLists();
        dieOne.setFaceValue(1);
        dieTwo.setFaceValue(2);
        dieThree.setFaceValue(3);
        dieFour.setFaceValue(4);
        dieFive.setFaceValue(5);
        game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
        assertEquals(false,game.fourOFAKind());
    }
        @Test
        public void fullHouse(){
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(1);
            dieThree.setFaceValue(1);
            dieFour.setFaceValue(2);
            dieFive.setFaceValue(2);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(3);
            dieFive.setFaceValue(2);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(5);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(3);
            dieFive.setFaceValue(3);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(4);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(4);
            dieFour.setFaceValue(3);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(5);
            dieFive.setFaceValue(1);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(6);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(6);
            dieFive.setFaceValue(6);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.fullHouse());
    }
        @Test
        public void threeOfAKind(){
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(1);
            dieThree.setFaceValue(1);
            dieFour.setFaceValue(5);
            dieFive.setFaceValue(2);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(5);
            dieFive.setFaceValue(2);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(5);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(1);
            dieFour.setFaceValue(3);
            dieFive.setFaceValue(3);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(4);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(6);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(5);
            dieFive.setFaceValue(1);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(6);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(6);
            dieFive.setFaceValue(6);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.threeOFAKind());

    }
        @Test
        public void twoPair(){
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(1);
            dieThree.setFaceValue(2);
            dieFour.setFaceValue(2);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(3);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(1);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(5);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(6);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(1);
            dieFour.setFaceValue(6);
            dieFive.setFaceValue(1);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(6);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(6);
            dieFive.setFaceValue(1);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.twoPair());

        }
        @Test
        public void onePair(){
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(1);
            dieThree.setFaceValue(2);
            dieFour.setFaceValue(3);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.onePair());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.onePair());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(1);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.onePair());
            game.clearLists();
            dieOne.setFaceValue(3);
            dieTwo.setFaceValue(5);
            dieThree.setFaceValue(6);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(4);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.onePair());
            game.clearLists();
            dieOne.setFaceValue(2);
            dieTwo.setFaceValue(6);
            dieThree.setFaceValue(5);
            dieFour.setFaceValue(6);
            dieFive.setFaceValue(1);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.onePair());
            game.clearLists();
            dieOne.setFaceValue(6);
            dieTwo.setFaceValue(3);
            dieThree.setFaceValue(2);
            dieFour.setFaceValue(1);
            dieFive.setFaceValue(6);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(true,game.onePair());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.onePair());

    }
        @Test
        public void oneOfAKind(){
        //see negative test on each previous tests (duplicated below)
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.twoPair());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.yahtzee());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.fourOFAKind());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.threeOFAKind());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.fullHouse());
            game.clearLists();
            dieOne.setFaceValue(1);
            dieTwo.setFaceValue(2);
            dieThree.setFaceValue(3);
            dieFour.setFaceValue(4);
            dieFive.setFaceValue(5);
            game.addToDieListCount(dieOne,dieTwo,dieThree,dieFour,dieFive);
            assertEquals(false,game.onePair());
            game.clearLists();
    }

}
