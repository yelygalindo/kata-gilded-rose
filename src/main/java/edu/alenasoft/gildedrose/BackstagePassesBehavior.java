package edu.alenasoft.gildedrose;

//El item “Backstage passes", como el “Aged Brie", incrementa su Quality a medida
// que se acerca a su valor de sellIn: el Quality se duplica cuando hay 10 días o menos,
// se triplica cuando hay 5 días o menos, y se anula cuando se pasó la fecha de venta.

public class BackstagePassesBehavior implements BehaviorInterface{
    @Override
    public void updateQuality(Item item) {
        if(passDate(item)){
            item.quality = 0;
        }else if(item.quality < 50){
            Integer qualityIncrease = getQualityIncreaseBy(item.sellIn);
            item.quality += qualityIncrease;
        }
        item.sellIn--;
    }

    private Integer getQualityIncreaseBy(Integer remainingDaysBeforeExpiration) {
        if(remainingDaysBeforeExpiration <= 5) {
            return 3;
        }
        else if (remainingDaysBeforeExpiration <= 10) {
            return 2;
        }
        else {
            return 1;
        }
    }
    // Verifica si se paso la fecha
    private boolean passDate(Item item) {
        return item.sellIn <= 0;
    }
}
