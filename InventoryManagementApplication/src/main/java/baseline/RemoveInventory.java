package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */


import java.util.List;
import java.util.Scanner;

public class RemoveInventory extends Inventory {

        //Method that removes a single item from the list
        void removeItem(List<ItemEntry> a) {
            //Prompt User for item they which to delete
            System.out.println("Item's name: ");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();


            //Finds index that matches name and saves index to variable i
            int i = findByName(a, name);
            if (i < 0) {
                System.out.println("Item does not exist");
                System.exit(0);
            } else {
                //Removes item w/ variable i, index that contained the matching name of the item
                a.remove(i);
            }
        }
}
