package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.util.*;

public class AddInventory extends Inventory {

    //Method that adds items to inventory list
    List<ItemEntry> addItem() {

        //Prompt user for serialNumber, name, and value
        System.out.println("Item's Serial Number: ");
        Scanner input1 = new Scanner(System.in);
        String serialNumber = input1.next();
        System.out.println("Item's Name: ");
        Scanner input2 = new Scanner(System.in);
        String name = input2.nextLine();
        System.out.println("Item's value: ");
        Scanner input3 = new Scanner(System.in);
        String value = input3.next();


        add(new ItemEntry(serialNumber, name, value));
        return getInventory();
    }
}


