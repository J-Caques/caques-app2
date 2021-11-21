package baseline;
import com.google.gson.Gson;

import java.util.List;

public class JSON {

    void convertToJSON(List<ItemEntry> a) {
        Gson gson = new Gson();
        String jsonEntry = gson.toJson(a);
    }
    //convertToJson(){}
       /*
            AddInventory Object to access inventory list
            List<ItemEntry> Inventory = object.getList();

            Convert that list into a Json formatted file
        */



    //saveJsonFile(){}
        /*
            save file to computer
         */


}
