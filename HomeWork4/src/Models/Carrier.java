package Models;

/**
 * Модель перевозчика
 */
public class Carrier {

    /*недостающие переменные*/
    private int id;
    private long cardNumber;

    /*недостающие классы*/
    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

}
