import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AtmMachine {


    private ArrayList<Transaction> transactions;

    public AtmMachine(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public double getNetCashAmount() {
        double amount = 0;

        for (Transaction transaction : transactions) {

            if (transaction.getTransactionType() == TransactionType.DEPOSIT) {
                amount += transaction.getAmount();
            } else {
                amount -= transaction.getAmount();
            }


        }

        if (amount < 0) {
            return 0;
        } else return amount;
    }

    public void withdrawCash(double amount, Account account) {


        if (getNetCashAmount() == 0 || getNetCashAmount() < amount) {
            System.out.println("Not Enough Cash");

        } else {
            transactions.add(new Transaction(account, TransactionType.WITHDRAW, LocalDateTime.now(), amount));
            System.out.println("Withdrawal " + amount + " Cash");
        }
    }

    public void depositCash(double amount, Account account) {

        transactions.add(new Transaction(account, TransactionType.DEPOSIT, LocalDateTime.now(), amount));
        System.out.println("Deposit " + amount + " Cash");
    }

    public void printAtmReport() {

        for (Transaction transaction : transactions) {
            System.out.println(transaction.toString());
        }
        System.out.println(getNetCashAmount());

    }


    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {

        String text = null;

        for (int i = 0; i < transactions.size(); i++) {
            if (i == 0) text += transactions.get(i).toString();

        }

        return text;
    }

    ;


}
