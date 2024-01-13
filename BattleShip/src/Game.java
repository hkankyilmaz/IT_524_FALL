import java.util.Objects;

public class Game {


    private Board board;


    void play() {
        // Define the play method for Game
        // Pass the turn to the playerOne
        // Pass the turn to the playerTwo
        // Repeat until the game is over
    }


    public Game(Board board) {
        this.board = board;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Game Information \n" + "Board: " + board;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Game game)) return false;
        return Objects.equals(board, game.board);
    }
}
