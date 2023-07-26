package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий камень
 */
public class Stone implements iGameItem {

    @Override
    public void open() {
        System.out.println("Stone!");
    }
    
}
