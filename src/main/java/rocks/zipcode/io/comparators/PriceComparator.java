package rocks.zipcode.io.comparators;

import rocks.zipcode.io.Item;

import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class PriceComparator implements Comparator<Item> {
    public int compare(Item o1, Item o2) {
        int compareVal = (int)(o1.getPrice()*10-o2.getPrice()*10);
        return compareVal;
    }
}
