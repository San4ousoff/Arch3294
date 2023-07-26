package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий дерево
 */
public class Wood implements iGameItem {

    @Override
    public void open() {
        System.out.println("Wood!");
    }
    
}
