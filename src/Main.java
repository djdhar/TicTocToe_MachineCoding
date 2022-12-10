import model.Player;
import model.TicTocToeBoard;
import repo.PlayerRepository;
import service.GameService;

public class Main {
    public static void main(String[] args) {
        TicTocToeBoard board = new TicTocToeBoard(3);
        System.out.println(board);
        Player player1 = new Player(1, "Dibyajyoti", 'X');
        Player player2 = new Player(2, "Dhar", 'O');
        PlayerRepository playerRepository = new PlayerRepository();
        playerRepository.addPlayer(player1);
        playerRepository.addPlayer(player2);
        GameService gameService = new GameService(board, playerRepository.getAllPlayers());
        gameService.runGame();
    }
}