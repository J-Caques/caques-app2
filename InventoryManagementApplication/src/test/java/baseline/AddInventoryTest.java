package baseline;

import org.junit.jupiter.api.Test;

import java.util.*;

class AddInventoryTest {
    @Test
    void add(){
        String serialNumber = "A-123-4B5-6C7";
        String name = "PS5";
        String value = "$500";
        ItemEntry item = new ItemEntry(serialNumber, name, value);
        List<ItemEntry> Inventory = new ArrayList<>();
        Inventory.add(new ItemEntry(serialNumber,name,value));

        System.out.println(Inventory.get(0));


    }
}