import java.util.HashSet;
import java.util.Set;

public class SetExample {


    public static void main(String[] args) {


        Set<Person> personlist = new HashSet<>();

        Person p1 = new Person(1,"John");
        Person p2 = new Person(2,"Henry");
        Person p3 = new Person(3,"William");
        Person p4 = new Person(4,"Jack");
        Person p5 = new Person(5,"John");
        Person p6 = new Person(6,"John");
        Person p7 = new Person(7,"John");
        Person p8 = new Person(8,"John");
        Person p9 = new Person(9,"John");
        Person p10 = new Person(10,"John");



        personlist.add(p1);
        personlist.add(p2);
        personlist.add(p3);
        personlist.add(p4);
        personlist.add(p5);

        personlist.add(p6);
        personlist.add(p7);
        personlist.add(p8);
        personlist.add(p9);
        personlist.add(p10); 

        System.out.println(personlist);

        for (Person person:personlist
             ) {
            System.out.println(person);
        }






    }


}
