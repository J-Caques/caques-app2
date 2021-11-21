package baseline;
/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ClearInventoryTest {

    @Test
    void clear(){


        String serialNumber = "A-123-4B5-6C7";
        String name = "PS5";
        String value = "$500";

        String serialNumber2 = "A-123-456-789";
        String name2 = "XBOX";
        String value2 = "$450";

        Inventory main = new Inventory();
        main.inventory.add(new ItemEntry(serialNumber,name,value));
        main.inventory.add(new ItemEntry(serialNumber2,name2,value2));

        main.inventory.clear();

        //Assures that inventory is cleared out
        Assertions.assertTrue(main.inventory.size() == 0);
    }

}