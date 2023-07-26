package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * класс создающий ману
 */
public class ManaFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Mana();
    }
    
}
