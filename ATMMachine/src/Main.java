import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Account acc0 = new Account(1234, "Bank Management");
        Account acc1 = new Account(2345, "Jack Johns");
        Account acc2 = new Account(1321, "Henry Summers");
        Account acc3 = new Account(5413, "Susan Summers");

        AtmMachine atm = new AtmMachine(new ArrayList<Transaction>());


        atm.depositCash(10000, acc0);
        atm.depositCash(50000, acc1);
        atm.depositCash(25000, acc2);

        atm.withdrawCash(34000, acc2);
        atm.withdrawCash(23000, acc3);
        atm.withdrawCash(23000, acc3);
        atm.withdrawCash(23000, acc2);

        atm.printAtmReport();
    }
}