package service;

import model.Player;
import model.TicTocToeBoard;

import java.util.*;

public class GameService {

    TicTocToeBoard ticTocToeBoard;
    List<Player> players;


    public GameService(TicTocToeBoard ticTocToeBoard, List<Player> players) {
        this.ticTocToeBoard = ticTocToeBoard;
        this.players = players;
    }

    public void runGame() {
        if(players.size()<=1) {
            System.out.println("Game is not possible");
            return;
        }
        while (true) {
            boolean finished = false;
            for(Player player : players) {
                System.out.println("Current Status of Board");
                System.out.println(ticTocToeBoard);
                System.out.println("Player to turn : "+ player);

                while (true) {
                    Scanner myObj = new Scanner(System.in);
                    System.out.println("Enter the row [0," + (ticTocToeBoard.getSize() - 1) + "]");
                    Integer row = myObj.nextInt();
                    System.out.println("Enter the colum [0," + (ticTocToeBoard.getSize() - 1) + "]");
                    Integer col = myObj.nextInt();
                    if (row < ticTocToeBoard.getSize() && col < ticTocToeBoard.getSize() && ticTocToeBoard.getValue(row, col)==' ') {
                        ticTocToeBoard.setValue(row, col, player.getPlayersymbol());
                        break;
                    }
                }
                System.out.println("Player "+ player +" finished turn");
                if(ticTocToeBoard.evaluate()) {
                    System.out.println("Player "+ player +" wins");
                    System.out.println("Current Board "+ ticTocToeBoard);
                    finished = true;
                    break;
                } else if(ticTocToeBoard.isFull()){
                    finished = true;
                    System.out.println("Nobody " +" wins");
                    break;
                } else {

                }
            }
            if(finished == true) break;
        }
    }
}
