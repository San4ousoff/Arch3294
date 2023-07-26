package Classes.Rewards;

import Classes.iGameItem;

/**
 * класс открывающий золото
 */
public class Gold implements iGameItem {

    @Override
    public void open() {
        System.out.println("Gold!");
    }
    
}
