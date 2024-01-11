import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {


        Product<String, String> pc = new ProductPc(1, "pc", new ArrayList<>(), new TreeSet<>(), "i7", "16gb", "1tb");
        Product<String, String> airFryer = new ProductAirFryer(2, "air fryer", new ArrayList<>(), new HashSet<>(), 2, true);


        pc.getLogs().add("b");
        pc.getLogs().add("b");
        pc.getLogs().add("a");


        pc.getWhoIsBuyed().add("ali");
        pc.getWhoIsBuyed().add("veli");
        pc.getWhoIsBuyed().add("ali");


        System.out.println(pc.toString());
        ((ProductPc) pc).print();


        System.out.println("finished");
        System.out.println(pc.getWhoIsBuyed());


    }

}