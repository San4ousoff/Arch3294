package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {

    /*недостающие переменные*/
    private long card;
    private long oldCard;
    private int balance;

    /*недостающие классы*/
    public long getCard() {
        return card;
    }

    public long getOldCard() {
        return oldCard;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public BankAccount() {
        this.card = oldCard + 1;
        oldCard = this.card;
        balance = 1000;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + (String.format("%016d", card)) +
                ", balance= " + balance +
                " }";
    }
}
