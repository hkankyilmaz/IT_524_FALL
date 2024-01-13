public class Board {


    Player playerOne;
    Player playerTwo;
    int[] sizeOfBoard = new int[2];


    public Board(Player playerOne, Player playerTwo, int[] sizeOfBoard) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        if (checkBoard(this.sizeOfBoard)) {
            this.sizeOfBoard = sizeOfBoard;
        } else {
            System.out.println("Invalid size of board");
        }

    }


    void checkAttack() {
        // Check if the attack is valid
        // Check if the attack is a hit or miss
    }


    boolean checkBoard(int[] sizeOfBoard) {
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
}
