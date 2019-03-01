package rocks.zipcode.io;


import java.util.Comparator;
import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {

        private Item[] items;
        public ItemSorter(Item[] items){
        this.items = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(items,comparator);
        return items;
    }
}
