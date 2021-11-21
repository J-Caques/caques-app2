package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.util.ArrayList;
import java.util.List;

public class Inventory extends ItemEntry{
    public List<ItemEntry> inventory;

    public List<ItemEntry> getInventory(){
        return inventory;
    }

    public Inventory(){
        inventory = new ArrayList<>();
    }

    public void add(ItemEntry object){
        inventory.add(object);
    }


    public String toString() {
        StringBuilder builder = new StringBuilder();

        //Append the string item values:
        builder.append (getSerialNumber() + "\t");
        builder.append (getName() + "\t");
        builder.append (getValue()+ "\t");

        return builder.toString();
    }

    public int findByName(List<ItemEntry> inventory, String name){
        for(int i = 0; i<inventory.size();i++) {
            String list = inventory.get(i).toString();
            if (list.contains(name) == true) {
                return i;
            }
        }
        return -1;
    }

    public int findBySerialNumber(List<ItemEntry> inventory, String serialNumber){
        for(int i = 0; i<inventory.size();i++){
            String list = inventory.get(i).toString();
            if(list.contains(serialNumber) == true){
                return i;
            }
        }
        return -1;
    }


}
