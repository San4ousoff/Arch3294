package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий ману
 */
public class Mana implements iGameItem {

    @Override
    public void open() {
        System.out.println("Mana!");
    }
    
}
