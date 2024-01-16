import java.time.LocalDateTime;

public class Transaction {


    private Account account;
    private TransactionType transactionType;
    private LocalDateTime transactionTime;
    private double amount;

    public Transaction(Account account, TransactionType transactionType, LocalDateTime transactionTime, double amount) {
        this.account = account;
        this.transactionType = transactionType;
        this.transactionTime = transactionTime;
        this.amount = amount;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

    public LocalDateTime getTransactionTime() {
        return transactionTime;
    }

    public void setTransactionTime(LocalDateTime transactionTime) {
        this.transactionTime = transactionTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return account + ", transactionType: " + transactionType + ", transactionTime: " + transactionTime + ", amount: " + amount +"\n";
    }
}
