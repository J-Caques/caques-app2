package baseline;

import org.junit.jupiter.api.Test;

import java.util.Collections;

class SortInventoryTest extends Inventory{

    @Test
    void sortByName(){
        String serialNumber = "A-XXX-XXX-XXX";
        String name = "Xbox";
        String value = "$450";

        String serialNumber2 = "B-VVV-VVV-VVV";
        String name2 = "PS5";
        String value2 = "$500";

        add(new ItemEntry(serialNumber,name,value));
        add(new ItemEntry(serialNumber2,name2,value2));

        Collections.sort(inventory,ItemEntry.itemNameComparator);

        System.out.println(inventory);
    }

    @Test
    void sortByValue(){
        String serialNumber = "A-XXX-XXX-XXX";
        String name = "Xbox";
        String value = "$450";

        String serialNumber2 = "B-VVV-VVV-VVV";
        String name2 = "PS5";
        String value2 = "$500";

        add(new ItemEntry(serialNumber,name,value));
        add(new ItemEntry(serialNumber2,name2,value2));

        Collections.sort(inventory,ItemEntry.itemValueComparator);
        System.out.println(inventory);

    }

    @Test
    void sortBySerialNumber(){
        String serialNumber = "A-XXX-XXX-XXX";
        String name = "Xbox";
        String value = "$450";

        String serialNumber2 = "B-XXX-XXX-XXX";
        String name2 = "PS5";
        String value2 = "$500";

        add(new ItemEntry(serialNumber2,name2,value2));
        add(new ItemEntry(serialNumber,name,value));

        Collections.sort(inventory,ItemEntry.itemSerialNumberComparator);
        System.out.println(inventory);
    }

}