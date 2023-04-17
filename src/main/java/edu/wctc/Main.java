package edu.wctc;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    Game game = new Game();
        game.play();
        System.out.println("Die 1:" + game.getDieOne().getFaceValue());
        System.out.println("Die 2:" + game.getDieTwo().getFaceValue());
        System.out.println("Die 3:" + game.getDieThree().getFaceValue());
        System.out.println("Die 4:" + game.getDieFour().getFaceValue());
        System.out.println("Die 5:" + game.getDieFive().getFaceValue());
        System.out.println(game.getResult());

/*        for (int i = 1; i <= 100; i++) {
            game.play();
            System.out.println("Die 1:" + game.getDieOne().getFaceValue());
            System.out.println("Die 2:" + game.getDieTwo().getFaceValue());
            System.out.println("Die 3:" + game.getDieThree().getFaceValue());
            System.out.println("Die 4:" + game.getDieFour().getFaceValue());
            System.out.println("Die 5:" + game.getDieFive().getFaceValue());
            System.out.println(game.getResult());
        }*/

    }

}