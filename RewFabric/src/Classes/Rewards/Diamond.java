package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий бриллиант
 */
public class Diamond implements iGameItem {

    @Override
    public void open() {
        System.out.println("Diamond!");
    }
    
}
