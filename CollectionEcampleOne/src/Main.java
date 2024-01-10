import java.util.ArrayList;
import java.util.HashSet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {




        Product<String,String> pc = new ProductPc(1,"pc", new ArrayList<>(),new HashSet<>(),"i7","16gb","1tb");
        Product<String,String> airFryer = new ProductAirFryer(2,"air fryer",new ArrayList<>(),new HashSet<>(),2,true);



        pc.getLogs().add("pc is created");
        pc.getLogs().add("pc is updated");
        pc.getLogs().add("pc is deleted");


        pc.getWhoIsBuyed().add("ali");
        pc.getWhoIsBuyed().add("veli");
        pc.getWhoIsBuyed().add("ali");


        System.out.println(pc.toString());
        ((ProductPc) pc).print();




        System.out.println("finished");


















    }

}