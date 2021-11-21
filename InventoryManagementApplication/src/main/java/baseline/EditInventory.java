package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.util.Scanner;

public class EditInventory {

    //Creating MainInventory object to access its arrayList
    Inventory main = new Inventory();


        //method edits the name of an item
        void editName(){
            //Prompt user for original name of item
            System.out.println("Item's original name: ");
                Scanner input = new Scanner(System.in);
                String name = input.nextLine();
            //Prompt user for the new name
            System.out.println("Enter new name: ");
                Scanner input2 = new Scanner(System.in);
                String newName = input2.nextLine();


        //Finds the index that contains the variable name in its string
        int i = main.findByName(main.getInventory(), name);
        //Goes to that index, and sets it with the new name
        main.getInventory().get(i).setName(newName);
       }

       //Method that edits the value of an item
       void editValue(){
           //Prompt user for name of the item
           System.out.println("Item's name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
           //Prompt user for original value
           System.out.println("Enter Item's original value: ");
            Scanner input2 = new Scanner(System.in);
            String value = input2.nextLine();
           //Prompt user for the new value
           System.out.println("Enter new value: ");
            Scanner input3 = new Scanner(System.in);
            String value2 = input3.nextLine();

            //Finds the index that contains the variable name in its string
            int i = main.findByName(main.getInventory(), name);
            //Goes to that index, and sets it with a new name
            main.getInventory().get(i).setValue(value2);
       }

       //Method to edit Item's serial number
       void editSerialNumber(){
           //Prompt user for name of the item
           System.out.println("Item's name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
           //Prompt user for original value
           System.out.println("Enter Item's original serial number: ");
            Scanner input2 = new Scanner(System.in);
            String serialNumber = input2.nextLine();
           //Prompt user for the new value
           System.out.println("Enter new serial number: ");
            Scanner input3 = new Scanner(System.in);
            String serialNumber2 = input3.nextLine();


           //Finds the index that contains the variable name in its string
           int i = main.findByName(main.getInventory(), name);
           //Goes to that index, and sets it with a new name
           main.getInventory().get(i).setSerialNumber(serialNumber2);
       }


}
