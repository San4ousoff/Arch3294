package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class DiamondFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Diamond();
    }
    
}