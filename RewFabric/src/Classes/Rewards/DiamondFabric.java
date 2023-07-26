package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

/**
 * класс создающий бриллиант
 */
public class DiamondFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Diamond();
    }
    
}