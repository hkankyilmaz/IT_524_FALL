import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {


    public static void main(String[] args) {
        System.out.println("Hello List!");



        List<String> names = new ArrayList<>();
        names.add("ali");
        names.add("veli");
        names.add("osman");
        names.add("hayri");

        System.out.println(names);

        names.remove(2);
        names.remove("ali");

        System.out.println(names);

        for (String name: names) {
            System.out.println(name);
        }


        List<Integer> numbers = new LinkedList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        numbers.addFirst(3);
        numbers.addLast(4);

        System.out.println(numbers);




    }





}
