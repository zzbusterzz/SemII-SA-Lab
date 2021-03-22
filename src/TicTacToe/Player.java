/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicTacToe;

/**
 *
 * @author MScIT17
 */
public class Player {
    private int score = 0;
    private String playerName;
    private String playerSymbol;
    
    public int getScore() {
        return score;
    }

    public String getPlayerSymbol() {
        return playerSymbol;
    }

    public void setPlayerSymbol(String playerSymbol) {
        this.playerSymbol = playerSymbol;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    
    public Player(String playerName, String playerSymbol){
        this.playerName = playerName;        
        this.playerSymbol = playerSymbol;
    }
}
