package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.util.Collections;

public class SortInventory extends Inventory {
    void sortByName(){
        Collections.sort(inventory,ItemEntry.itemNameComparator);
    }

    void sortByValue(){
        Collections.sort(inventory,ItemEntry.itemValueComparator);
    }

    void sortBySerialNumber(){
        Collections.sort(inventory,ItemEntry.itemSerialNumberComparator);
    }

}
