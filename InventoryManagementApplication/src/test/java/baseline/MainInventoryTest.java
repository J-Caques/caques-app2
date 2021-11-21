package baseline;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainInventoryTest {
    public final List<ItemEntry> Inventory = new ArrayList<>();
    @Test
    void print(){

        System.out.println(Inventory);
    }

}