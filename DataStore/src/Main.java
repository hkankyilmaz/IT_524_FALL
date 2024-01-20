import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {


        AllTransaction res = new AllTransaction(DataGenerator.generateData());

        res.printInfoWithProductAndTotalPrice();

        System.out.println("--------------------------------");

        res.printInfo();



    }
}