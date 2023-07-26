package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * класс создающий золото
 */
public class GoldFabric extends ItemGenerator{

    @Override
    public iGameItem createItem() {
        return new Gold();
    }
    
}
