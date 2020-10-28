package edu.alenasoft.gildedrose;

public class StandardBehavior implements BehaviorInterface{
    @Override
    public void updateQuality(Item item) {
        if(item.sellIn == 0) {
            item.quality -= 2;
        }else{
            item.quality -= 1;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
        item.sellIn--;
    }
}
