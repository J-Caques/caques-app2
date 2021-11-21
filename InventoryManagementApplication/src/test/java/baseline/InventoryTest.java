package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryTest {
    String serialNumber = "A-XXX-XXX-XXX";
    String name = "Samsung TV";
    String value = "$5000";

    String serialNumber2 = "B-VVV-VVV-VVV";
    String name2 = "Xbox";
    String value2 = "$450";

    List<ItemEntry> inventory = new ArrayList<>();

    @Test
    public void findByName(){

        int b = 0;

        inventory.add(new ItemEntry(serialNumber2, name2, value2));
        inventory.add(new ItemEntry(serialNumber, name, value));

        for(int i = 0; i<inventory.size();i++) {
            String list = inventory.get(i).toString();
            if (list.contains(name)) {
                b = i;
            }
        }

        Assertions.assertNotEquals(0, b);
    }

    @Test
    public void findBySerialNumber(){

        int b = 0;

        inventory.add(new ItemEntry(serialNumber2, name2, value2));
        inventory.add(new ItemEntry(serialNumber, name, value));


        for(int i = 0; i<inventory.size();i++){
            String list = inventory.get(i).toString();
            if(list.contains(serialNumber)){
                b = i;
            }
        }
        Assertions.assertNotEquals(0, b);
    }

}