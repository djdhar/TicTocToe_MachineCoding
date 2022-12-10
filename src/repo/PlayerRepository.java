package repo;

import model.Player;
import java.util.*;

import java.util.HashMap;

public class PlayerRepository {

    Map<Character, Player> playerMap = new HashMap<Character, Player>();

    public void addPlayer(Player player) {
        if(playerMap.get(player.getPlayersymbol())==null) {
            playerMap.put(player.getPlayersymbol(), player);
            System.out.println("Successfully added player "+ player);
        } else {
            System.out.println("Cannot add player");
        }
    }

    public List<Player> getAllPlayers() {
        return new ArrayList<>(playerMap.values());
    }
}
