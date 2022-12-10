package model;

public class Player {
    int playerId;
    String playerName;
    char playersymbol;

    public Player(int playerId, String playerName, char playersymbol) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.playersymbol = playersymbol;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public char getPlayersymbol() {
        return playersymbol;
    }

    public void setPlayersymbol(char playersymbol) {
        this.playersymbol = playersymbol;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", playersymbol=" + playersymbol +
                '}';
    }
}
