public class Transaction implements Comparable<Transaction> {

    private String name;
    private String category;
    private double price;
    private int numberOfSales;


    public Transaction(String name, String category, double price, int numberOfSales) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.numberOfSales = numberOfSales;
    }

    public double getToTalPrice() {

        return price * numberOfSales;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }


    @Override
    public int compareTo(Transaction o) {

        if (getPrice() == o.getPrice()) return 0;
        if (getPrice() > o.getPrice()) return 1;
        if (getPrice() < o.getPrice()) return -1;

        return 0;

    }
}
