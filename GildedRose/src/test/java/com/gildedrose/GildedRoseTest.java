package com.gildedrose;

import org.junit.jupiter.api.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {

  @Test
  void objet_de_base() {
    Item objet1 = new Item("foo", 0, 0);
    GildedRose app = new GildedRose(new Item[] {objet1});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void objet_de_base2() {
    Item objet2 = new Item("foo",0, 7);
    GildedRose app = new GildedRose(new Item[] {objet2});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,5);
  }

  @Test
  void objet_de_base3() {
    Item objet3 = new Item("foo", 2, 7);
    GildedRose app = new GildedRose(new Item[] {objet3});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,1);
    Assertions.assertEquals(app.items[0].quality,6);
  }

  @Test
  void objet_agedbrie1() {
    Item objet4 = new Item("Aged Brie",0,57);
    GildedRose app = new GildedRose(new Item[] {objet4});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,57);
  }

  @Test
  void objet_agedbrie2() {
    Item objet5 = new Item("Aged Brie",7,57);
    GildedRose app = new GildedRose(new Item[] {objet5});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,6);
    Assertions.assertEquals(app.items[0].quality,57);
  }


  @Test
  void objet_maudit1() {
    Item objet12 = new Item("Conjured",0,27);
    GildedRose app = new GildedRose(new Item[] {objet12});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,26);
  }

  @Test
  void objet_maudit2() {
    Item objet13 = new Item("Conjured",0,2);
    GildedRose app = new GildedRose(new Item[] {objet13});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,1);
  }

  @Test
  void objet_backstage1() {
    Item objet5 = new Item("Backstage passes to a TAFKAL80ETC concert",4,17);
    GildedRose app = new GildedRose(new Item[] {objet5});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,3);
    Assertions.assertEquals(app.items[0].quality,20);
  }

  @Test
  void objet_backstage2() {
    Item objet6 = new Item("Backstage passes to a TAFKAL80ETC concert",0,57);
    GildedRose app = new GildedRose(new Item[] {objet6});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,0);
  }

  @Test
  void objet_backstage3() {
    Item objet7 = new Item("Backstage passes to a TAFKAL80ETC concert",17,48);
    GildedRose app = new GildedRose(new Item[] {objet7});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,16);
    Assertions.assertEquals(app.items[0].quality,49);
  }
  
  @Test
  void objet_backstage4() {
    Item objet9 = new Item("Backstage passes to a TAFKAL80ETC concert",4,48);
    GildedRose app = new GildedRose(new Item[] {objet9});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,3);
    Assertions.assertEquals(app.items[0].quality,50);
  }

  @Test
  void objet_backstage5() {
    Item objet11 = new Item("Backstage passes to a TAFKAL80ETC concert",7,49);
    GildedRose app = new GildedRose(new Item[] {objet11});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,6);
    Assertions.assertEquals(app.items[0].quality,50);
  }


  @Test
  void testNameSulfuras1() {
    Item objet8 = new Item("Sulfuras, Hand of Ragnaros",180,180);
    GildedRose app = new GildedRose(new Item[] {objet8});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,180);
    Assertions.assertEquals(app.items[0].quality,180);
  }

  @Test
  void testNameSulfuras2() {
    Item objet10 = new Item("Sulfuras, Hand of Ragnaros",-1,10);
    GildedRose app = new GildedRose(new Item[] {objet10});
    app.updateQuality();
    Assertions.assertEquals(app.items[0].sellIn,-1);
    Assertions.assertEquals(app.items[0].quality,10);
  }

}
