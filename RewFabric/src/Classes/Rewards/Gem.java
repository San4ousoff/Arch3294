package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий жемчужину
 */
public class Gem implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gem!");
    }
    
}
