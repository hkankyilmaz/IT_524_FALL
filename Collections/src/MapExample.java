import java.util.HashMap;
import java.util.Map;

public class MapExample {





    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("apple", 100);
        products.put("banana", 200);
        products.put("orange", 300);


        System.out.println(products.get("apple"));


        products.keySet().forEach(key -> System.out.println(key + " " + products.get(key)));
        System.out.println(products.containsKey("apple")) ;
        System.out.println(products.size());
    }






}
