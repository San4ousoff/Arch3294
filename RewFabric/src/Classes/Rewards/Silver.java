package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий серебро
 */
public class Silver implements iGameItem {

    @Override
    public void open() {
        System.out.println("Silver!");
    }
    
}
