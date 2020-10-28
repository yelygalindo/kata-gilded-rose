package edu.alenasoft.gildedrose;
//Los items “Conjured" (encantados) degradan su Quality dos veces mas rapido que los items normales.

public class ConjuredBehavior implements BehaviorInterface{
    @Override
    public void updateQuality(Item item) {
        if(item.sellIn > 0) {
            item.quality -= 2;
        }else{
            item.quality -= 4;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
        item.sellIn--;
    }
}
