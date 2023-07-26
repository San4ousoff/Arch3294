package Classes;

/**
 * Класс, создающий волшебника на основе прототипа
 */
public class Wizard implements PrototypeChar {

//    public int mana = 200;
    
    @Override
    public PrototypeChar clone() {
        return new Wizard();
    }

    @Override
    public String toString() {
        return "Wizard";
    }
    
}
