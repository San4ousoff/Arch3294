package Classes.Rewards;

import Classes.ItemGenerator;
import Classes.iGameItem;

public class ManaFabric extends ItemGenerator {

    @Override
    public iGameItem createItem() {
        return new Mana();
    }
    
}
