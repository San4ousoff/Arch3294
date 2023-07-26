import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Classes.ItemGenerator;
import Classes.Rewards.DiamondFabric;
import Classes.Rewards.GemFabric;
import Classes.Rewards.GoldFabric;
import Classes.Rewards.ManaFabric;
import Classes.Rewards.SilverFabric;
import Classes.Rewards.StoneFabric;
import Classes.Rewards.WoodFabric;

public class App {
    public static void main(String[] args) throws Exception {
        ItemGenerator fab1 = new GoldFabric();
        fab1.openReward();
        ItemGenerator fab2 = new GemFabric();
        fab2.openReward();
        ItemGenerator fab3 = new DiamondFabric();
        fab3.openReward();
        ItemGenerator fab4 = new ManaFabric();
        fab4.openReward();
        ItemGenerator fab5 = new SilverFabric();
        fab5.openReward();
        ItemGenerator fab6 = new StoneFabric();
        fab6.openReward();
        ItemGenerator fab7 = new WoodFabric();
        fab7.openReward();

        Random rnd = ThreadLocalRandom.current();
        List<ItemGenerator> fabricList = new ArrayList<>();
        fabricList.add(fab1);
        fabricList.add(fab2);
        fabricList.add(fab3);
        fabricList.add(fab4);
        fabricList.add(fab5);
        fabricList.add(fab6);
        fabricList.add(fab7);

        for (int i = 0; i < 20; i++) {
            //int index = Math.abs(rnd.nextInt()%2==0?0:1);
            int index = rnd.nextInt(fabricList.size());
            fabricList.get(index).openReward();
        }
    }
}
