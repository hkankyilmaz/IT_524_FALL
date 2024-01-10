import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Product<T,E> {



    private int id;
    private String name;
    private List<T> logs;
    private Set<E> whoIsBuyed;


    public Product(int id, String name, List<T> logs, Set<E> whoIsBuyed) {
        this.id = id;
        this.name = name;
        this.logs = logs;
        this.whoIsBuyed = whoIsBuyed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<T> getLogs() {
        return logs;
    }

    public void setLogs(List<T> logs) {
        this.logs = logs;
    }

    public Set<E> getWhoIsBuyed() {
        return whoIsBuyed;
    }

    public void setWhoIsBuyed(Set<E> whoIsBuyed) {
        this.whoIsBuyed = whoIsBuyed;
    }

    @Override
    public String toString() {
        return "Product" +
                "id= " + id +"\n"+
                "name= " + name + "\n"+
                "logs= " + logs +"\n"+
                "whoIsBuyed= " + whoIsBuyed+"\n";
    }
}
