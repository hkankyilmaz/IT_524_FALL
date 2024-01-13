import java.util.Arrays;
import java.util.Objects;

public class ComputerPlayer extends Player {


    public ComputerPlayer(String name, KindOfShip ship, int[] coordinateOfShip) {
        super(name, ship, coordinateOfShip);
    }

    @Override
    void play() {
        // Define the play method for ComputerPlayer
        // Generate a random coordinate of the target


    }

    @Override
    void updateCoordinateOfShip() {

        // Update the coordinateOfShip attribute of the ComputerPlayer object
    }


    @Override
    public String toString() {
        return "ComputerPlayer Information \n" + "Name: " + name + " Ship: " + ship + " Coordinate of Ship: " + Arrays.toString(coordinateOfShip);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ComputerPlayer computerPlayer)) return false;
        return Objects.equals(name, computerPlayer.name) && ship == computerPlayer.ship && Arrays.equals(coordinateOfShip, computerPlayer.coordinateOfShip);
    }
}
