package Classes;

/**
 * абстрактный класс, описывающий создание награды из абстрактного сундучка
 */
public abstract class ItemGenerator {
    /**
    * метод, описывающий создание награды
    */
    public void openReward(){
        iGameItem gameItem = createItem();
        gameItem.open();
    }
    
    public abstract iGameItem createItem();
}
