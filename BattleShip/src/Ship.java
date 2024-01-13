public class Ship {

    String name;
    KindOfShip type;


    public Ship(String name, KindOfShip type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KindOfShip getType() {
        return type;
    }

    public void setType(KindOfShip type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ship Information "+"Name: "+name+" Type: "+type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Ship ship){
            return this.name.equals(ship.name) && this.type.equals(ship.type);
        }
        return false;
    }
}
