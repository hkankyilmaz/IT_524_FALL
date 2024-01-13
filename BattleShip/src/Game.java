public class Game {


    Board board;


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
}
