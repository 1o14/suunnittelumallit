package assignment08;

import java.util.Random;

public class DiceGame extends Game {

    private int[] scores; // pelaajien pisteet
    private int numberOfPlayers; // pelaajien määrä
    private int winningScore = 20; // voittopisteet
    private int winner = -1; // voittajan indeksi

    @Override
    public void initializeGame(int numberOfPlayers) {
        // alustetaan peli
        this.numberOfPlayers = numberOfPlayers;
        scores = new int[numberOfPlayers]; // jokaiselle pelaajalle pisteet
        System.out.println("Dice Game started with " + numberOfPlayers + " players!");
    }

    @Override
    public boolean endOfGame() {
        // peli loppuu kun joku saa tarpeeksi pisteitä
        return winner != -1;
    }

    @Override
    public void playSingleTurn(int player) {
        // pelaaja heittää noppaa
        Random rand = new Random();
        int roll = rand.nextInt(6) + 1; // noppa 1–6
        scores[player] += roll;
        System.out.println("Player " + player + " rolled " + roll + " (total: " + scores[player] + ")");

        // tarkistetaan voittiko
        if (scores[player] >= winningScore && winner == -1) {
            winner = player;
        }
    }

    @Override
    public void displayWinner() {
        // näytetään voittaja
        System.out.println("Player " + winner + " wins the game!");
    }
}
