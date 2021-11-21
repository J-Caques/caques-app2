package baseline;

import java.util.Scanner;

public class SearchInventory {
    Inventory main = new Inventory();

    void searchByName(){
        //Prompt user for item's name
        System.out.println("Enter Item's name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();

        ItemEntry entry = new ItemEntry(null,name,null);

        //Search main inventory for index that contains item name
        int i = main.findByName(main.getInventory(), name);

        //Display that index
        System.out.println(main.getInventory().get(i));
    }

    void searchBySerialNumber(){
        //Prompt user for item's name
        System.out.println("Enter Serial Number: ");
        Scanner input = new Scanner(System.in);
        String serialNumber = input.nextLine();

        //Search main inventory for index that contains the serial number
        int i = main.findBySerialNumber(main.getInventory(), serialNumber);

        //Display the index
        System.out.println(main.getInventory().get(i));
    }

}
