package baseline;
import java.util.Comparator;

/*
 *  UCF COP3330 Fall 2021 Application Assignment 2 Solution
 *  Copyright 2021 Jonathan Caques
 */

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Define Item by its attributes: Serial #, name, and value

public class ItemEntry{
    private String serialNumber;
    private String name;
    private String value;

    public ItemEntry(String serialNumber, String name, String value) {

        //Ensures that serialNumber abides by A-XXX-XXX-XXX format. A being a letter; X being a letter or a number
        Pattern pattern = Pattern.compile("\\p{Alpha}{1}-\\p{Alnum}{3}-\\p{Alnum}{3}-\\p{Alnum}{3}");
        Matcher m = pattern.matcher(serialNumber);
        boolean b = m.matches();

        //If serialNumber does not match format (returns false) sends error message to user
        if(!b){
            throw new IllegalArgumentException("Must match A-XXX-XXX-XXX pattern.");
        }

        if (name.length() < 2 || name.length() > 256) {
            throw new IllegalArgumentException("Name must be 2-256 characters");
        }

        //Ensures value entered is a US dollar amount, $XX.XX
        Number number = null;
        try {
            //Takes string value to a US dollar amount; else, it sends an exception
            number = NumberFormat.getCurrencyInstance(Locale.US).parse(value);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Value must be in US dollar format, $XX.XX");
        }

        //Sets variables
        this.serialNumber = serialNumber;
        this.name = name;
        this.value = value;
    }

    public ItemEntry() {
    }

    public String getSerialNumber(){
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getValue(){
        return value;
    }

    public void setValue(String value){
        this.value = value;
    }

    //toString method to return the string of values all together.
        public String toString() {
          StringBuilder builder = new StringBuilder();

         //Append the string item values:
            builder.append (serialNumber + ", ");
            builder.append (name + ", ");
            builder.append (value);

          return builder.toString();
        }


  public static Comparator<ItemEntry> itemNameComparator = new Comparator<ItemEntry>() {
      @Override
      public int compare(ItemEntry o1, ItemEntry o2) {
          String itemName1 = o1.getName();
          String itemName2 = o2.getName();

          return itemName1.compareTo(itemName2);
      }
  };

    public static Comparator<ItemEntry> itemValueComparator = new Comparator<ItemEntry>() {
        @Override
        public int compare(ItemEntry o1, ItemEntry o2) {
            String itemValue1 = o1.getValue();
            String itemValue2 = o2.getValue();

            return itemValue2.compareTo(itemValue1);
        }
    };

    public static Comparator<ItemEntry> itemSerialNumberComparator = new Comparator<ItemEntry>() {
        @Override
        public int compare(ItemEntry o1, ItemEntry o2) {
            String itemSerialNumber1 = o1.getSerialNumber();
            String itemSerialNumber2 = o2.getSerialNumber();

            return itemSerialNumber1.compareTo(itemSerialNumber2);
        }
    };
}
