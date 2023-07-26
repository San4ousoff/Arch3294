package Classes;

/**
 * Класс, создающий рыцаря на основе прототипа
 */
public class Knight implements PrototypeChar {

    //public int power = 100;

    @Override
    public PrototypeChar clone() {
        return new Knight();
    }

    @Override
    public String toString() {
        return "Knight";
    }
    
}