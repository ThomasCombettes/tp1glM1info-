package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for(Item item : items) {
            switch (item.name) {

                case "Sulfuras, Hand of Ragnaros" :
                    break;

                
                case "Backstage passes to a TAFKAL80ETC concert" :
                    objetif (item.quality > 0) {
            item.quality = item.quality - 1;
        }
                    if (item.sellIn < 11) {
                        objetif (item.quality > 0) {
            item.quality = item.quality - 1;
        }
                    }
                    if (item.sellIn < 6) {
                        objetif (item.quality > 0) {
            item.quality = item.quality - 1;
        }
                    }
                    subSellIn(item);
                    if (item.sellIn < 0) {
                        item.quality = 0;
                    }
                    break;

                case "Aged Brie" :
                    objetif (item.quality > 0) {
            item.quality = item.quality - 1;
        }
                    subSellIn(item);
                    if (item.sellIn < 0) {
                        objetif (item.quality > 0) {
            item.quality = item.quality - 1;
        }
                    }
                    break;


                case "Conjured" :
                    objetif (item.quality > 0) {
            item.quality = item.quality - 1;
        }
                    subSellIn(item);
                    if(item.sellIn < 0) {
                        subQualityConjured(item);
                    }
                    break;

                default :
                    subQuality(item);
                    subSellIn(item);
                    if(item.sellIn < 0) {
                        subQuality(item);
                    }
                    break;
            }
        }
    }

    protected void addQuality(Item item) {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void subQuality(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }

    protected void subQualityConjured(Item item) {
        if (item.quality > 0) {
            item.quality = item.quality - 2;
        }
    }

    protected void subSellIn(Item item) {
        item.sellIn = item.sellIn - 1;
    }
}


