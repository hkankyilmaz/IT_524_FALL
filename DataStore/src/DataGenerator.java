import java.util.TreeMap;
import java.util.TreeSet;

public class DataGenerator {


    private final String[][] data = new String[][]{
            {"Sink", "Kitchen", "250", "25"},
            {"Shirts", "Clothing", "17.10", "20"},
            {"Self Lighter", "Tools", "27.99", "40"},
            {"Pots", "Kitchen", "120", "26"},
            {"Double Bed", "Furniture", "1200", "12"},
            {"Mouse", "Electronics", "123", "17"},
            {"Mouse", "Electronics", "23", "5"},
            {"Keyboard", "Electronics", "75", "13"},
            {"Keyboard", "Electronics", "70", "10"},
            {"Sink", "Kitchen", "865", "19"},
            {"Double Sink", "Kitchen", "120", "26"},
            {"Pots", "Kitchen", "122", "10"},
            {"Sofa", "Kitchen", "1200", "6"},
            {"Self Lighter", "Tools", "27.20", "12"}


    };

    static String[][] generateData() {
        return new DataGenerator().data;
    }


}