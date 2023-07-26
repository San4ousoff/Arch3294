package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * класс создающий камень
 */
public class StoneFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Stone();
    }
    
}
