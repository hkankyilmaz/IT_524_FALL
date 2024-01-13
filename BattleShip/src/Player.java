import java.util.Arrays;
import java.util.Objects;

public abstract class Player {


    String name;
    KindOfShip ship;
    int[] coordinateOfShip = new int[2];
    int[] coordinateOfBoard = new int[2];

    public Player(String name, KindOfShip ship, int[] coordinateOfShip, int[] coordinateOfBoard) {
        if (checkValidCoordinateOfShip(coordinateOfBoard)){
            this.coordinateOfBoard = coordinateOfBoard;
        }else {
            System.out.println("Invalid coordinate of board");
        }
        this.name = name;
        this.ship = ship;
        this.coordinateOfShip = coordinateOfShip;
    }

    boolean checkValidCoordinateOfShip(int[] coordinateOfBoard) {
        // Check if the coordinate of the ship is valid
        // If is valid return true
        // If is not valid return false
       return true;
    }

    abstract void play(); // this method overrides the method in the subclasses


    abstract void updateCoordinateOfShip();  // this method overrides the method in the subclasses


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KindOfShip getShip() {
        return ship;
    }

    public void setShip(KindOfShip ship) {
        this.ship = ship;
    }

    public int[] getCoordinateOfShip() {
        return coordinateOfShip;
    }

    public void setCoordinateOfShip(int[] coordinateOfShip) {
        this.coordinateOfShip = coordinateOfShip;
    }

    public int[] getCoordinateOfBoard() {
        return coordinateOfBoard;
    }

    public void setCoordinateOfBoard(int[] coordinateOfBoard) {
        this.coordinateOfBoard = coordinateOfBoard;
    }

    @Override
    public String toString() {
        return "Player Information " + "Name: " + name + " Ship: " + ship + " Coordinate of Ship: " + Arrays.toString(coordinateOfShip);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Player player)) return false;
        return Objects.equals(name, player.name) && ship == player.ship && Arrays.equals(coordinateOfShip, player.coordinateOfShip);
    }


}
