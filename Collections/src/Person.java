import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> {


    private int id;
    private String name;




    public Person(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Person) {
            return this.getName().equals(((Person) obj).getName()) && this.getId() == ((Person) obj).getId();
        }else return false;
    }

    @Override
    public String toString() {

        List<String> infoList = new ArrayList<>();

        infoList.add("ID: " + this.getId());
        infoList.add("Name: " + this.getName());

        return infoList.toString();

    }

    @Override
    public int hashCode() {
        return this.getId();
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.getId(), o.getId());
    }
}
