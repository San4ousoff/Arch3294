package Classes;

/**
 * Класс клиента
 */
public class Gamer {
    private PrototypeChar prototype;
  
    public Gamer(PrototypeChar prototype) {
        this.prototype = prototype;
    }
  
    public void createAndUsePrototype() {
        PrototypeChar clonedPrototype = prototype.clone();
        System.out.println("Выбранный персонаж: " + clonedPrototype.toString());
    }
}
