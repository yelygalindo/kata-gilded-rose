package edu.alenasoft.gildedrose;
//Este Item siempre incrementa la calidad, pero la calidad no puede ser más de 50

public class AgedBrieBehavior implements  BehaviorInterface{
    @Override
    public void updateQuality(Item item) {
        if(item.quality < 50){
            item.quality++;
        }
        item.sellIn--;
    }
}
