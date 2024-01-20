
import java.util.HashSet;
import java.util.TreeMap;

public class AllTransaction {


    private String[][] data;

    public AllTransaction(String[][] data) {
        this.data = data;
    }


    private HashSet<String> getCategories() {
        HashSet<String> result = new HashSet<>();
        data = DataGenerator.generateData();
        for (String[] category : data) {
            result.add(category[1]);
        }
        return result;


    }

    public TreeMap<String, HashSet<Transaction>> getCetegoriesWithData() {

        TreeMap<String, HashSet<Transaction>> result = new TreeMap<>();

        for (String category : getCategories()) {

            HashSet<Transaction> products = new HashSet<>();

            for (String[] item : data) {

                if (category.equals(item[1])) {

                    products.add(new Transaction(item[0], item[1], Double.parseDouble(item[2]), Integer.parseInt(item[3])));

                }

            }
            result.put(category, products);
        }

        return result;


    }

    public TreeMap<String, TreeMap<String, Double>> getCategoriesWithProductAndTotalPrice() {

        TreeMap<String, TreeMap<String, Double>> result = new TreeMap<>();

        for (String category : getCategories()) {

            TreeMap<String, Double> products = new TreeMap<>();

            for (String[] item : data) {

                if (category.equals(item[1])) {

                    if (!products.containsKey(item[0])) {

                        products.put(item[0], Double.parseDouble(item[2]) * Integer.parseInt(item[3]));

                    } else {
                        double price = Double.parseDouble(item[2]) * Integer.parseInt(item[3]) + products.get(item[0]);
                        products.put(item[0], price);
                    }
                }
            }
            result.put(category, products);

        }

        return result;
    }

    public void printInfo() {

        TreeMap<String, HashSet<Transaction>> result = new TreeMap<>();
        result = getCetegoriesWithData();

        for (String key : getCetegoriesWithData().keySet()) {

            System.out.println(key + ":");

            for (Transaction t : result.get(key)) {
                System.out.println("       " + t.getName() + " : " + t.getToTalPrice());
            }
        }
    }

    public void printInfoWithProductAndTotalPrice() {

        TreeMap<String, TreeMap<String, Double>> result = new TreeMap<>();
        result = getCategoriesWithProductAndTotalPrice();

        for (String key : getCategoriesWithProductAndTotalPrice().keySet()) {
            System.out.println(key + ":");

            for (String _key : result.get(key).keySet()) {

                System.out.println("                " +_key + " : " + result.get(key).get(_key));
            }


        }
    }


    public String[][] getData() {
        return data;
    }

    public void setData(String[][] data) {
        this.data = data;
    }
}
