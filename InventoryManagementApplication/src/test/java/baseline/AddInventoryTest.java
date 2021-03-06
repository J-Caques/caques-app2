package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AddInventoryTest {
    @Test
    void add(){
        String serialNumber = "A-123-4B5-6C7";
        String name = "PS5";
        String value = "$500";

        String serialNumber2 = "A-123-456-789";
        String name2 = "XBOX";
        String value2 = "$450";

        Inventory main = new Inventory();
        main.inventory.add(new ItemEntry(serialNumber,name,value));
        main.inventory.add(new ItemEntry(serialNumber2,name2,value2));

        System.out.println(main.inventory.get(0));
        System.out.println(main.inventory.get(1));
        System.out.println(main.inventory);

        Assertions.assertTrue(main.inventory.size() == 2);


    }
}