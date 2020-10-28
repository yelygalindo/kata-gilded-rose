package edu.alenasoft.gildedrose;

public class BehaviorFactory {
    public static BehaviorInterface Create(Item item)
    {
        if (item.name.contains("Sulfuras"))
        {
            return new SulfurasBehavior();
        }
        else if (item.name.contains("Aged Brie"))
        {
            return new AgedBrieBehavior();
        }
        else if (item.name.contains("Backstage pass"))
        {
            return new BackstagePassesBehavior();
        }
        else if (item.name.contains("Conjured"))
        {
            return new ConjuredBehavior();
        }
        else
        {
            return new StandardBehavior();
        }
    }
}
