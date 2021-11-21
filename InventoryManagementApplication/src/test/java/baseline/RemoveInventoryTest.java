package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RemoveInventoryTest {

    @Test
        //Method that removes a single item from the list
    void removeItem(){

        String serialNumber = "A-XXX-XXX-XXX";
        String name = "Xbox";
        String value = "$450";

        String serialNumber2 = "B-VVV-VVV-VVV";
        String name2 = "PS5";
        String value2 = "$500";

        Inventory main = new Inventory();
        main.add(new ItemEntry(serialNumber2,name2,value2));
        main.add(new ItemEntry(serialNumber,name,value));

        int i = main.findByName(main.getInventory(), name);

        //Inventory.remove(index)
        main.getInventory().remove(i);

        int x = main.findByName(main.getInventory(), name);


        //If findName() returns -1, means the string was not found and item was successfully removed.
        Assertions.assertTrue(x == -1);
        //If item removed, inventory size would go from 2 to 1
        Assertions.assertEquals(1, main.getInventory().size());
    }



}