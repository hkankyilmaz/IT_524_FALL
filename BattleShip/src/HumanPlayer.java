import java.util.Arrays;
import java.util.Objects;

public class HumanPlayer extends Player {

    public HumanPlayer(String name, KindOfShip ship, int[] coordinateOfShip) {
        super(name, ship, coordinateOfShip);
    }

    @Override
    void play() {
        // Define the play method for HumanPlayer
        // Ask the user to enter the coordinate of the target

    }

    @Override
    void updateCoordinateOfShip() {

        // Update the coordinateOfShip attribute of the HumanPlayer object
    }

    @Override
    public String toString() {
        return "HumanPlayer Information \n" + "Name: " + name + " Ship: " + ship + " Coordinate of Ship: " + Arrays.toString(coordinateOfShip);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HumanPlayer humanPlayer)) return false;
        return Objects.equals(name, humanPlayer.name) && ship == humanPlayer.ship && Arrays.equals(coordinateOfShip, humanPlayer.coordinateOfShip);
    }
}
