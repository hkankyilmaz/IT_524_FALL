//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Player playerOne = new ComputerPlayer("Computer", KindOfShip.LONG, new int[]{1, 2, 3, 4}, new int[]{1, 2});
        Player playerTwo = new HumanPlayer("Human", KindOfShip.SHORT, new int[]{1, 2, 3, 4}, new int[]{1, 2});
        Board board = new Board(playerOne, playerTwo, new int[]{10, 10});


        Game game = new Game(board);
        game.play();

    }
}