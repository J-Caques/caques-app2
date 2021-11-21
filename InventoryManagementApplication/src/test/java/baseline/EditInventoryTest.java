package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class EditInventoryTest {
    String serialNumber = "A-123-4B5-6C7";
    String name = "PS5";
    String value = "$500";

    String serialNumber2 = "A-123-456-789";
    String name2 = "XBOX";
    String value2 = "$450";

    //Creating MainInventory object to access its arrayList
    Inventory main = new Inventory();

    @Test
    void editName(){

        //Adding the above variables to its list
        main.add(new ItemEntry(serialNumber,name,value));
        main.add(new ItemEntry(serialNumber2,name2,value2));

        //Finds the index that contains the variable name in its string
        int i = main.findByName(main.getInventory(), name);
        //Goes to that index, and sets it with a new name
        main.getInventory().get(i).setName(name2);

        //Checks to see if there remains any instances of "PS5"
        int x = main.findByName(main.getInventory(), name);

        //Test that x returns -1, meaning "PS5" not found
        Assertions.assertEquals(-1, x);
    }

    @Test
    void editValue(){

        //Adding the above variables to its list
        main.add(new ItemEntry(serialNumber,name,value));
        main.add(new ItemEntry(serialNumber2,name2,value2));

        //Finds the index that contains the variable name in its string
        int i = main.findByName(main.getInventory(), name);
        //Goes to that index, and sets it with a new name
        main.getInventory().get(i).setValue(value2);

        //Checks to see if there remains any instances of "PS5"
        int x = main.findByName(main.getInventory(), value);

        //Test that x returns -1, meaning "$500" not found
        Assertions.assertEquals(-1, x);


    }

    @Test
    void editSerialNumber(){

        //Adding the above variables to its list
        main.add(new ItemEntry(serialNumber,name,value));
        main.add(new ItemEntry(serialNumber2,name2,value2));

        //Finds the index that contains the variable name in its string
        int i = main.findByName(main.getInventory(), name);
        //Goes to that index, and sets it with a new name
        main.getInventory().get(i).setSerialNumber(serialNumber2);

        //Checks to see if there remains any instances of "PS5"
        int x = main.findByName(main.getInventory(), serialNumber);

        //Test that x returns -1, meaning "$500" not found
        Assertions.assertEquals(-1, x);



    }

}