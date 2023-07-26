package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * класс создающий дерево
 */
public class WoodFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Wood();
    }
    
}
