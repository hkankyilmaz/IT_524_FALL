import java.util.List;
import java.util.Set;

public  class ProductAirFryer extends Product <String,String> {


    private double capacity;
    private boolean autoShutDown;

    public ProductAirFryer(int id, String name, List<String> logs, Set<String> whoIsBuyed, double capacity, boolean autoShutDown) {
        super(id, name, logs, whoIsBuyed);
        this.capacity = capacity;
        this.autoShutDown = autoShutDown;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public boolean isAutoShutDown() {
        return autoShutDown;
    }

    public void setAutoShutDown(boolean autoShutDown) {
        this.autoShutDown = autoShutDown;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"+
                "capacity= " + capacity + '\n' +
                "autoShutDown= " + autoShutDown + '\n';
    }
}
