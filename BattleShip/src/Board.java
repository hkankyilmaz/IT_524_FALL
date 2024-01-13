import java.util.Arrays;
import java.util.Objects;

public class Board {


    private Player playerOne;
    private Player playerTwo;
    private int[] sizeOfBoard = new int[2];


    public Board(Player playerOne, Player playerTwo, int[] sizeOfBoard) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        if (checkBoardCoordinate(this.sizeOfBoard)) {
            this.sizeOfBoard = sizeOfBoard;
        } else {
            System.out.println("Invalid size of board");
        }

    }


    void checkAttack() {
        // Check if the attack is valid (inside the board)
        // Check if the attack is a hit or miss

        checkIsGameOver();
        // if game is not over update the coordinateOfShip attribute of the Player objects and pass the turn to the other player
        //else print the winner


    }

    void checkIsGameOver() {
        // Check if the game is over
        // If is over return true
        // If is not over return false
    }


    boolean checkBoardCoordinate(int[] sizeOfBoard) {
        // Check if the board is valid
        // If is valid return true
        // If is not valid return false
        return true;
    }


    public Player getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Player playerOne) {
        this.playerOne = playerOne;
    }

    public Player getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Player playerTwo) {
        this.playerTwo = playerTwo;
    }

    public int[] getSizeOfBoard() {
        return sizeOfBoard;
    }

    public void setSizeOfBoard(int[] sizeOfBoard) {
        this.sizeOfBoard = sizeOfBoard;
    }


    @Override
    public String toString() {
        return "Board Information \n" + "Player One: " + playerOne + " Player Two: " + playerTwo + " Size of Board: " + Arrays.toString(sizeOfBoard);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Board board)) return false;
        return Objects.equals(playerOne, board.playerOne) && Objects.equals(playerTwo, board.playerTwo) && Arrays.equals(sizeOfBoard, board.sizeOfBoard);
    }
}
