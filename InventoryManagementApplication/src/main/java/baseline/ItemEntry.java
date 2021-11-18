package baseline;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Define Item by it's attributes: Serial #, name, and value

public class ItemEntry {
    private final String serialNumber;
    private final String name;
    private final String value;

    public ItemEntry(String serialNumber, String name, String value) {
        Pattern pattern = Pattern.compile("\\p{Alpha}{1}-\\p{Alnum}{3}-\\p{Alnum}{3}-\\p{Alnum}{3}");
        Matcher m = pattern.matcher(serialNumber);
        boolean b = m.matches();

        if(b == false){
            throw new IllegalArgumentException("Must match A-XXX-XXX-XXX pattern.");
        }

        if (name.length() < 2 || name.length() > 256) {
            //Throw new IllegalArgumentException("Name must be 2-256 characters");
        }

        //Ensures value entered is a US dollar amount, $XX.XX
        Number number = null;
        try {
            //Takes string value to a US dollar amount; else, it sends an exception
            number = NumberFormat.getCurrencyInstance(Locale.US).parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
            //print "String must match $X.XX"
        }

        this.serialNumber = serialNumber;
        this.name = name;
        this.value = value;
    }

  /*
        Create String toString() method {
          Create StringBuilder object
          StringBuilder builder = new StringBuilder();
          Append to string item values:
            builder.append serialNumber
            builder.append name
            builder.append value

          Return single string that contains the serialNumber, name, and value all together
          return builder.toString();
        }
   */

}
