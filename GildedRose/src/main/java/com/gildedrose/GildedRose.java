package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void SellIn_moins_1(Item item) {
        item.sellIn = item.sellIn - 1;
    }

    public void quality_plus_1(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    public void quality_moins_1(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    


    public void updateQuality() {
        for(Item item : items) {
            switch (item.name) {

                case "Conjured" :
                    quality_plus_1(item);
                    SellIn_moins_1(item);
                    if(item.sellIn < 0) {
                        quality_moins_1(item);
                        quality_moins_1(item);
                    }
                    break;

                case "Backstage passes to a TAFKAL80ETC concert" :
                    quality_plus_1(item);
                    if (item.sellIn < 11) {
                        quality_plus_1(item);
                    }
                    if (item.sellIn < 6) {
                        quality_plus_1(item);
                    }
                    SellIn_moins_1(item);
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;
                
                case "Aged Brie" :
                    quality_plus_1(item);
                    SellIn_moins_1(item);
                    if (item.sellIn < 0) {
                        quality_plus_1(item);
                    }
                    break;
                
                case "Sulfuras, Hand of Ragnaros" :
                    break;


                
                default :
                    quality_moins_1(item);
                    SellIn_moins_1(item);
                    if(item.sellIn < 0) {
                        quality_moins_1(item);
                    }
                    break;
            }
        }
    }

    
}


