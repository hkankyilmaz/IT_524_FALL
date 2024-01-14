import java.util.Arrays;
import java.util.Objects;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, KindOfShip ship, int[] coordinateOfShip, int[] coordinateOfBoard) {
        super(name, ship, coordinateOfShip, coordinateOfBoard);
    }

    @Override
    void play() {
        // Define the play method for HumanPlayer
        // Ask the user to enter the coordinate of the target

    }

    @Override
    void updateCoordinateOfShip() {

        // Update the coordinateOfShip attribute of the HumanPlayer object
        // when the enemy hits the ship

    }

    @Override
    public String toString() {

        return super.toString();
    }

    @Override
    public boolean equals(Object o) {

        return super.equals(o);
    }
}
