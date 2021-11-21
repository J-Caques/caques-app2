package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchInventoryTest {
    String serialNumber = "A-XXX-XXX-XXX";
    String name = "Samsung TV";
    String value = "$5000";

    String serialNumber2 = "B-VVV-VVV-VVV";
    String name2 = "Xbox";
    String value2 = "$450";

    Inventory main = new Inventory();


    @Test
    void searchByName(){
        //Adding the above variables to its list
        main.add(new ItemEntry(serialNumber,name,value));
        main.add(new ItemEntry(serialNumber2,name2,value2));

        int i = main.findByName(main.getInventory(), name);

        System.out.println(main.getInventory().get(i));
        Assertions.assertEquals(0, i);
    }

    @Test
    void searchBySerialNumber(){
        main.add(new ItemEntry(serialNumber,name,value));
        main.add(new ItemEntry(serialNumber2,name2,value2));

        int i = main.findBySerialNumber(main.getInventory(), serialNumber2);

        System.out.println(main.getInventory().get(i));
        Assertions.assertEquals(1, i);
    }

}