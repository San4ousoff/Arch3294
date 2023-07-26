package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * класс создающий серебро
 */
public class SilverFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Silver();
    }
    
}
