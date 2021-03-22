/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

import java.util.Scanner;

/**
 *
 * @author MScIT17
 */
public class TicTacToeVisual {

    private Scanner scan;
    private Player currentPlayer;

    private Player[][] tictacpositions;
    private Player winner = null;

    private Player player1 = null;
    private Player player2 = null;

    private boolean runInLoop = true;

    private int internalCount = 0;

    public void Display() {
        scan = new Scanner(System.in);
        System.out.println("Welcome to the tic tac toe,\nPlayer 1: X & Player 2: O \nTo enter your location type 11,12,13,21,...33, \nType Exit to escape \nEnter 0 to display scoreboard");

        player1 = new Player("Player 1", "X");
        player2 = new Player("Player 2", "O");

        currentPlayer = player1;

        tictacpositions = new Player[3][3];

        while (runInLoop) {
            Playround();
        }

        System.out.println("Player Score : \nPlayer 1:" + player1.getScore() + "\nPlayer 2:" + player2.getScore());
    }

    public void Playround() {
        System.out.println(currentPlayer.getPlayerName() + " : Enter your location:");

        if (scan.hasNextInt()) {
            int position = scan.nextInt();

            internalCount++;

            int xPosition = position / 10;
            int yPosition = position % 10;

            if (xPosition == 0) {
                System.out.println("Player Score : \nPlayer 1:" + player1.getScore() + "\nPlayer 2:" + player2.getScore());
            } else if (xPosition < 1 || xPosition > 3 || yPosition < 1 || yPosition > 3) {
                System.out.println("Enter a value between 1 & 3 for indices");
            } else {

                if (tictacpositions[xPosition - 1][yPosition - 1] != null) {
                    System.out.println("Location already occupied, Enter new position");
                } else {

                    tictacpositions[xPosition - 1][yPosition - 1] = currentPlayer;

                    currentPlayer = getNextPlayer();

                    DisplayCurrentVisual();

                    winner = CheckWinner();

                    if (winner == null) {
                        if (!isPlayeWinnable(currentPlayer)) {
                            if (internalCount == 7 || internalCount == 8) {
                                System.out.println("Match Drawn : ");
                                ShowNextGameOptions();
                            } else if (!isPlayeWinnable(getNextPlayer())) {
                                System.out.println("Match Drawn : ");
                                ShowNextGameOptions();
                            }
                        }
                    } else if (winner != null) {//Found winner
                        winner.setScore(winner.getScore() + 1);
                        System.out.println("Winner of the round is : " + winner.getPlayerName());
                        ShowNextGameOptions();
                    }
                }
            }
        }
    }

    public Player getNextPlayer() {
        if (currentPlayer == player1) {
            return player2;
        } else {
            return player1;
        }
    }

    public void ShowNextGameOptions() {
        System.out.println("Enter Y to play another game, other to exit");

        scan.nextLine();

        if (scan.hasNext() && scan.next().equalsIgnoreCase("Y")) {
            internalCount = 0;

            for (int i = 0; i < tictacpositions.length; i++) //Reset the position array
            {
                for (int j = 0; j < tictacpositions[i].length; j++) {
                    tictacpositions[i][j] = null;
                }
            }

            currentPlayer = player1;//Set player to 1

        } else {
            runInLoop = false;
        }
    }

    public void DisplayCurrentVisual() {
        for (int i = 0; i < tictacpositions.length; i++) {
            System.out.print("|");
            for (int j = 0; j < tictacpositions.length; j++) {
                if (tictacpositions[i][j] == null) {
                    System.out.print(" |");
                } else {
                    System.out.print(tictacpositions[i][j].getPlayerSymbol() + "|");
                }
            }
            System.out.println("");
        }
    }

    public Player CheckWinner() {
        for (int i = 0; i < tictacpositions.length; i++) {//Checks horizontal winning condition
            if (tictacpositions[i][0] != null && //if first is null, this will make sure that atleast one element is present and null comparison will be ignored
                    tictacpositions[i][0].equals(tictacpositions[i][1])
                    && tictacpositions[i][0].equals(tictacpositions[i][2])) {
                return tictacpositions[i][0];
            }
        }

        for (int i = 0; i < tictacpositions.length; i++) {//Checks vertical winning condition
            if (tictacpositions[0][i] != null
                    && tictacpositions[0][i].equals(tictacpositions[1][i])
                    && tictacpositions[0][i].equals(tictacpositions[2][i])) {
                return tictacpositions[0][i];
            }
        }

        if (tictacpositions[0][0] != null && tictacpositions[0][0].equals(tictacpositions[1][1]) && tictacpositions[0][0].equals(tictacpositions[2][2])) {
            return tictacpositions[0][0];//First diagonal
        }
        if (tictacpositions[0][2] != null && tictacpositions[0][2].equals(tictacpositions[1][1]) && tictacpositions[0][2].equals(tictacpositions[2][0])) {
            return tictacpositions[0][2];//Second diagonal
        }
        return null;
    }

    public boolean isPlayeWinnable(Player player) {
        for (int i = 0; i < tictacpositions.length; i++) {//Checks horizontal winning condition is a probability
            if ((tictacpositions[i][0] == player || tictacpositions[i][0] == null)
                    && (tictacpositions[i][1] == player || tictacpositions[i][1] == null)
                    && (tictacpositions[i][2] == player || tictacpositions[i][2] == null)) {
                return true;
            }
        }

        for (int i = 0; i < tictacpositions.length; i++) {//Checks vertical winning condition probability
            if ((tictacpositions[0][i] == player || tictacpositions[0][i] == null)
                    && (tictacpositions[1][i] == player || tictacpositions[1][i] == null)
                    && (tictacpositions[2][i] == player || tictacpositions[2][i] == null)) {
                return true;
            }
        }

        if ((tictacpositions[0][0] == player || tictacpositions[0][0] == null)
                && (tictacpositions[1][1] == player || tictacpositions[1][1] == null)
                && (tictacpositions[2][2] == player || tictacpositions[2][2] == null)) {
            return true;//First diagonal possibility
        }
        if ((tictacpositions[0][2] == player || tictacpositions[0][2] == null)
                && (tictacpositions[1][1] == player || tictacpositions[1][1] == null)
                && (tictacpositions[2][0] == player || tictacpositions[2][0] == null)) {
            return true;//Second diagonal possibility
        }
        return false;
    }
}
